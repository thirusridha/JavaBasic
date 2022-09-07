public class PermutationsEx { 
	static int count=0;  
	static String p(){  
		count++;  
		if(count>2 && count<=5){  
			System.out.println("hello "+count);  
			return "khadeer";
			
		}
		
		p();  
		System.out.println("hiii");
		return "sridhar";  
	}  
	public static void main(String[] args) {
		p();
	}  
}  