package Recursion_Sortirovka;

class Goods{
	int price;
	String name;
	
	Goods(String name, int price){
		this.name=name;
		this.price=price;
	}
}

public class MainSortObj {

	public static void main(String[] args) {
		Goods gd1=new Goods("phone",100);
		Goods[] masGoods= new Goods[3];
		masGoods[0]= new Goods("bag",1000);
		masGoods[1]= new Goods("pen",10);
		masGoods[2]=gd1;
		Goods myMaxPrice=masGoods[0];
		for (int i = 0; i < masGoods.length; i++) {
			if(myMaxPrice.price<masGoods[i].price){
				myMaxPrice=masGoods[i];
			}
		}
       System.out.println("Name= "+myMaxPrice.name+" price ="+myMaxPrice.price);
	}

}
