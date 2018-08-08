
public class Rev {

	public static void main(String[] args) {

		int n = 546;
		int sum = 0;
		int rev = 0;
		while (n > 0) {
			rev = n % 10;
			sum = sum * 10 + rev;
			n = n / 10;

		}

		System.out.println(sum);

	}

}
