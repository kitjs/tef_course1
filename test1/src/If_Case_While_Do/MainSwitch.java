import java.io.IOException;

public class MainSwitch {
	public static void task1(){
		// print from 1 to 100
		{
			int i = 1;
			while (i <= 100) {
				System.out.println(i);
				i++;
			}
		}
	}
	public static void task2(){
		// print from 100 to 1
		{
			int i = 100;
			while (i > 0) {
				System.out.println(i);
				i--;
			}
		}
	}
	public static void task3(){
		for(int i=1;i <= 100;i++ ){
	    	System.out.println(i);
	    }
	}
	public static void task4(){
		for(int i=100;i>0;i--){
	    	System.out.println(i);
	    }
	}
	public static void task5(){
		int i=1;
	    do{
	    	System.out.println(i);
	    	i++;
	    }while(i<=100);
	}
	public static void task6()throws IOException {
		char answer;
	    do{
	    System.out.println("Kypi slonika [y/n]");	
	    answer=(char)System.in.read();
	    }while(answer!='y');
	    System.out.println("Good bye. Your buy slonika - 100000$");
	}
	public static void menu1() throws IOException{
		 char answer;	    
	    do{
	    	System.out.println("Enter variant of task 1-6.Exit [y]");
	    	answer=(char)System.in.read();
	    	System.in.skip(2);
	    	switch(answer){
	    	case '1':task1();break;
	    	case '2':task2();break;
	    	case '3':task3();break;
	    	case '4':task4();break;
	    	case '5':task5();break;
	    	case '6':task6();break;
	    	}
	    	
	    } while(answer!='y');
	    System.out.println("Exit");
	}
	public static void menu2() throws IOException{
		 char answer;	    
	    while(true){
	    	System.out.println("Enter variant of task 1-6.Exit [y]");
	    	answer=(char)System.in.read();
	    	System.in.skip(2);
	    	switch(answer){
	    	case '1':task1();break;
	    	case '2':task2();break;
	    	case '3':task3();break;
	    	case '4':task4();break;
	    	case '5':task5();break;
	    	case '6':task6();break;
	    	case 'y': System.out.println("Exit"); return; 
	    	default : System.out.println("error answer");
	    	}	    	
	    } 	    
	}
	public static int myMax(int x, int y){
		if(x>y) return x;
		else return y;
	}
	public static void main(String[] args) throws IOException  {
	   menu2();
	}

}
