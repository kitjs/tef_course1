package Zoopark;

public class Mouse {
String name;
int weight;
int year;

void print(){
	System.out.println("name ="+name+" weight ="+weight);
}
void eat(int food){
	System.out.println(name+" eating "+food);
	weight=weight+food;
}
void say(String word){
	System.out.println("Mouse say "+word);
}

}
