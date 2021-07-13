package com.abc.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.abc.pojo.endpoint_list;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static Session session;
	static {

		sessionFactory = new Configuration().configure("database/hibernate.cfg.xml").addAnnotatedClass(endpoint_list.class).buildSessionFactory();

	}

	public static Session getSessionFactory() {

		 session = sessionFactory.openSession();
		return session;
	}
	
	public static void close() {
		
		if (sessionFactory!=null) {
			session.close();
		}
		
	}

}
