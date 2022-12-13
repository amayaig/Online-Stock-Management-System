package com.customer;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String phone;
	private String username;
	private String pw;
	public Customer(int id, String name, String email, String phone, String username, String pw) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.pw = pw;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getUsername() {
		return username;
	}
	public String getPw() {
		return pw;
	}
	
	
	
	
}	 