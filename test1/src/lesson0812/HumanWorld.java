package lesson0812;

class Human{
	private String name;
	private int year;
	public Human(String name, int year){
		this.name=name;
		this.year=year;
	}
	public Human(){
		name="Anonim";
		year=0;
	}
	public void eat(){ System.out.println("I'm eating");}
}
class Student extends Human{	
	private int numGroup;
	public int getNumGroup() {
		return numGroup;
	}
	public void setNumGroup(int numGroup) {
		this.numGroup = numGroup;
	}
	public Student(String name, int year, int numGroup){
		super(name,year);		
		this.numGroup=numGroup;
	}
	public void study(){System.out.println("I'm study");}	
}
class Doctor extends Human{
	private int idLicense;
	public void cure(){System.out.println("i'm curing");}
}
class Fighter extends Human{
	private int power;
	public void fight(){ System.out.println("i'm fighting");}
}

public class HumanWorld {

	public static void main(String[] args) {
		Student stud1 = new Student("Vasya", 25, 1);
		System.out.println(stud1.getNumGroup());
		stud1.setNumGroup(2);
		System.out.println(stud1.getNumGroup());

	}

}
