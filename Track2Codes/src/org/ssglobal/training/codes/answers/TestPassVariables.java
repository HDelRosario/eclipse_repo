package org.ssglobal.training.codes.answers;

public class TestPassVariables {

	public static void main(String[] args) {
		
		PassVariables cv = new PassVariables();
		
		//Primitive Var
		int testX = 10;
		System.out.format("This is the original num is %d . \n", testX);
		cv.passPrimitive(testX);
		System.out.format("This new num is %d. \n", testX);
		
		// sb[12356644ABCD] ==> 12356644ABCD("Manila")
		//Reference Var
		StringBuilder testSb = new StringBuilder("Manila");
		//this is an object-this is also an object
		//not assignment, == here is point to at
		//you can't assign another memory address to another memory address
		System.out.format("This is the original sb is %s . \n", testSb);
		cv.passRefVar(testSb);
		System.out.format("This new sb is %s. \n", testSb);
		//System.out.println(sb.getClass());
		
		String testStr = new String("Manila");
		System.out.format("This is the original str is %s . \n", testStr);
		cv.passStrVal(testStr);
		System.out.format("This is the new tesStr is %s. \n", testStr);
				
			
	}

}
