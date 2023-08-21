// Jake Dobler C211 Aug, 21 2023
import java.util.Scanner;

public class Vehicle {
	public String type;
	private int numberOfWheels;
	private int year;
	private String color;
	private  Scanner scan = new Scanner(System.in);
	
	public Vehicle(String type, int numberOfWheels,
			int year, String color) {
		this.type = type;
		this.numberOfWheels = numberOfWheels;
		this.year = year;
		this.color = color;
	}
	
	public Vehicle() {
		this.type = "";
		this.numberOfWheels = 0;
		this.year = 0;
		this.color = "";
	}
	
	public void input() {
		System.out.println("What is the type of vehicle?");
		this.type = scan.nextLine();
		System.out.println("What is the color on the " + this.type + "?");
		this.color = scan.nextLine();
		System.out.println("And how many wheels does the " + this.color + " " + 
				this.type + " have?");
		this.numberOfWheels = scan.nextInt();
		System.out.println("And what year is this " + this.numberOfWheels + " wheeled " 
				+ this.color + " " + this.type + "?");
		this.year = scan.nextInt();
	}
	
	public void output() {
		System.out.println("Type: " + this.type + "\nNumber of Wheels: " + this.numberOfWheels
				+ "\nYear: " + this.year + "\nColor: " + this.color);
	}
	
	public String toString() {
		return "A " + this.color + " " + this.year + " " 
				+ this.type + " with " + this.numberOfWheels + " wheels";
	}
	
	public boolean isBigger(Vehicle vehicle2) {
		if(this.numberOfWheels > vehicle2.numberOfWheels) {
			return true;
		}
		return false;
	}
	
	public boolean isNewer(Vehicle vehicle2) {
		if(this.year > vehicle2.year) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Vehicle();
		vehicles[1] = new Vehicle("saab 93", 4, 2005, "gray");
		vehicles[2] = new Vehicle();
		vehicles[2].input();
		outputArray(vehicles);
		
		if(vehicles[0].isBigger(vehicles[1])) {
			System.out.println( vehicles[0].toString() + " is larger than " + vehicles[1].toString());
		} else {
			System.out.println( vehicles[0].toString() + " is not larger than " + vehicles[1].toString());
		}
		if(vehicles[0].isNewer(vehicles[1])) {
			System.out.println( vehicles[0].toString() + " is newer than " + vehicles[1].toString());
		} else {
			System.out.println( vehicles[0].toString() + " is not newer than " + vehicles[1].toString());
		}
		
	}
	
	public static void outputArray(Vehicle[] vehicles) {
		for(Vehicle vehicle : vehicles) {
			vehicle.output();
			System.out.print('\n');
		}
	}
	
}
