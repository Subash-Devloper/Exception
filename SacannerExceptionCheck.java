package Exception;

import java.util.Scanner;

public class SacannerExceptionCheck {
	public static void main(String[] args) throws AgeException {
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=ab.nextLine();
		System.out.print("Enter your Age");
		int age=ab.nextInt();
		if(age>17) {
			System.out.println("Welcome our portal");
		}
		else
		{
			try {
			throw new AgeException("Not Eligible");
			}
			catch(Exception a) {
				System.out.println(a);
			}
		}
		System.out.println("Enter your Gender");
		String gender=ab.next();
		
		
	}

}
