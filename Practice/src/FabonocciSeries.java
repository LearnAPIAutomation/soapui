
public class FabonocciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a);
		while (c < 30) {
			
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}

	}
}
