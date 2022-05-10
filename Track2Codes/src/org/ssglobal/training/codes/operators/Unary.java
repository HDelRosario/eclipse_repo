package org.ssglobal.training.codes.operators;

public class Unary {
	
	public void loopWithCounterVarPost(){
		int counter = 0;
		int counterVar = 0;
		while(counterVar < 10) {
			System.out.println(counterVar);
			counterVar = counter++;
		}
	}
	
	public void loopWithoutCounterVarPost() {
		
		int counter = 0;
		while (counter < 10) {
			System.out.println(counter);
			counter++;
		}
	}
	
	public void loopWithoutCounterVarPre() {
		
		int counter = 0;
		while (counter < 10) {
			System.out.println(counter);
			++counter;
		}
	}
	
	public void loopWithCounterVarPre(){
		int counter = 0;
		int counterVar = 0;
		while(counterVar < 10) {
			System.out.println(counterVar);
			counterVar = ++counter;
		}
	}
}
