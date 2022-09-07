import java.util.HashMap;
import java.util.Scanner;
public class TierEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int count=sc.nextInt();
		HashMap<String,Integer> h = new HashMap<String, Integer>();
		h.put("0-500", 1);
		h.put("500-1000",2);
		h.put("1000-null",3);
		int amount=0;
		for(String s :h.keySet())
		{
			if(!(s.substring(s.indexOf("-")+1).equals("null"))){
				int first=Integer.parseInt(s.substring(0,s.indexOf("-")));
				int last=Integer.parseInt(s.substring(s.indexOf("-")+1));
				if(count>last-first){
					count=count-(last-first);
					amount = (last-first)*h.get(s)+amount;
				}
				else{
					amount=amount+count*h.get(s);
					break;
				}
			}
			else{
				amount=amount+count*h.get(s);
			}
			
		}
		System.out.println(amount);
	}
}
