package Arrays;

public class Maximum {

	public static void main(String[] args) {
		
		int[] arr= {1,5,7,10,144,98,34};
		
		int max=arr[0];
		
		for (int i=0;i<arr.length;i++) {
			
			if (max<arr[i]) {

				max=arr[i];
				}
			
			
		}
		System.out.println("Maximum value is" +max);
		
		
		
		

	}

}
