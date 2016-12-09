package lesson0612;
class Currency{
	public static double USD;
}
class Fruits{
	public static int count;	
	public int myCount;
	private double price;
	public String type;
	
	public Fruits(double price,String type){
		
		this.price=price;
		this.type=type;
	}
	public void setPrice(double price){
		this.price= price/Currency.USD;
	}
	public double getPrice(){ return price*Currency.USD*120;}
	public static int getCount(){return count;}
}
class Orange extends Fruits{
String orangeType;
	
public Orange(double price, String type,String orangeType) {
		super(price, type);
		this.orangeType=orangeType;
	}
	/*public Orange() {
		count++;
		System.out.println("Orange= "+count);
	}*/
}
class Lemon extends Fruits{
	public Lemon(){
		super(10, "Lem");
		count++;
		System.out.println("Lemon= "+count);
	}
}
class Apple extends Fruits{
	
	Apple(double price, String type){
		super(price, type);
		count++;
		myCount=count;
		System.out.println("Apple= "+count);
		this.setPrice(price);
		this.type=type;
	}
	
	
}
public class MainHumanWorld {
   
	public static void main(String[] args) {
	
	//	MainHumanWorld mhw = new MainHumanWorld();
	//	mhw.main(args);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		Apple.count=0;
		Apple.getCount();
		Currency.USD=26;
		System.out.println(Apple.count);
		Apple [] mas= new Apple[10];
		 for (int j = 0; j < 10; j++) {
			mas[j]=new Apple(10,"App");			
		}
		 Lemon lem = new Lemon();
		
		 Orange orange= new Orange(5, "Oran", "Citrus");
		 System.out.println(Fruits.count);
		 Currency.USD=30;
       for (int i = 0; i < mas.length; i++) {
		System.out.println(mas[i].getPrice());
	}
	}

}
