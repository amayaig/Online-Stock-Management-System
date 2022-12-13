package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBUtil {
	public static List<Customer> validate(String username, String pw) {
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		//create database connection
		
		String url= "jdbc:mysql://localhost:3306/hotel";
		String user = "root";
		String password = "";
		
		
		//validate(To show the error, without terminating the program)
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			
			String sql = "Select * from customer where username = '"+username+"' and pw='"+pw+"'";
			
			ResultSet rs = stmt.executeQuery(sql); 
			
			if(rs.next()) {                       //(next)a boolean method, if true or false
				int id = rs.getInt(1);
				String name = rs.getString(2);     //Take the relevant data of the user,(if true /if the user name and the password are valid)
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userU = rs.getString(5);
				String passU = rs.getString(6);
				
				Customer c = new Customer(id, name, email, phone, userU, passU); //values which were taken from the database
				cus.add(c);  //passing the "c" object to the array list "cus" object
			}
		}	
		catch(Exception e) {
			e.printStackTrace();  //print the error
			
		}
		
		return cus;
	}
}
