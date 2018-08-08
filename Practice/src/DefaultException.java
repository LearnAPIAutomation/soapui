
public class DefaultException {

	static void doStuff() {
		doMoreStuff();
		System.out.println("doStuff");

	}

	public static void doMoreStuff() {

		System.out.println("doMoreStuff");

	}

	public static void main(String[] args) {

		DefaultException.doStuff();
		int i = 10 / 0;

	}

}
