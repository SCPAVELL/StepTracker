package src;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MonthData {

	// вывод элементов массива в нужном формате
	void printDaysAndStepsFromMonth(HashMap<Integer, Integer> hashMap) {
		for (int i = 1; i < 31; i++) {

			if (hashMap.get(i) == null) {
				hashMap.put(i, 0);
				System.out.println(i + " день: " + "...");
			} else {
				System.out.println(i + " день: " + hashMap.get(i));
			}
		}
		System.out.println();// для отступа
	}

	// подсчёт суммы шагов за месяц
	int sumStepsFromMonth(HashMap<Integer, Integer> hashMap) {
		int sumSteps = 0;
		for (Integer entry : hashMap.values()) {
			sumSteps += entry;
		}
		System.out.println("За месяц вы сделали: " + sumSteps + " шага(ов)!");
		return sumSteps;
	}

	// максимальное количество шагов за месяц
	int maxSteps(HashMap<Integer, Integer> hashMap) {
		int maxSteps = 0;
		for (Integer entry : hashMap.values()) {
			if (maxSteps < entry) {
				maxSteps = entry;
			}
		}
		System.out.println("Ваше максимальное количество шагов за месяц составило: " + maxSteps + ", Вы молодец!");
		return maxSteps;
	}

	// среднее количество шагов за месяц
	int average(HashMap<Integer, Integer> hashMap) {
		int average = 0;
		for (Integer entry : hashMap.values()) {
			average += entry;
		}
		average /= hashMap.size();
		System.out.println("Ваше среднее количество шагов за месяц составило: " + average + ", Вы молодец!");
		return average;
	}

	// поиск максимальной серии
	int bestSeries(int goalByStepsPerDay, HashMap<Integer, Integer> hashMap) {
		int currentSeries = 0;
		int finalSeries = 0;
		for (Integer entry : hashMap.values()) {
			if (entry >= goalByStepsPerDay) {
				currentSeries++;
				if (currentSeries > finalSeries) {
					finalSeries = currentSeries; // обновляем finalSeries, если текущая серия длиннее предыдущей
				}
			} else {
				currentSeries = 0; // сбрасываем текущую серию, если не достигнута цель
			}
		}
		System.out.println("Ваша лучшая серия составила: " + finalSeries + " дня(ей)!");
		return finalSeries;
	}

}
