package org.ssglobal.training.codes.answers;

public class PassVariables {
	
	public void passPrimitive(int number) {
		number = 100;
		System.out.format("The new number %d, \n", number);
	}
	
	public void passRefVar(StringBuilder sb) {
		sb.append(" in the Philippines");
		System.out.format("The new sb is %s, \n", sb.toString());
	}
	
	public void passStrVal (String str) {
		str = "Pasig";
		System.out.format("The new str is %s, \n", str);
	}
}
