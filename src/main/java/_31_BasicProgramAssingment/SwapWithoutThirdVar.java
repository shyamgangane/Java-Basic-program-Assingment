package _31_BasicProgramAssingment;

public class SwapWithoutThirdVar {
	
	public static void main(String[] args) {

		int x= 50;
		int y= 70;
		
//		//1. with using third variable
//		int t;
//		t = x; //5
//		x = y; //10
//		y = t; //5

		//2. without using third variable: using + operator (Mathematical formulae )
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println(x);
		
//		//3. without using third var: using * operator

//		x = x * y;
//		y = x / y;
//		x = x / y;
//		
//		System.out.println(x);
		
//		//4. using XOR ^
		
//		x = x ^ y;
//		y = x ^ y;
//		x = x ^ y;
//		
//		System.out.println(x);
		
	}

}
