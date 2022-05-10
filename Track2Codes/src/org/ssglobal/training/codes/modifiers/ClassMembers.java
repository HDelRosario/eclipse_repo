package org.ssglobal.training.codes.modifiers;

public class ClassMembers {
	
	//static variables
	public static long id = 1L;
	double salary = 100.5;
	protected int key = 68638453;
	private char letter = 'v'; //should be used immediately
	
	//instance variables
	public int age = 10;
	
	//methods
	public void showData() {
		id = 2L;
		salary = 5000.5;
		key = 855885;
		letter = 'h';
	}
	
	void printData() {
		
	}
	
	protected void authenticate() {
		
	}
	
	private void encryptData() {
		
	}
	
	public void reference() {
		showData();
		printData();
		authenticate();
		encryptData();
	}
	
	//anywhere in the class, public variables are accessible
}
