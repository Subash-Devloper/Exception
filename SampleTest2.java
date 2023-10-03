package Exception;

public class SampleTest2 {
	public static void main(String[] args) {
		System.out.println("Hi");
		String a=null;
		try {
		System.out.println(a.toUpperCase());
		}
		catch(Exception b) {
			System.out.println("It is Empty String");
		}
		
		
	}

}
