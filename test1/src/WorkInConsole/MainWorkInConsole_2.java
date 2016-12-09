package WorkInConsole;

import java.util.Scanner;

public class MainWorkInConsole_2 {

	public static void main(String[] args) {
		int[] mas = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elem of mas");
		for (int i = 0; i < mas.length; i++) {
			System.out.println("Enter elem of mas" + i);
			while(!sc.hasNextInt()){				
					sc.nextLine();
					System.out.println("Not int try again");}
			mas[i] = sc.nextInt();
			}
		
       for (int i = 0; i < mas.length; i++) {
		System.out.print(mas[i]+", ");
	}
	}

}
