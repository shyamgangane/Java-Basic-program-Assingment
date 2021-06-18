package _31_BasicProgramAssingment;

public class PalindromeNumber {
	
	public static void isPalindromeNumber(int num)
	{
		System.out.println("Given Number is :" +num);
		
		int r = 0;
		int sum = 0;
		int t;
		
		t = num;
		
		while(num>0)
		{
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
	
		}
		
		if(t== sum)
		{
			System.out.println("Palindrome Number");
			
		}else {
			
			System.out.println("is not Palindrome Number");
			
		}
		
		
	}
	
	public static void main(String[] args)
	{
		isPalindromeNumber(151);
		isPalindromeNumber(101);
		isPalindromeNumber(110);
		isPalindromeNumber(0);
	}

}
