import java.util.*;
public class program_2 {

	public static void main(String[] args) {
		int eggs;
		
		System.out.println("Enter number of eggs: ");
		Scanner i= new Scanner(System.in);
		eggs = i.nextInt();
		System.out.println("total egs are "+eggs);
		
		int remainder1,remainder2,gross_eggs,dozen_eggs;
		
		gross_eggs=eggs/144;
		remainder1=eggs%144;
		dozen_eggs=remainder1/12;
		remainder2=remainder1%12;
		
		System.out.println("your number of eggs is "+gross_eggs+
" gross "+dozen_eggs+" dozen "+remainder2+" left");
	}

}
