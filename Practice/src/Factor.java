
public class Factor {

	public static void main(String[] args) {
		
		int number=123;
		int sum=0;
		
		while(number>0)
		{
			int lastdigit=number%10;
			
			int cube=lastdigit*lastdigit*lastdigit;
				
				sum=sum+cube;
			System.out.println(sum);
			number=number/10;
			
		}

	}

}
