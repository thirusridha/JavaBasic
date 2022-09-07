import java.util.regex.*;    
class Regex{    
	public static void main(String args[])
	{
		String s=null;
		System.out.println(Pattern.matches("[0-9.,/^$/]{1,5}|NULL",s));
		
		System.out.println(Pattern.matches("[0-9]{1,2}([.][0-9]{1,2})?","0"));
		System.out.println(Pattern.matches("([ ])*","     "));
		System.out.println(Pattern.matches("([a-zA-Z0-9 .,-@&$]*)",",,"));
			     
		System.out.println(" 1. ");     
		System.out.println(  
		     Pattern.matches("[3]","33")); // This statement returns False because the string starts with the Upper-case letter which does not match with the regex.  
		  
		System.out.println(" 2. ");       
		System.out.println(  
		     Pattern.matches("[Rpq]om", "Tom")); // This statement returns False because the string starts with 'T', which does not match with any character R, P, or Q of Regex.  
		  
		System.out.println(" 3. ");   
		System.out.println(  
		     Pattern.matches("[Tt]om", "Tom")); 
		System.out.println(" 4. ");         
		System.out.println(  
		     Pattern.matches("Cat|Rat", "Rat")); // This e the string matches with the Second part from the Regular Expression.  
		  
		System.out.println(" 5. ");   
		System.out.println(  
		     Pattern.matches("[CM]at|[Bb]ad", "Bad")); // Thisse the string matches with the Second part from the Regular Expression.  
		      
		System.out.println(" 6. ");      
		System.out.println(  
		     Pattern.matches(".*bit.*", "rabbit")); // This ecause the string contains the bit which match to the Regular Expression.  
		 
		System.out.println(" 7. ");       
		System.out.println(  
		     Pattern.matches("^[6].*[d]$", "654abc")); // This statement returns  because the string starts with the letter not a digit, which does not match with the regular expression.    
		  
		System.out.println(" 8. ");   
		System.out.println(  
		     Pattern.matches("^[^\\d].*", "abc123")); // This statement returns  because the string starts with the letter, which matches with the regular expression due to the negation of digit.  
		  
		System.out.println(" 9. ");       
		   System.out.println(  
		     Pattern.matches("[a-zA-Z][a-zA-Z][0-9A-Z]", "aPZ")); // This statement returns  because the last character 'z' in string does not match with the  with the '0-9A-Z' in regular expression.    
		  
		System.out.println(" 10. ");   
		   System.out.println(  
		     Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA")); // This statement returns  because the all the characters in string matches with the  with the regular expression.  
		  
		System.out.println(" 11. ");   
		System.out.println(  
		     Pattern.matches("java[tT]poin[tT]$", "javaTpoint")); // This statement returns True because the string ends with the 't' character which matches with the regular expression.  
		  
		System.out.println(" 12. ");        
		System.out.println(  
		     Pattern.matches("\\D*", "abcde")); // This statement returns True because the string does not contain any digit, so it follows the regular expression.  
		System.out.println(Pattern.matches("",""));
		System.out.println(" 13. ");   
		System.out.println(  
		     Pattern.matches("\\D*", "#$")); // This statement returns False because the string contains the digits, so it does not follow the regular expression.  
		System.out.println(Pattern.matches("[a-zA-Z0-9_ ]{1,4}","____"));
		System.out.println(Pattern.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$","a_Pd8"));
		System.out.println(Pattern.matches("(0?[1-9]|[12][0-9]|3[01])[/|-](0?[1-9]|1[012])[\\\\/\\\\-]\\d{4}$","4-12-1998"));
		System.out.println(Pattern.matches("([+][9][1]|[9][1])?",""));
	}
}