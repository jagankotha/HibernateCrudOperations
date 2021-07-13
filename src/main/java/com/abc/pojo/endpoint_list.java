package com.abc.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="endpoint_list")
public class endpoint_list {
 
	@Id
	private String Integration_uuid;
	private String Endpoint_Name;
	private String Status;
	private int Threshhold;
	public String getIntegration_uuid() {
		return Integration_uuid;
	}
	public void setIntegration_uuid(String integration_uuid) {
		Integration_uuid = integration_uuid;
	}
	public String getEndpoint_Name() {
		return Endpoint_Name;
	}
	public void setEndpoint_Name(String endpoint_Name) {
		Endpoint_Name = endpoint_Name;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getThreshhold() {
		return Threshhold;
	}
	public void setThreshhold(int threshhold) {
		Threshhold = threshhold;
	}
	@Override
	public String toString() {
		return "endpoint_list [Integration_uuid=" + Integration_uuid + ", Endpoint_Name=" + Endpoint_Name + ", Status="
				+ Status + ", Threshhold=" + Threshhold + "]";
	}
	
	
}
