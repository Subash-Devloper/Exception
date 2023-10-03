package Exception;

public class SampleTest3 {
	public static void main(String[] args) {
	System.out.println("Hi");
	String ab="TN46";
	try {
	int num=Integer.parseInt(ab);
	System.out.println(num);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	}
}
