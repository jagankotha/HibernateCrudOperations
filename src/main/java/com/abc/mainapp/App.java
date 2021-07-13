package com.abc.mainapp;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abc.pojo.endpoint_list;

public class App {
	public static void main(String[] args) throws IOException {
		
		Configuration cfg = new Configuration();
		cfg.configure("database/hibernate.cfg.xml").addAnnotatedClass(endpoint_list.class);
      	SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		//operations
		System.out.println("operation successfull..");
		tx.commit();//tx.rollback();
		ses.close();
		
		
 		
	/* FileWriter myWriter = new FileWriter("C:\\Users\\Dell\\Desktop\\SpringOrm\\day1\\HIbenateCRUDOperation\\src\\main\\java\\output.csv");
		 file operation program 
		File myObj1 = new File(
				"C:\\Users\\Dell\\Desktop\\SpringOrm\\day1\\HIbenateCRUDOperation\\src\\main\\java\\XACT_CallLog.csv");
		File myObj2 = new File(
				"C:\\Users\\Dell\\Desktop\\SpringOrm\\day1\\HIbenateCRUDOperation\\src\\main\\java\\new_integration_details.csv");

		 file operation end here 

		Session session = null;
		Transaction transaction = null;

		try {

			session = HibernateUtil.getSessionFactory();

			if (session != null) {

				transaction = session.beginTransaction();
				// createRecord(session);
				HashMap<String, String> hashDataBase = readData(session);

				HashMap hashMap_xact = ReadMethod(myObj1);
				// System.out.println(hashMap1);

				ArrayList<String> arrlist = ReadMethod1(myObj2);
				for (String string : arrlist) {

					String input_Split[] = string.split(",");

					//String hashmap_xactres = (String) hashMap_xact.get(input_Split[1]);
                    String hashDataBase_res = hashDataBase.get(input_Split[1]);
                    
                    String remaining = input_Split[1]+","+input_Split[0]+","+input_Split[2]+","+input_Split[3]+","+input_Split[4]+","+input_Split[5]+","+input_Split[6]+","+input_Split[7]+","+input_Split[8]+","+input_Split[9]+","+input_Split[10]+","+input_Split[11]+","+input_Split[12]+","+input_Split[13]+","+input_Split[14]+","+input_Split[15]+","+input_Split[16]+","+input_Split[17]+","+input_Split[18]+","+input_Split[19];
				    
                    String final_res= remaining+","+hashDataBase_res;
                 
                    System.out.println(final_res);
                    try {
               	     
              	      myWriter.write(final_res+" \n");
              	      //myWriter.close();
              	      //System.out.println("Successfully wrote to the file.");
              	    } catch (IOException e) {
              	      //System.out.println("An error occurred.");
              	      e.printStackTrace();
              	    } 
                   
				}

			} else {
				System.out.println("Configuration failed");
			}

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			if (session != null) {
				HibernateUtil.close();
				 myWriter.close();
			}

		}

	}

	@SuppressWarnings("unused")
	private static void deleteRecord(Session session, Transaction transaction) {
		String pkId = "IND18";
		Employee employee = session.get(Employee.class, pkId);

		if (employee != null) {

			session.delete(employee);
			transaction.commit();
			System.out.println("Record deleted for the id :" + employee.getEid());

		} else {
			System.out.println("Deletion not possible for the id: " + pkId);
		}
	}

	@SuppressWarnings("unused")
	private static void UpdateRecord(Session session, Transaction transaction) {
		String pkId = "IND10";
		Employee employee = session.get(Employee.class, pkId);
		if (employee == null) {

			Employee empRecord = new Employee();
			empRecord.setEid(pkId);
			empRecord.setEname("dhoni");
			empRecord.setEage("39");
			empRecord.setEaddress("CSK");
			session.saveOrUpdate(empRecord);
			transaction.commit();
			System.out.println("New Record inserted with the id:" + pkId);

		} else {

			employee.setEname("sachin");
			employee.setEage("49");
			employee.setEaddress("MI");

			session.update(employee);
			transaction.commit();
			System.out.println("Employee record got updated!!!");
		}
	}

	@SuppressWarnings("unused")
	private static void readRecord(Session session) {
		String pkId = "IND18";
		Employee employee = session.get(Employee.class, pkId);

		if (employee != null) {
			System.out.println("Employee is :" + employee);

		} else {
			System.out.println("Employee Record does not exists for the id :" + pkId);
		}
	}

	@SuppressWarnings("unused")
	private static void createRecord(Session session) {
		Employee employee = new Employee();
		employee.setEid("IND18");
		employee.setEname("kohli");
		employee.setEage("35");
		employee.setEaddress("RCB");
		String pkId = (String) session.save(employee);
		System.out.println("Inserted Succesfully with the id :" + pkId);
	}

	private static HashMap readData(Session session) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		//System.out.println("reading data.. ");
		org.hibernate.query.Query query = session.createQuery("from endpoint_list");
		//System.out.println(query);
		List list = query.list();
		for (Object object : list) {
			endpoint_list epl = (endpoint_list) object;

			hashmap.put(epl.getIntegration_uuid(),
					epl.getEndpoint_Name() + "," + epl.getStatus() + "," + epl.getThreshhold());

			//System.out.println(epl.getIntegration_uuid() + "," + epl.getEndpoint_Name());
		}
		return hashmap;
	}

	static HashMap ReadMethod(File myObj) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		try {

			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String inputFields[] = data.split(",");
				hashMap.put(inputFields[1], inputFields[0] + "," + inputFields[2] + "," + inputFields[3] + ","
						+ inputFields[4] + "," + inputFields[5]);

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return hashMap;
	}

	static ArrayList ReadMethod1(File myObj) {
		ArrayList<String> arrayList = new ArrayList<String>();
		try {

			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				arrayList.add(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return arrayList;
		

	}
*/
 }
}