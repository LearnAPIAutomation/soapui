
public class SelectionSort {
	
	
	public static void main(String[] args) {
		
		int arr[]={5,6,7,8,1};
		
		for(int pass=0;pass<arr.length-1;pass++)
		{
			int small=arr[pass];
			for (int i=1;i<arr.length-1;i++)
			{
				if(small>arr[i])
				{
					small=arr[i];
				}
				
				
			}
			System.out.println(small);
		}
		
	
		
		
		
	}

}
