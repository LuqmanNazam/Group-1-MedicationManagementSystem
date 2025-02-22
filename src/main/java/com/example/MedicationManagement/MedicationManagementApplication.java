package com.example.MedicationManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicationManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicationManagementApplication.class, args);
	}

	/*
	* 	How to Test

		Open your browser and navigate to http://localhost:8080/h2-console. - This is for the database

		Enter the following details to connect to the H2 database:
		JDBC URL: MedicationManagementApplication
		Username: luke
		Password: (leave blank).

		Click Test and then Connect to access the H2 console.

		Use postman to test the API*/

}
