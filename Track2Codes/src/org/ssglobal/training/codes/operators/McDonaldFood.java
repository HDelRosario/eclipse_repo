package org.ssglobal.training.codes.operators;

import java.io.IOException;

public class McDonaldFood {
	
	public void showMenu() {
		//shows options first
		do {
			System.out.println("[a] Burger");
			System.out.println("[b] Spaghetti");
			System.out.println("[c] French Fries");
			System.out.println("[d] Drinks");
			System.out.println("[f] Sundae");
			System.out.println("[q] Quit");
			System.out.println("Enter your food option:");
			
			try {
				char choice = (char) System.in.read();
				if (choice == 'e' || choice == 'E') {
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}	
		} while (true);
	}
}
