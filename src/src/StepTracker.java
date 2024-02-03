package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StepTracker {

	MonthData monthData = new MonthData();
	Converter converter = new Converter();
	Scanner scanner = new Scanner(System.in);
	int goalByStepsPerDay = 10000;
	HashMap<Integer, HashMap<Integer, Integer>> monthToData;

	public StepTracker() {
		monthToData = new HashMap<>();
	}

	void addNewNumberStepsPerDay() {

		System.out.println("Введите номер месяца");// ввод и проверка номера месяца
		int month = scanner.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("Ошибка! Введите значения от 1 - 12.");
			return;
		}

		System.out.println("Введите день от 1 до 30 (включительно)");// ввод и проверка дня
		int day = scanner.nextInt();
		if (day < 1 || day > 30) {
			System.out.println("Ошибка! Введите значения от 1 - 30.");
			return;
		}

		System.out.println("Введите количество шагов");// ввод и проверка количества шагов
		int steps = scanner.nextInt();
		if (steps <= 0) {
			System.out.println("Ошибка! Введите значения больше 0.");
			return;
		}

		if (!monthToData.containsKey(month)) {
			monthToData.put(month, new HashMap<>());
		}
		monthToData.get(month).put(day, steps);

	}

	void changeStepGoal() {
		System.out.print("Введите следующую цель: ");
		goalByStepsPerDay = scanner.nextInt();
		if (goalByStepsPerDay < 100) {
			System.out.println("Цель не может быть меньше 100!");
			return;
		}
		System.out.println("Цель:" + goalByStepsPerDay + " успешно задана!");
	}

	void printStatistic() {
		System.out.println("Введите число месяца");// ввод и проверка номера месяца

		int month = scanner.nextInt(); // monthData = // получение соответствующего месяца
		if (month < 1 || month > 12) {
			System.out.println("Ошибка! Введите значения от 1 - 12.");
			return;
		}
		
		if (monthToData.get(month) == null) {
			System.out.println("В данный момент этот месяц пуст, пожалуйста введите значения!");
			return;
		}
		monthData.printDaysAndStepsFromMonth(monthToData.get(month)); // вывод общей статистики по дням
		monthData.sumStepsFromMonth(monthToData.get(month)); // получение суммы шагов за месяц
		monthData.maxSteps(monthToData.get(month)); // вывод максимального пройденного количества шагов за месяц
		monthData.average(monthToData.get(month));// вывод среднего пройденного количества шагов за месяц
		converter.convertToKm(monthToData.get(month));// вывод пройденной за месяц дистанции в километрах
		converter.convertStepsToKilocalories(monthToData.get(month));// вывод количества сожжённых килокалорий за месяц
		monthData.bestSeries(goalByStepsPerDay, monthToData.get(month)); // вывод лучшей серии
		System.out.println(); // дополнительный перенос строки

	}

}
