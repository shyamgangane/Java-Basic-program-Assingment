package _3_Assingment;

public class Test {

	public static void main(String[] args) {
		
		int result;
		Calculator calc = new Calculator();
		result = calc.add(10, 20);
		System.out.println("Addition Result : " + result);
		
		result = calc.sub(10, 12);
		System.out.println("Substraction Result : " + result);
		
		result = calc.mul(10, 14);
		System.out.println("Multiplication Result : " + result);
		
		result = calc.div(50, 20);
		System.out.println("Divide Result : " + result);
		
		


		
	}

}
 