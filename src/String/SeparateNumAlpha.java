//Separate Number and Aplhabet from string

package String;

public class SeparateNumAlpha {

	public static void main(String[] args) {
		
		String str= "ne9856yup564";
		
		
		
		for (int i=0;i<str.length();i++) {
		
		
		char c= str.charAt(i);
		char d= str.charAt(i);
		
		if ('a'<=c && 'z'>=c) 
			
			System.out.println("string is " +c);
			
			else if ('0'<=d && '9'>=d) 
				
				System.out.println("number is " +d);
			}
		}}

		
		
		
		

	


