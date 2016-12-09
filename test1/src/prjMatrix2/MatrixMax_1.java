package prjMatrix2;

import java.util.Arrays;

public class MatrixMax_1 {
	public static int MaxRowLength(int[][] matr){
		int matrMaxRowLength=matr[0].length;
		for(int i=0;i<matr.length;i++){
			if(matrMaxRowLength<matr[i].length)matrMaxRowLength=matr[i].length;
		}
		return matrMaxRowLength;
	}
	public static int[][] Trasp(int[][] matr,int matrMaxRowLength){
		int [][] transMatr= new int[matrMaxRowLength][matr.length];
		for(int i=0;i<matr.length;i++){
			for(int j=0; j<matr[i].length; j++){
				transMatr[j][i]=matr[i][j];
			}
		}
		return transMatr;
	}
	public static int [] matrixToMas(int[][] matr,int matrMaxRowLength ){
		int [] mas= new int[matr.length*matrMaxRowLength];
		for(int i=0;i<matr.length;i++){
			for(int j=0; j<matr[i].length; j++){
				mas[i*matrMaxRowLength+j]=matr[i][j];
			}
			}
		return mas;
	}
	public static void printMas(int [] mas){
		for(int i=0;i<mas.length;i++){
			System.out.print(mas[i]+", ");
		}
		System.out.println();
	}
	public static void masToMatrix(int []mas,int[][] matr,int matrMaxRowLength){
		for(int i=0;i<matr.length;i++){
			for(int j=0; j<matr[i].length; j++){
				matr[i][j]=mas[i*matrMaxRowLength+j];
			}
			}
	}
	public static void printMatrix(int[][] matr){
		for(int i=0;i<matr.length;i++){
			for(int j=0; j<matr[i].length; j++){
			System.out.print(matr[i][j]+"\t");
			}
			System.out.println();
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matr={	{1,20,30},
						{7,40,8},
						{60,7,8}};
		int matrMaxRowLength=MaxRowLength(matr);
		int [][]transpMatr=Trasp(matr,matrMaxRowLength);
		
		int [] mas= matrixToMas(matr, matrMaxRowLength);
		printMas(mas);
		Arrays.sort(mas);
		masToMatrix(mas, matr, matrMaxRowLength);
		printMatrix(matr);
	}

}
