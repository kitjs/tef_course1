package Recursion_Sortirovka;

import java.util.Arrays;

public class MainRecursion_2 {
	
	// n!=n*(n-1)!
	static int fact1(int n){
		if(n==0||n==1) return 1;
		int myFact=1;
		for(int i=2;i<=n;i++){
			myFact=i*myFact;
		}
		return myFact;
	}
	static int fact2(int n){
		if(n==0||n==1) return 1;
		return n*fact2(n-1);
	}
	// F(n)=F(n-1)+F(n-2)
	static int fib1(int n){
		if(n==0||n==1) return 1;
		int z=1,y=1,x=1;
		for(int i=2; i<=n;i++){
			z=y+x;
			x=y;
			y=z;
		}
		return z;
	}
	static int fib2(int n){
		if(n==0||n==1) return 1;
		return fib2(n-1)+fib2(n-2);
	}
	static void bubblesort(int [] mas){
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length-1; j++) {
				if(mas[j]>mas[j+1]){
					int temp = mas[j];
					mas[j]= mas[j+1];
					mas[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {

		int[] mas={2,3,46,-4,3,-6,3,-67,-3};
		int sum=0;
		for(int i=0; i<mas.length;i++){
			if(mas[i]<0)sum=sum+mas[i];
		}
		
//		for (int elem : mas) {
//			if(elem<0)sum=sum+elem;
//		}
		int myMax=mas[0], myMin=mas[0];
		int iMax=0, iMin=0;
		for (int i = 0; i < mas.length; i++) {
			if(myMax<mas[i]){myMax=mas[i]; iMax=i;}
			if(myMin>mas[i]){myMin=mas[i]; iMin=i;}
		}
		int multy=1;
		if(iMin<iMax)
		for (int i = iMin+1; i < iMax; i++) {
			multy=multy*mas[i];
		}
		else
			for (int i = iMax+1; i < iMin; i++) {
				multy=multy*mas[i];
			}
		System.out.println("multy= "+multy);
		
	//	bubblesort(mas);
		Arrays.sort(mas);
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]+", ");
		}
	}
}
