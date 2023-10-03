package Exception;

public class StackOverCheck {
	public void a( ) {
		b();
	}
	public void b() {
		a();
	}
}
