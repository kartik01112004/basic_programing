package zoo;
import animals.Elephant;
import animals.Lion;
import animals.Monkey;
public class VandalurZoo {

	public static void main(String[] args) {
		Lion l1= new Lion();
		Monkey m1=new Monkey();
		Elephant e1=new Elephant();
		System.out.println("LION");
		l1.age=24;
		l1.color="Golden Brown";
		l1.weight=70;
		l1.canClimb();
		l1.getSound();
		l1.Vegetarian();
		System.out.println("MONKEY");
		m1.age=4;
		m1.color="Brown";
		m1.weight=10;
		m1.canClimb();
		m1.getSound();
		m1.Vegetarian();
		System.out.println("ELEPHANT");
		e1.age=80;
		e1.color="Blue";
		e1.weight=5000;
		e1.canClimb();
		e1.getSound();
		e1.Vegetarian();
		

	}

}
