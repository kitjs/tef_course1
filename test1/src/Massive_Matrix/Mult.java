package Massive_Matrix;


class Matrix {
	Row[] matrix;
}

class Row {
	Elem[] row;
}

class Elem {
	public int value;
	public int irow;
	public int jcol;

	public Elem(int value, int irow, int jcol) {
		this.value = value;
		this.irow = irow;
		this.jcol = jcol;
	}

	public void print() {
		System.out.println("min elem of matrix[" + this.irow + "][" + this.jcol + "]= " + this.value);

	}
}

public class Mult {
	public static void generateMatrix(int[][] multiplyTab) {
		for (int i = 0; i < multiplyTab.length; i++) {
			for (int j = 0; j < multiplyTab[i].length; j++) {
				multiplyTab[i][j] = (int) (Math.random() * 200 - 100);
			}
		}
	}

	public static void printRow(int[][] multiplyTab, int irow) {
		for (int j = 0; j < multiplyTab[irow].length; j++) {
			System.out.print(multiplyTab[irow][j] + "\t");
		}

	}

	public static void main(String[] args) {
		// создаем двумерный массив 5 на 6
		int[][] multiplyTab = new int[5][6];
		generateMatrix(multiplyTab);
		for (int i = 0; i < multiplyTab.length; i++) {
			printRow(multiplyTab, i);
			System.out.println();
		}
		Elem[] arrayMinMatrix = new Elem[multiplyTab.length];
		int myMin = multiplyTab[0][0];
		int irow = 0, jcol = 0;
		// цикл по первой размерности(строки)
		for (int i = 0; i < multiplyTab.length; i++) {
			// ----------- до обработки всех €чеек i-строки
			myMin = multiplyTab[i][0];
			irow = i;
			jcol = 0;
			// цикл по второй размерности(€чейки=столбцы)
			for (int j = 0; j < multiplyTab[i].length; j++) {
				// обработка j - €чейки i-строки
				if (myMin > multiplyTab[i][j]) {
					myMin = multiplyTab[i][j];
					irow = i;
					jcol = j;
				}
				// ----------------------------
			}
			// ------------ действи€ после обработки всех €чеек i-строки
			arrayMinMatrix[i] = new Elem(myMin, irow, jcol);
			System.out.println("min elem of matrix[" + irow + "][" + jcol + "]= " + myMin);
			// ------------------------------------
		}
		for (int i = 0; i < arrayMinMatrix.length; i++) {
			arrayMinMatrix[i].print();
		}

	}
}
