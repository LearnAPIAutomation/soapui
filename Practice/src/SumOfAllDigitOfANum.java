import java.util.Scanner;

public class SumOfAllDigitOfANum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0)
		{
			int lastdigit=num%10;
			sum=sum+lastdigit;
			num=num/10;			
		}
		
		System.out.println(sum);

	}

}
