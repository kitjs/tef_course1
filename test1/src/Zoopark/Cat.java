package Zoopark;

public class Cat {
	String name;
	int weight;
	int year;

	void print(){
		System.out.println("name ="+name+" weight ="+weight);
	}
	void eat(Mouse foodCat){
		System.out.println(name+" eating "+foodCat.weight+
							" name of foodCat "+foodCat.name);
		weight=weight+foodCat.weight;
		foodCat.weight=0;
	}
	void say(String word){
		System.out.println("Cat say "+word);
	}
}
