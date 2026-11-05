package com.jdbc_advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;




public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String URL = "jdbc:mysql://localhost:3306/mydata";
		String username = "root";
		String password = "Swathisri@96";
		
		//String query = "insert into person values(101, 'swathi' , 98, 22 )";
		 //String query = "delete from person where id = 101";
		String query = "update person set marks = 100";
		//stage 1 
		try {
			Connection connection = DriverManager.getConnection(URL, username, password);
			
			//stage 2
		Statement st = connection.createStatement();
		
		//stage 3
		        int num = st.executeUpdate(query);
		        System.out.println(num + " updated...");
		
		   //stage 5
		        connection.close();
		        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
