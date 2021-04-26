package com.wolken.wolkenapp.hospital;

public class Hospital {
	public PatientDTO[] patientDTO;
	public int index;
	
	public Hospital(int size) {
		patientDTO = new PatientDTO[size];
	}
	 public void addPatients(PatientDTO patientDTO) {
		 if(patientDTO != null) {
			 System.out.println("Patients are added to the Hospital");
			    this.patientDTO[index++]= patientDTO; 
		 }
		 else {
			 System.out.println("Patient object is null .. cannot add details");
		 }
	 }
		 
		 public void getPatientDetails() {
			 for(int i=0; i < patientDTO.length; i++) {
				 if(patientDTO[i] != null) {
					 System.out.println(patientDTO[i].getName() +" "+
										 patientDTO[i].getPatientId() +" "+
										 patientDTO[i].getDoctorName() +" "+
										 patientDTO[i].getCost());
							 }
				 else {
					 System.out.println("details not found");
				 }
				
			 }
	    }
		  public PatientDTO getPatientNameByPatientId(int patientId) {
			  PatientDTO patientDTO = null;
			  for(int i=0;i<this.patientDTO.length;i++) {
				  if(this.patientDTO[i]!=null) {
					  if(this.patientDTO[i].getPatientId() == patientId ) {
						  patientDTO = this.patientDTO[i];
						  
					  }
					  else {
						  System.out.println("No patient found");
					  }
					  
				  }
			  }
			  return patientDTO;
			 
		  }
		  public PatientDTO updateCostByDoctorName(String doctorName, int cost) {
				PatientDTO patientDTO = null;
				for(int i=0; i < this.patientDTO.length;i++) {
					if(this.patientDTO[i] != null) {
						if(this.patientDTO[i].getDoctorName().equalsIgnoreCase(doctorName)) {
							this.patientDTO[i].setCost(cost);
							patientDTO= this.patientDTO[i];
					}
				}
					else {
						System.out.println("No patients Found");
					}
				
				}
				return patientDTO;
				
			}
			// to delete data
			public void deletePatientByPatientId(int patientId) {
				for(int i=0; i<patientDTO.length;i++) {
					if(this.patientDTO[i]!=null) {
						if(this.patientDTO[i].getPatientId() == patientId) {
							this.patientDTO[i] = null;
							System.out.println("deleted");
							
						}
					}
					else {
						System.out.println("No paitents found");
					}
				}
				
			}
			
}
