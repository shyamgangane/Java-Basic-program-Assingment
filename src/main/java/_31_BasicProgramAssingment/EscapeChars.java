package _31_BasicProgramAssingment;

public class EscapeChars {
	
	public static void main(String[] args)
	{

	// Escape Special characters 
	
	// I want run with double qouat word
	
	/**
	 *  /"Hello"/
	 *  /'Hello'/
	 *  "Hello"
	 *  I love "java" and "programming" and "movies"
	 *  'I love "java" and "programming" and "movies"'
	 *  
	 */
	 
	
	System.out.println("/\"Hello\"/");
	
	System.out.println("'Hello'");
	
	// java is Escape back slash
	
	System.out.println("\"Hello\"");
	
	System.out.println("I love \"java\" and \"progamming\" and \"moives\"");
	
	System.out.println("'I love \"java\" and \"programming\" and \"moives\"'");
	
	System.out.println(getXpath("Rama"));
	
	//now calling the function every time any value
	
	System.out.println(getXpath("8525"));
	
	System.out.println(getXpath("Gana"));

	
	}	
	
	// getXpath function calling directly
	
	
	public  static String getXpath(String name) {   //static use so that we can call directly name
		
		String xpath = "//input[@id='"+name+"']";   //put @id="+name+" _double qouat and put concation operator and name our here
				//input[@id='Rama']
		
		return xpath;
	}
	
}
