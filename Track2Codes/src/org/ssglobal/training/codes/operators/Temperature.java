package org.ssglobal.training.codes.operators;

public class Temperature {
	public float chooseTemperature(int option) {
		float temperature = 0.0F;
		if (option == 0) {
			temperature = 50.0F;
		} else if (option == 1) {
			temperature = 60.0F;
		} else if (option == 2) {
			temperature = 70.0F;
		} else if (option == 3) {
			temperature = 80.0F;
		}
		return temperature;
	}
	
	public float chooseTemperatureSwitch(int option) {
		float temperature = 0.0F;
		
		switch(option) {
			case 0: 
				temperature = 50.0F;
				break;
			case 1:
				temperature = 60.0F;
				break;
			case 2:
				temperature = 70.0F;
				break;
			case 3:
				temperature = 80.0F;
				break;
		}
		
		return temperature;
	}
	
	public String chooseColor(int option) {
		String color = "";
		
		switch(option) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				color = "RED";
				break;
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				color = "BLUE";
				break;
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
				color = "GREEN";
				break;
			default:
				color = "COLORLESS"; //it's okay to put this on top or even midway
				break;
		}
		return color;
	}
}
