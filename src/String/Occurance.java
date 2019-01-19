package String;

public class Occurance {

	public static void main(String[] args) {
	
		String str= "elephant";
		
		int Length= str.length();
		
		char s1= 'e';
		int count=0;
		
		
		for (int i=0;i<Length;i++) {
			
			if (str.charAt(i)==s1) {
				count ++;
				
			}
			
		}
		System.out.println(count);
		
		

	}

}
