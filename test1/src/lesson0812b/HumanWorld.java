package lesson0812b;

class Human{
	private String name;
	private int year;	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Human(String name, int year){
		this.name=name;
		this.year=year;
	}
	public Human(){
		name="Anonim";
		year=0;
	}
	public void eat(){ System.out.println("I'm eating");}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " i'm Human";
	}
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
	
	@Override
	public String toString() {		
		return " student: "+getName()+", "+getYear()+", "+numGroup;
	}
}
class Doctor extends Human{
	private int idLicense;
	
	public int getIdLicense() {
		return idLicense;
	}

	public void setIdLicense(int idLicense) {
		this.idLicense = idLicense;
	}

	public Doctor(String name, int year, int idLicense) {
		super(name, year);
		this.idLicense = idLicense;
	}

	public void cure(){System.out.println("i'm curing");}

	@Override
	public String toString() {
		return "Doctor [idLicense=" + idLicense + ", name=" + getName() + ", year=" + getYear() + "]";
	}	
}
class Veterinar extends Doctor{
	private int animalType;
	public Veterinar(String name, int year, int idLicense,int animalType) {
		super(name, year, idLicense);
		this.animalType=animalType;
	}
	public int getAnimalType() {
		return animalType;
	}
	public void setAnimalType(int animalType) {
		this.animalType = animalType;
	}
	@Override
	public String toString() {
		return "Veterinar [animalType=" + animalType + ", toString()=" + super.toString() + "]";
	}

	
	
}
class Fighter extends Human{
	private int power;
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public Fighter(String name, int year, int power) {
		super(name, year);
		this.power = power;
	}
	public void fight(){ System.out.println("i'm fighting");}
	@Override
	public String toString() {
		return "Fighter [power=" + power + ", getName()=" + getName() + ", getYear()=" + getYear() + "]";
	}
}

public class HumanWorld {

	public static void main(String[] args) {
		Human stud1 = new Student("Vasya", 25, 1);
		Human doc1= new Doctor("AiBolit",66,3);
		Human fight1= new Fighter("BrusLi", 77, 100);
        
		Human [] people= new Human[4];
		people[0]=stud1;
		people[1]=doc1;
		people[2]=fight1;
		people[3]= new Veterinar("Vet", 84, 54, 1);
		Human maxYearHuman= people[0];
		for (int i = 0; i < people.length; i++) {
			if(maxYearHuman.getYear()<people[i].getYear())maxYearHuman=people[i];
			System.out.println(people[i]);
		}
		System.out.println(maxYearHuman);
	}

}
