package Arrays;

public class SecondMax {

	public static void main(String[] args) {
		
		int[] arr= {1,5,7,10,144,98,34};
		
		int max= arr[0];
		int secondmax= arr[1];
		
		for (int i=0;i<arr.length;i++) {
			
			if (max<arr[i]) {
				
				secondmax= max;
				max= arr[i];
				}
			
			else if (secondmax<arr[i]) {
				
				secondmax= arr[i];
				
				
			}}
		
		System.out.println("Second Highest Value is "  + secondmax);
			
			
		
		
		
		
		

	}

}
