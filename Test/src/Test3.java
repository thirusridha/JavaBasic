import java.util.HashMap;
import java.util.Scanner;
public class Test3 
{
	public int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name){
		Test3.name = name;
	}
	public static String name;
	public Test3(int num,String name) {
		this.id=num;
		this.name=name;
	}
	public Test3() {
		
	}
	public String toString() {
        return id+" "+name;
    }
	public static void main(String[] args) 
	{
		
		HashMap<Integer,Test3> h= new HashMap<Integer,Test3>();
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		int num=sc.nextInt();
		System.out.print("name : ");
		String name=sc.next();
		Test3 t = new Test3(num,name);
		System.out.println(t);
		h.put(1, t);
		System.out.println(h);
		
	}
}




