package Recursion_Sortirovka;

public class Zadachi_Recursion {

	
	public static void main(String[] args) {
		
		System.out.println(factorial(7));
	}

	
	static int factorial(int n){
		
		if(n==0||n==1)
		
		{return 1;}
		
		int fact= n*(factorial(n-1));
		
		return fact;
	}

	
 static int factorial2(int n){
	
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


	
}
