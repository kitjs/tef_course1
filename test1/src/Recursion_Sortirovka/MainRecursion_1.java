package Recursion_Sortirovka;


public class MainRecursion_1 {
	
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
	//static int fib1(int n){
	//	if(n==0||n==1) return 1;
	//	int z=1,y=1,x=1;
	//	for(int i=2; i<=n;i++){
	//		z=y+x;
	//		x=y;
	//		y=z;
	//	}
	//	return z;
	//}
	
		
	static int fib2(int n){
		if(n==0||n==1) return 1;
		return fib2(n-1)+fib2(n-2);
	}
	public static void main(String[] args) {

		System.out.println(fact1(6));
		
		
	//	int[] mas={2,3,46,4,3,6,3,67,3};
		
	//	for (int i = 0; i < mas.length; i++) {
	//		for (int j = 0; j < mas.length-1; j++) {
	//			if(mas[j]>mas[j+1]){
	//				int temp = mas[j];
	//				mas[j]= mas[j+1];
	//				mas[j+1]=temp;
	//			}
	//		}
	//	}
		
		
	//	for (int i = 0; i < mas.length; i++) {
	//		System.out.print(mas[i]+", ");
	//	}
		
		
	}
}
