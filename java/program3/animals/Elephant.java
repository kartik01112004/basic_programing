package animals;

import java.util.Scanner;

public class Elephant {
	public String color;
	public int weight;
	public int age;
	Scanner s1= new Scanner(System.in);
	public void Vegetarian(){
		System.out.println("Color is: "+color+" weight is: "+weight+" age is: "+age);
	}
	public void canClimb() {
		
		System.out.println("Enter phrase you want to print for climbing: ");
		String climb= s1.next();
		
		System.out.println(climb);
	}
	public void getSound() {

		System.out.println("Enter sound");
		String sound= s1.next();
		
		System.out.println(sound);
	}
}
