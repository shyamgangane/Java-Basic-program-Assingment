package _31_BasicProgramAssingment;

public class SwapString {
	
	public static void main(String[] args) {
		
		// WAP to swap Strings without using temp/third variable
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("before swapping: ");
		System.out.println("the value of a is:"+ a);
		System.out.println("the value of b is:"+ b);
		
		//1.append method
		
		a = a+b;
		
		//2. store initial string a in string b
		
		b = a.substring(0,a.length()-b.length());
		
		//3. store initial string b in string b
		
		a = a.substring(b.length());
		
		System.out.println("the value of a and b after swapping: ");
		
		System.out.println("the value of a is:"+ a);
		System.out.println("the value of b is:"+ b);
		
	
		
	}

}
