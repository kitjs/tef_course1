package WorkInConsole;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainWorkInTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("c:\\in\\333.txt"));
        Apple []mas= new Apple[sc.nextInt()];
        for (int i = 0; i < mas.length; i++) {
			mas[i]=new Apple(sc.nextInt(), sc.next());
		}
        for (int i = 0; i < mas.length; i++) {
			mas[i].print();
		}
        sc.close();
	}

}
