package _31_BasicProgramAssingment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeOrNot {
	static int num, sham;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // A number that is divisible only by itself and 1 (e.g. 2,3,5,7,11)
		System.out.print("Enter any number to check whether it is prime or not: "); // Here passing input from the console

		try {
			num = scan.nextInt();  //if the input is not a number, it throws an exception

			if(num <= 1)
				System.out.println(num + "is not a prime number");

			else {
				sham = 0;

				for(int i = 1; i <= num; i++) {
					if (num % i == 0)    // Here  we are counting the number of multiples
					{
						sham++;
					}	

				} if (sham >2)  // if the no. of factors is more than 2, then we don't call it as a prime number

					System.out.println(num + "is not a prime number");

				else 

					System.out.println(num + "is a prime number");

			}
		}
		catch (InputMismatchException e)
		{
			System.out.println("Please enter a valid niumber to check whether it is prime or not \n");
			main(args);
		}
		
		scan.close();

	}




}
