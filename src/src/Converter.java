package src;

import java.util.HashMap;

public class Converter {

	void convertToKm(HashMap<Integer, Integer> hashMap) {
		double sumSteps = 0;
		int stepLength = 75;
		int kiloСalories = 100000;
		for (Integer entry : hashMap.values()) {
			sumSteps += entry;
		}
		System.out.println("Вы прошли: " + ((sumSteps * stepLength) / kiloСalories) + " км.");
	}

	void convertStepsToKilocalories(HashMap<Integer, Integer> hashMap) {
		double sumSteps = 0;
		int stepLength = 50; 
		int caloriesPerStep = 1000;
		for (Integer entry : hashMap.values()) {
			sumSteps += entry;
		}
		System.out.println("Вы сожгли: " + ((sumSteps * stepLength) / caloriesPerStep) + " килокалорий.");
	}

}
