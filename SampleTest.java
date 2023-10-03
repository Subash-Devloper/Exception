package Exception;

public class SampleTest {
	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			//Use Any One in the below three
			System.out.println("Don't dividesd by 0");
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Bye");
	}
}
