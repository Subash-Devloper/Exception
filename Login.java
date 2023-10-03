package Exception;

import java.util.Scanner;

public class Login extends Exception {

	public String checkPassword(String a) throws Exception {
		if(a.length()>8) {
			return "Login Succesfully";
		}
			else {
				throw new  Exception("Invalid Password");
		}
	}
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the Password");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		Login l=new Login();
		System.out.println(l.checkPassword(a));
	}

}
