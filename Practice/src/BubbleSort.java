class BubbleSort {

	void sort(int arr[]) {
		int pass;
		int i;
		int temp;
		int flag=0;

		for (pass = 0; pass < arr.length - 1; pass++) {
			flag=0;
			for (i = 0; i < arr.length - 1 - pass; i++) {
				if (arr[i] > arr[i + 1]) {

					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag++;
					

				}
				System.out.println(flag+"------");

			}
			if (flag==0)
			{
				break;
			}

		}

	}

	void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[]={1,4,5,6,8};
		BubbleSort bs= new BubbleSort();
		bs.sort(arr);
		bs.print(arr);

	}

}