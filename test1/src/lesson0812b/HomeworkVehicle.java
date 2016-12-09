package lesson0812b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Vehicle{
	
	int price;
	int speed;
	int year;
	String name;
	
	Vehicle(String name, int price, int speed, int year ) {
		
		this.price=price;
		this.speed=speed;
		this.year=year;
		this.name=name;
	}
}

class Plane extends Vehicle {
	int high;		
	public Plane(String name , int price, int speed, int year,  int high){		
		super(name,price,speed,year);
		this.high=high;
	}
}

class Ship extends Vehicle {
	int numberOfPassagers;	
	Ship(String name,int price, int speed, int year,  int numberOfPassagers) {
		super(name,price, speed, year);
		this.numberOfPassagers=numberOfPassagers;		
	}	
}

class Car extends Vehicle{
	int port ; 
	Car(String name, int price, int speed, int year, int port) {
		super(name, price, speed, year);
    	this.port=port;
	}
		
}

public class HomeworkVehicle {		
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//massive with objects
		Scanner sc = new Scanner(new File("D:\\Work_course_Idea\\in\\vehicle.txt"));
		
	//	Vehicle car = new Car("car1",5,5,3,5);
	//			Vehicle plane = new Plane ("plane2",5,1,3,1);
	//					Vehicle ship = new Ship("ship",5,3,1,1);
						
						
		Vehicle car1 = new Car(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());			
		Vehicle plane1 = new Plane(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		Vehicle ship1 = new Ship(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		Vehicle car2 = new Car(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());		
		Vehicle plane2 = new Plane(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		Vehicle ship2 = new Ship(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		Vehicle car3 = new Car(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());			
		Vehicle plane3 = new Plane(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		Vehicle ship3 = new Ship(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		//massive with cars
		
				Vehicle[] veh=new Vehicle[9];
				
		for(int i=0; i<9;i++){
			veh[i]=new Vehicle("veh"+i, (int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10));
			System.out.println(veh[i].name+" "+veh[i].speed+" ");
		}
		
		System.out.println(car1.name);
		System.out.println(car2.speed);
		System.out.println(car3.year);
		
		System.out.println(plane1.name);
		System.out.println(plane2.speed);
		System.out.println(plane3.year);
		
		System.out.println(ship1.name);
		System.out.println(ship2.price);
		System.out.println(ship3.year);
		
		sc.close();
		
		
	}
}
