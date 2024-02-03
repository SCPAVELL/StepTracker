package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StepTracker tracker = new StepTracker();

		while (true) {
			printMenu();
			int i = scanner.nextInt();
			if (i == 1) {
				tracker.addNewNumberStepsPerDay();
			} else if (i == 2) {
				tracker.changeStepGoal();
			} else if (i == 3) {
				tracker.printStatistic();
			} else if (i == 4) {
				System.out.println("Вы отлично поработали!");
				break;
			} else {
				System.out.println("Выберите команду от 1-4!");
			}
		}
	}

	static void printMenu() {
		System.out.println("1 - Введите количество шагов за определённый день.");
		System.out.println("2 - Изменить цель по количеству шагов в день.");
		System.out.println("3 - Напечатать статистику за определённый месяц.");
		System.out.println("4 - Выйти из приложения.");
	}
}
