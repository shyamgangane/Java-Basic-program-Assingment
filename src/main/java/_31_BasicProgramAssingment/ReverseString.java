package _31_BasicProgramAssingment;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//Reverse a String
		// Difference between String and StringBuffer
		//do we have reverse function in String? ---- Ans is-- NO
		
		String s = "Hello World";
		
		//Using for loop
		
		int len = s.length();
		
		String rev = "";
		
		for(int i = len-1; i>=0; i--) {
			
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		// using StringBuffer class
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
		
	}

}
