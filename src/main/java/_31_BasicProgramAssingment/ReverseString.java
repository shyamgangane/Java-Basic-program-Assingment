package _31_BasicProgramAssingment;

public class ReverseString {

	public static void main(String[] args) {

		//Reverse a String
		// Difference between String and StringBuffer
		//do we have reverse function in String? ---- Ans is-- NO

		String s = "Hello World";
		String s1 = "Hello Shyam";
		String s2 = "Hello Sam";
		
		ReverseString objRef = new ReverseString();
		objRef.revString(s);
		objRef.revString(s1);
		objRef.revString(s2);
		System.out.println("-------------------------");
		reverseString(s);
		reverseString(s1);
		reverseString(s2);
		ReverseString.reverseString(s1);
		System.out.println("-------------------------");
		String test = reverseString1(s2);
		System.out.println(test + "10");
		System.out.println(reverseString1(s2) + "20");
		

//		//Using for loop
//
//		int len = s.length();
//
//		String rev = "";
//
//		for(int i = len-1; i>=0; i--) {
//
//			rev = rev + s.charAt(i);
//		}
//
//		System.out.println(rev);
//
//		// using StringBuffer class
//
				StringBuffer sf = new StringBuffer(s);
				System.out.println(sf.reverse());
		
		


	}


	public void revString(String testString)
	{
		int len = testString.length();

		String rev = "";

		for(int i = len-1; i>=0; i--) {

			rev = rev + testString.charAt(i);
		}

		System.out.println(rev);
	}
	
	/*
	 * this method is used to reverse the string
	 * @author Shyam
	 */
	public static void reverseString(String testString)
	{
		int len = testString.length();

		String rev = "";

		for(int i = len-1; i>=0; i--) {

			rev = rev + testString.charAt(i);
		}

		System.out.println(rev);
	}
	
	
	
	/**
	 * This method is used to reverse a string
	 * @author Sarang
	 * @param testString
	 * @return the reversed string 
	 */
	public static String reverseString1(String testString)
	{
		int len = testString.length();

		String rev = "";

		for(int i = len-1; i>=0; i--) {

			rev = rev + testString.charAt(i);
		}

		return rev;
	}



}
