
package program7;
import java.util.*;
interface Work{
	void distance();
	void avg_fuel();
}
abstract class Car implements Work{
	float Km, d,fuel;
	Car(){
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter total distance covered by car: ");
		Km=s1.nextFloat();
		System.out.println("Enter distance covered in this trip: ");
		d=s1.nextFloat();
		System.out.println("Enter total fuel consumed in this trip: ");
		fuel=s1.nextFloat();
		
	}
	abstract void run();
	public void company(String c_name) {
		System.out.println("Manufacture is: "+ c_name);
	}
	public void distance() {
		System.out.println("Total distance traveled is: "+ Km);	
	}
	public void avg_fuel() {
		float avg= d/fuel;
		System.out.println("Average fuel cunsumption is: "+ avg);	
	}
}
class Altros extends Car{

	@Override
	void run() {
		System.out.println("Hi my name is Altros");
		System.out.println("I am a road legal car \n");
	}
	
}
class Sumo extends Car{

	@Override
	void run() {
		System.out.println("Hi my name is Sumo");
		System.out.println("I am a road legal car");
		System.out.println("But i am discontinued!\n");
	}
	
}
public class Main{
	public static void main(String args[]) {
		System.out.println("Sumo");
		Car sumo =new Sumo();
		sumo.run();
		sumo.avg_fuel();
		sumo.company("Tata");
		sumo.distance();

		System.out.println("\n Altros");
		Car altros =new Altros();
		altros.run();
		altros.avg_fuel();
		altros.company("Tata");
		altros.distance();
		
	}
}

