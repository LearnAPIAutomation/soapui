import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num= sc.nextInt();
		int resetnum=num;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		
		System.out.println(count);
		
		for (int i=0;i<=count;i++)
		{
			resetnum=resetnum%10;
			
			
		}
	}

}
