package org.sing;

public class HDFCDataBase {
	private String userId;
	private boolean password;
	public void setUserId(String userId) {
		this.userId = userId;
		if(userId.equals("muni@123")) {
		this.userId="valid muni";
	}
	else if(userId.equals("raj@346")) {
		this.userId="valid raj";
	}
	else if(userId.equals("ram@4455")) {
		this.userId="valid ram";
	}
	else {
		this.userId="invalid user id";
	}
	
	}
	public void setPassword(int password) {
		if(password==1234 &&  userId.equals("valid muni")) {
			this.password=true;
		}
		else if(password==5678 && userId.equals("valid raj")) {
			this.password=true;
		}
		else if(password==9988 && userId.equals("valid ram")) {
		this.password=true;
		}
	else {
		this.password=false;
	}
	}
	public String getUserId() {
		if(userId.equals("valid muni") && password==true) {
		return"muni account authorised";
	}
		else if(userId.equals("valid raj")&& password==true) {
			return"raj account authorised";
		}
		else if(userId.equals("valid ram") && password==true) {
			return"ram account authorised";
		}
		else {
			return"account unauthoruised";
		}
	}
	public int  getPassword() {
		
		if(getUserId().equals("muni account authorised")) {
		return 40000;
		}
	
		else if(getUserId().equals("raj account authorised")) {
		return 500000;
		}
		else if(getUserId().equals("ram account authorised")) {
		return 60000;
	    }
		else {
			return 0;
			
		}	
	}	
			
}	
			
			
			
			
			
			
		


