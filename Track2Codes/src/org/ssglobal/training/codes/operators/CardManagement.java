package org.ssglobal.training.codes.operators;

public class CardManagement {
	
	public void pickCards() {
		
		final int MAX_CARDS = 5;
		int counter = 0;
		while(counter < MAX_CARDS) {
			int cardnum = (int) (Math.random() * 52) + 1;
			System.out.println(cardnum);
			counter++;
		}
	}
}
