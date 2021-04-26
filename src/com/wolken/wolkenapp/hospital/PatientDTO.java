package com.wolken.wolkenapp.hospital;

public class PatientDTO {
	private String name;
	private int patientId;
	private int cost;
	private String doctorName;
	
	public PatientDTO(){ // Constructor
		System.out.println(this.getClass().getSimpleName());
	}
    
	public String getName() { // getters
		return name;
	}
	
	public void setName(String name){ //setters
		this.name = name;
	}
	
	 public int getPatientId() {
		 return patientId;
	 }
	 
	 public void setPatientId(int patientId) {
		 this.patientId = patientId;
	 }
	 
	 
	 
	public String getDoctorName() {
		return doctorName;
	}
	 
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getCost() {
		 return cost;
	 }
	 
	 public void setCost(int cost) {
		 this.cost = cost;
	 }
}
