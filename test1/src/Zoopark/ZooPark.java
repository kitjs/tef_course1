package Zoopark;

public class ZooPark {

	public static void main(String[] args) {
	//	int a=1;
		Mouse mouse1=new Mouse();
		mouse1.name="Jerry";
		mouse1.weight=2;
		mouse1.year=5;
		mouse1.print();
		mouse1.eat(1);
		mouse1.print();
		
		Mouse mouse2=new Mouse();
		mouse2.name="Mickey";
		mouse2.weight=3;
		mouse2.year=6;
		mouse2.print();
		
		System.out.println(mouse1.equals(mouse2));
		System.out.println(mouse1.name.equals(mouse2.name));
		
		Cat cat1= new Cat();
		cat1.name="Tom";
		cat1.weight=5;
		cat1.year=10;
		cat1.print();
		cat1.eat(mouse1);
		
		cat1.eat(mouse2);
		
		cat1.print();
		mouse1.print();
		mouse2.print();
	}

}
