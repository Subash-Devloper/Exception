package Exception;

import java.util.Scanner;

public class SampleScanner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values \n");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println(n1+n2);
	}

}
