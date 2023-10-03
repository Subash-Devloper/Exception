package Exception;

public class SingleTryMultiCatch {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException a) {
			System.out.println("It is null value");
		}
		catch(NumberFormatException b) {
			System.out.println("Format Missing");
		}
		catch(Exception c) {
			System.out.println(c);
		}
		
	}

}
