package Massive;

public class MainMas {
    public static int task1Min(int []arr){    	
		int myMin=arr[0];		
		for(int i=0; i<arr.length;i++){
			if(myMin>arr[i])myMin=arr[i];			
		}	
		System.out.println(myMin);
		return myMin;
    }
    public static int task1Max(int [] mas){
    	int myMax=mas[0];
		for(int i=0; i<mas.length;i++){			
			if(myMax<mas[i])myMax=mas[i];
		}
		System.out.println(myMax);
		return myMax;
    }

    public static void changeMinMaxInArray(int []mas ){
    	int myMin=task1Min(mas);
		int myMax=task1Max(mas);
    	for (int i = 0; i < mas.length; i++) {
			if(myMin==mas[i]) mas[i]=myMax;		
			else
			if(myMax==mas[i]) mas[i]=myMin;
		}
    }
    public static void changeXtoYInArray(int []mas ,int x, int y){    	
    	for (int i = 0; i < mas.length; i++) {
			if(x==mas[i]) mas[i]=y;		
			else
			if(y==mas[i]) mas[i]=x;
		}
    }
    public static void printArray(int [] mas){
    	for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]+", ");
		}
    }
    public static double averageOfElemArray(int [] mas){
    	int sum=0;
		for(int i=0;i<mas.length;i++){
			sum=sum+mas[i];
		}
		double aver= (double)sum/mas.length;		
		return aver;
    }
	public static void main(String[] args) {
		int [] mas={6,8,6,9,56,78,876};
		int myMin=task1Min(mas);
		int myMax=task1Max(mas);
		changeMinMaxInArray(mas);
		changeXtoYInArray(mas, myMin, myMax);
		printArray(mas);
		double aver=averageOfElemArray(mas);
		System.out.println(aver);		
	}
}
