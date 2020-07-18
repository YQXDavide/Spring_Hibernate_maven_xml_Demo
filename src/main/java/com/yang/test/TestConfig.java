package com.yang.test;

public class TestConfig {
	
	private String driver;
	
	private String url;
	
	private String user;
	
	private String password;

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void print() {
		System.out.println("driver: "+driver);
		System.out.println("url: "+url);
		System.out.println("user: "+user);
		System.out.println("password: "+password);
	}
}
