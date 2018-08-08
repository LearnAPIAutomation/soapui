import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int reverse=0;
		int lastdigit;
		System.out.println("Enter your digit: ");
		
		while(num>0)
		{
			lastdigit=num%10;
			System.out.println(lastdigit);
			num=num/10;
			
		}
		
		
	}

}
