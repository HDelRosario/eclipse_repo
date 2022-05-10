package org.ssglobal.training.codes.modifiers;

public class TestFinalMembers extends FinalMembers{

	public static void main(String[] args) {
		
		FinalMembers fm = new FinalMembers();
		System.out.println(fm.PIE); //can be accessed on another class
		fm.accessWithoutOverride();

	}
	
	public void accessWithoutOverride() {
		System.out.println("Hello World!");
		//we can't override final members
	}
	
	public void accessPoint() {
		accessWithoutOverride();
	}

}
