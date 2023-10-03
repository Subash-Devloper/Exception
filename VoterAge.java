
package Exception;

public class VoterAge {

	public static void main(String[] args) throws AgeException {
		String name="Raj";
		int age=17;
		String gender="Male";
		if(age>17) {
			System.out.println("you can apply for voterId"); 
		}
		else {
			throw new AgeException("Not Available Age");
			
		}
		System.out.println(name+ " "+  gender);
	}

}
