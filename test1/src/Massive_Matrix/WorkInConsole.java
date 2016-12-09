package Massive_Matrix;

import java.util.Scanner;

public class WorkInConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mas= new int[10];
		double [] masD= new double[10];
		System.out.println();
		
		second(masD);
	}
	
	
	
	public void first(int [] mas){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter word");
		for(int i=0;i<mas.length;i++){
			System.out.println("Enter elem mas "+ i);
			while(!sc.hasNextInt()){
			    sc.nextLine();
				System.out.println("not int");}
			
		mas[i]=sc.nextInt();
			
		}
		for(int i=0;i<mas.length;i++){
			System.out.println(mas[i]+" , ");}}
	
	public static void second(double [] masD){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter word");
		
		
		for(int i=0;i<masD.length;i++){
			System.out.println("Enter elem mas "+ i);
			
			
			while(!sc.hasNextDouble()){
			    sc.nextLine();
				System.out.println("not double");}
			if(sc.nextDouble()<5&&-5<sc.nextDouble()){
				System.out.println("-5<x>5");
				
			}
		masD[i]=sc.nextInt();
			
		}
		for(int i=0;i<masD.length;i++){
			System.out.println(masD[i]+" , ");}}
	
}
