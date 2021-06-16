package _31_BasicProgramAssingment;

public class RemoveJunkChar {
	
	public static void main(String[] args) {
		
		String s = "##$&^%???) Hi This side Java &&*(&*()063";
		
		String s1 = "@@^%^& Testing ^%&^*($% on ^&*$^#% java";
		
		// How will you remove junk characters and spaces?
		// Then use that time 
		
		// Regular Expression [^a-zA-Z0-9]  // apparat form that whatever is that plz remove it
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");   
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", ""); 
		System.out.println(s1);
				
		
		
		
		
	}
  
}
