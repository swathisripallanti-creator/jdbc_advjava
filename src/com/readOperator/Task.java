package com.readOperator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String URL = "jdbc:mysql://localhost:3306/mydata";
		String username = "root";
		String password = "Swathisri@96";
		
		//String query = "insert into person values(102, 'subbu', 90, 23)";
		//String query = "insert into person values(103, 'aishu', 99,22)";
		String query = "select * from person";
		
		//stage 1
		try {
			Connection connection = DriverManager.getConnection(URL, username, password);
			
			//stage 2
			Statement st = connection.createStatement();
			
			//stage 3
			ResultSet rs = st.executeQuery(query);
			
			//stage 4
			System.out.println("ID \t Name \t Marks \t Age ");
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int marks = rs.getInt(3);
				int age = rs.getInt(4);
				
				System.out.println(id + "\t" + name + "\t" + marks + "\t" + age );
			}
			//stage 5 
			connection.close();
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
