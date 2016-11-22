package jul;

import java.io.IOException;

public class test1 {

	public static void task2(){
		// task2

		int i = 1;

		while (i < 12) {
			System.out.println(i);
			i++;
		}
		// task3 сокращенная форма от вайл-пока еще

		{		
			for(int a =1; a<88; a++){
				System.out.println(a);
							}
			
			//вверху-циклы с прелусловием
			//внизу- с постусловиями
			
			
			{
				int m=1;
				do{System.out.println(m);
				m++;}
				while(m<10);		
			}
			
	}
	}
	public static void task1(){
		// task 1
				int month = 3;
				switch (month) {
				case 1:
				case 2:
					System.out.print("winter");
					break;
				case 3:
				case 4:
				case 5:
					System.out.print("spring");
					break;
				case 6:
					System.out.print("summer");
					break;

				default:
					System.out.println("error");
				}		
	}

	public static void task3() throws IOException {
		
		//task 5
		
		char answer;
		do {
			System.out.println("kupi slonika [y/n]");
			answer =(char) System.in.read();
			
		} while (answer!='y');
		System.out.println("no");
	}
	
	public static void besconechnuy() throws IOException{
		
		char ans;
		while(true) {
			System.out.println("vvedite 1-3. if close set y.dlua vihoda nazhmite y");
			ans =(char) System.in.read();
			switch(ans){
			case '1' : task1();break;
			case '2':task2();break;
			case'3': task3();break;
			case'y': task3();break; //return
			default: System.out.println("error");
			}
					}}
	
	public static void task4() throws IOException{		
		char ans;
		do {
			System.out.println("vvedite 1-3. if close set y");
			ans =(char) System.in.read();
			switch(ans){
			case '1' : task1();break;
			case '2':task2();break;
			case'3': task3();break;
			
			}
		}
		 while (ans!='y');
		System.out.println("Exit!");
		}
	public static void task6(){
		
		//task1
		for (int k=1; k<100; k++)
		{
			if (k%2!=0){
				System.out.println(k);
			}else {}
	}}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		//task2
		{
		
		int	n=7;
		int fact=1;
		for(int v=1;v<=n;v++){
			fact = fact*v;
		}
		System.out.println(fact);
		}
	}
		
	}
				
		
	

	
