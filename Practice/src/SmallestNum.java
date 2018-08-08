
public class SmallestNum {

	void small(int arr[]) {
		
		int small =arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (small>arr[i]) {
				 small = arr[i];
			}

		}
			System.out.println(small);
	}
	
	public static void main(String[] args) {
		
		int arr[]={3,5,0,7,1};
		SmallestNum sn= new SmallestNum();
		sn.small(arr);
		
	}

}
