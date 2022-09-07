import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Permutations {
  public static Set<String> getPermutation(String str) {//ABC BC
    Set<String> permutations = new HashSet<String>();
    if (str == null) {
      return null;
    } else if (str.length() == 0) {
      permutations.add("");
      return permutations;
    }
    char first = str.charAt(0);//A
    String sub = str.substring(1); //BC
    //System.out.println(sub +" jh");
    
    Set<String> words = getPermutation(sub);
    System.out.println("1");
   for (String strNew : words) {
      for (int i = 0;i<=strNew.length();i++){
    	  System.out.println(strNew.substring(0, i) + first + strNew.substring(i));
        permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
      }
    }
   System.out.println(permutations);
    return permutations;
  }

  public static void main(String[] args) {
	  
	  	Scanner input = new Scanner(System.in);
	    System.out.print("Enter the string: ");
	    String data = input.nextLine();//ABC
	    System.out.println("Permutations of " + data + ": \n" + getPermutation(data));
    
    }
}