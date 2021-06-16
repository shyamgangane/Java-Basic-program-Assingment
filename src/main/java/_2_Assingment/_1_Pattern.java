package _2_Assingment;

public class _1_Pattern {

	public static void main(String[] args) {

		int rows = 13;
		
		//prints upper half pattern

		for(int i=1; i<=rows;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(j+ " ");
			}

			System.out.println();
		}
		
		//print lower half pattern
		
		for(int i=rows - 1; i>=1; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+ " ");

			}
			System.out.println();
		}
	}

}
