package prjMatrix2;

import java.util.Scanner;

class Apple{
	int weight;
	String name;
	Apple(int weight, String name){
		this.weight=weight;
		this.name=name;
	}
	public void print(){
		System.out.println("Apple: "+name+", "+weight);
	}
}

public class MainWorkInnConsoleObject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of apple(int)");
		if(!sc.hasNextInt()){System.out.println("error nubmber not int. good buy");return;}
		int number=sc.nextInt();
		Apple [] masApple= new Apple[number];
        for (int i = 0; i < masApple.length; i++) {
        	System.out.println("apple="+i);
        	System.out.println("weight=");
        	int weight=sc.nextInt();
        	System.out.println("name=");
        	String name=sc.next();
			masApple[i]= new Apple(weight, name);
		}
        for (int i = 0; i < masApple.length; i++) masApple[i].print(); 
	}

}
