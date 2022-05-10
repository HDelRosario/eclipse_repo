package org.ssglobal.training.codes.answers;

import org.ssglobal.training.codes.modifiers.ClassMembers;

public class TestClassMembers extends ClassMembers{

	public static void main(String[] args) {
		
		ClassMembers cm = new ClassMembers();
		cm.age = 4L;
		cm.showData();
		
		cm.salary; //since this is not the same package as class members, you can't access it
		
	}
	
	public void accessPoint() {
		
	}

}
