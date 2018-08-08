
public class LargestValue {
	
	public static void main(String[] args) {
		
		int arr[]={10,2,8,4,14};
		
		int largevalue=0;
		
		for(int j=0;j<=arr.length-1;j++)
		{
			if(largevalue<arr[j])
			{
				largevalue=arr[j];
			}
			
		}
		
		System.out.println(largevalue);
	
	}

}
