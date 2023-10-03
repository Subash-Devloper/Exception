package Exception;

public class FinallyCheck {
	public static void main(String[] args) {
		System.out.println("Hi");
		String ab="Prem";
		try {
		System.out.println(ab.charAt(5));
		}
		catch(Exception a) {
			System.out.println(a);
		}
		finally {
			System.out.println("this is Important");
		}
		System.out.println(ab.indexOf('s'));
	}

}
