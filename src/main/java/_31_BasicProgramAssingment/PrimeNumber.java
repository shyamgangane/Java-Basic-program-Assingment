package _31_BasicProgramAssingment;

public class PrimeNumber {
	
	//2 is lowest prime number
	//3 
	//num =20;
	
	public static boolean isPrimeNumber(int num) {
		
		if(num <=1) {
			return false;
		}
		
		for(int i =2; i<num; i++) {
			
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// This method use for upto for 20 (ex 40 if any number)
	
	public static void getPrimeNumber(int num) {
		for(int i =2; i<=num; i++) {
			if(isPrimeNumber(num));
			System.out.print(i + " ");
		}
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("2 is prime number : " +isPrimeNumber(2));
		System.out.println("3 is prime number : " +isPrimeNumber(3));
		System.out.println("4 is prime number : " +isPrimeNumber(4));
		System.out.println("0 is prime number : " +isPrimeNumber(0));
		
		getPrimeNumber(20);

	}

}
