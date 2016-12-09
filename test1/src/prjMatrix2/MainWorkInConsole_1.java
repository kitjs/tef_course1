package prjMatrix2;

import java.util.Scanner;

public class MainWorkInConsole_1 {

	public static void main(String[] args) {
		int[] mas = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elem of mas");
		for (int i = 0; i < mas.length; i++) {
			System.out.println("Enter elem of mas" + i);
			int value = 0;
			while (true) {
				while (!sc.hasNextInt()) {
					sc.nextLine();
					System.out.println("Not int try again");

				}
				value = sc.nextInt();
				if (value > -5 && value < 5)
					break;
				System.out.println("wrong range");
			}
			mas[i] = value;
			
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
	}

}
