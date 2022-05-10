package org.ssglobal.training.codes.operators;

public class Conditionals {
	
	//char test1 = 0;
	//test1 = 'a';
	
	public void createConditions() {
		
		float amount1 = 100.2F;
		float amount2 = 110.5F;
		boolean ce1 = amount1 == amount2;
		System.out.println(ce1);
		if (ce1) {
			System.out.println("amount1 is equal to amount2");
		} else {
			System.out.println("amount1 is not equal to amount2");
		}
		
		char test1 = 'a';
		char test2 = 'b';
		boolean ce2 = test1 >= test2; // test1 should come last after test2
		if (ce2) {
			System.out.println("test1 comes last after test2");
		} else {
			System.out.println("test1 comes first before test2");
		}
		
		// <, >=, <=, != (for primitive only)
	}
	
	public void createComplexCondition() {
		//examples of logical expressions
		byte data = 10; //within 50 and 100
		boolean le1 = data >= 50 & data <= 100; //bitwise AND
		if (le1) {
			System.out.println("within the range");
		} else {
			System.out.println("Invalid data");
		}
		
		//Problem: sickLeave (boolean) renderOT (boolean)
		char sickLeave = 'S'; // S=sick leave, V=vacation leave, X = No leave
		char withOT = 'N'; // Y=OT, N=no OT
		int approval = 0;
		//boolean le2 = sickLeave == 'S' || withOT++ == 'Y' || approval++ < -1; #this is a short circuit
		boolean le2 = sickLeave == 'S' | withOT++ == 'Y' | approval++ < -1; //sickleave should be superior 
		System.out.println(le2);
		System.out.println(withOT);
		System.out.println(approval);
		//bitwise OR (evaluates the others) - avoid using bitwise (because it executes the other conditions of OR)
		//short circuit OR (||)= once true cuts evaluation - faster that's why it's famous
	
	}
	
	public void createTernary() {
		
		int choice = 35;
		// [0 - 10] -> RED
		// (10 - 20] -> BLUE
		// (20 - 30] -> GREEN
		
		String color = (choice >= 0 && choice <= 10)? "RED" :
			           (choice > 10 && choice <= 20)? "BLUE": 
			           (choice > 20 && choice <= 30)? "GREEN" : "COLORLESS";
		System.out.println(color);
	}
	
	public void applyShiftOps() {
		// << left shift operator
		
		int counter = 1;
		int se1 = counter << 5;
		
		// 1  = 1 x 2^0 = 0001
		// 2  = 1 x 2^1 = 0010
		// 4  = 1 x 2^2 = 0100
		// 8  = 1 x 2^3 = 1000
		// 16 = 1 x 2^4 = 10000
		// 32 = 1 x 2^5 = 100000
		
		System.out.println(se1);
		
		counter = se1;
		
		// >> right shift operator
		int se2 = counter >> 5;
		
		// 32 =  32 / 2^0 = 100000
		// 16 =  32 / 2^1 = 010000
		// 8  =  32 / 2^2 = 001000
		// 4  =  32 / 2^3 = 000100
		// 2  =  32 / 2^4 = 000010
		// 1  =  32 / 2^5 = 000001
		
		System.out.println(se2);
	}
}
