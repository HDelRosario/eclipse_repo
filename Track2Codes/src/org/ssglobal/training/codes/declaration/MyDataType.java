package org.ssglobal.training.codes.declaration;

public class MyDataType {
	
	//global variables - can't declare this outside a class
	public static final double PIE = 3.141617; //constants can be class variable
	//if the variable name is italicized = it is a class variable (class Var)
	public static long versionId = 1L;
	public static String creature = "vertebrate";
	public static int error_level = 0;
	//not important to the process - placeholder/legend/marker
	//not part of algorithm but contributes to characteristics of the program
	
	public byte counter;
	public short numProducts;
	public int numCells;
	public long numTcells;
	
	public float weight;
	public double billGatesMoney;
	
	public char letter;
	public String personName = ""; // to prevent null

	public void createVars() {
		//local variables
		int age = 0;
		float salary;
		final float MY_PIE = 90.6F;
		//this is a constant, can't be overwritten
		
		System.out.println(counter);
		//this has a default values
		System.out.println(age);
		//local variables must be assigned default values
		System.out.println(personName);
		System.out.println(letter);
	}
	
	public void manageArguments(float weight, byte counter) {
		//float weight and byte counter are local parameters
		//if you want it to be constants, add "final" but 
		//we don't capitalize it (if it is a local parameter)
		//you can have a constant local parameters
		weight = 10.0F;
		System.out.println(weight);
	}
	
	public void createBlockVarsThruIf(int option) {
		
		//int err_val;
		//outer scope should be followed
		//the block variable should not 
		//be the same with outer scope local variable
		
		if (option == 0) {
			int err_val = 10; // this is block variable
			option = option + err_val;
			System.out.println(option);
		} else {
			int otherwise_val = -10;
			option = option + otherwise_val;
			System.out.println(option);
		}
	}
	
	public void createBlockVarsThruLoop(int[] ids) {
		
		for(int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
		
	}
	
	public void createBlockVarsThruSwitch() {
		
		switch(option) {
			case 1:
				float amount1 = 1000.50F;
				System.out.println(1);
				break;
			case 2:
				float amount2 = 2000.50F;
				System.out.println(2);
				break;
			default:
				System.out.println(-1);
				break;
		}
	}
	
	public void assignLiterals() {
		//integral types
		counter = 127; //within the range - 128, 127
		numProducts = 32000; //within the range
		numCells = 787878787; //when int is out of range, it does not recommend long, because long is improvised by Java
		numTcells = 78787878787L; //you cast this int to L = 
		                          //caused problem: coercion (bias to int type)
		                          //Perl: '2' + 2 == '4'
		                          //JavaScript = '2' + 2 = '22'
		                          //===
		//real number types
		billGatesMoney = 999999999999999999.89; // double: default type of real number
		weight = 89.5F; //add F to prevent coercion
		
		//character literal types
		
		//ASCII - 127 characters
		letter = 'H';
		System.out.println(letter);
		
		//Numerical value - coercion
		letter = 0; //it means null/empty
		System.out.println(letter);
		letter = 68; //coercion applies to ASCII only
		System.out.println(letter);
		letter = 128; //outputs ? because it is limited to 127 characters - alternative: UTF8
		System.out.println(letter);
		
		//Unicode characters (UTF-8) - hexadecimal form, must be quoted
		letter = '\u20B1'; //until 65000 only
		System.out.println(letter); // outputs ₱
		
		letter = '\u00F1'; 
		System.out.println(letter); // outputs ñ
		
		//String literals
		personName = "Juan Luna\n";
	}
	
	public void literalConversion() {
		numProducts = 10; // identity conversion
		
		//widening conversion
		int amount = 32000; //widening - implicit casting
		//int amount = (int) 32000; --- no need to add (int)
		double salary = 67800; 
		//double salary = (double) 67800; --- no need to add (double)
		
		//narrowing conversion
		byte param = (byte) 128;
		System.out.println(param);
		//output does not make sense
		
		//there is casting because of coercion
		float price = (float) 89.6;
		System.out.println(price);
	}
}

class TestMyDataType{
	
	public static void main(String[] args) {
		//this is an instance variable
		MyDataType mdt = new MyDataType();
		System.out.println(mdt.billGatesMoney);
		System.out.println(MyDataType.PIE);
		//this is a class variable so to call it: classname.operator)
		mdt.manageArguments(89.6F,(byte) 0);
		mdt.manageArguments(75.6F,(byte) 7);
		mdt.createBlockVarsThruLoop(new int[]{10, 20, 45, 89});
		mdt.createVars();
		mdt.assignLiterals();
		mdt.literalConversion();
	}

}

