package com.wolken.wolkenapp.hospital;

import java.util.Scanner;

public class HospitalUtil {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		
		Hospital hospital = new Hospital(size);
		/*static
		PatientDTO patientDTO = new PatientDTO();
		patientDTO.setName("Megha");
		patientDTO.setDoctorName("Sushmitha");
		patientDTO.setPatientId(32);
		patientDTO.setCost(5000);
		hospital.addPatients(patientDTO);
		*/
		 for(int i=0; i< size; i++) {
			 System.out.println("Enter the paitent name ");
			 String name =  scanner.next();
			 
			 System.out.println("Enter the patient ID ");
			 int patientId = scanner.nextInt();
			 
			 System.out.println("Enter the Doctor name");
			 String doctorName = scanner.next();
			 
			 System.out.println("Enter the cost ");
			 int cost = scanner.nextInt();
			 
			 PatientDTO patientDTO = new PatientDTO();
			 patientDTO.setName(name);
			 patientDTO.setPatientId(patientId);
			 patientDTO.setDoctorName(doctorName);
			 patientDTO.setCost(cost);
			 
			 hospital.addPatients(patientDTO);
			
		 }
		 hospital.getPatientDetails();
		 
		// PatientDTO patientDTO = hospital.get
		 
		PatientDTO patientDTO = hospital.getPatientNameByPatientId(5);
		System.out.println(patientDTO.getName());
		
		PatientDTO patientDTO1 = hospital.updateCostByDoctorName("Megha",5000);
		System.out.println(patientDTO1.getCost());
		
		hospital.getPatientDetails();
		hospital.deletePatientByPatientId(5);
		hospital.getPatientDetails();
		
		}


}
