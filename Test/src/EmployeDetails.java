import java.util.HashMap;
import java.util.Scanner;
public class EmployeDetails 
{
	public int id;
	public String name;
	public String loc;
	public EmployeDetails(String name1, String loc2) {
		this.name=name1;
		this.loc=loc2;
	}
	
	public String toString() {
		return name+" "+loc;
	}
	public static void main(String[] args) 
	{
		//EmployeDetails emp = new EmployeDetails();
		HashMap<Integer,EmployeDetails> h=new HashMap<Integer,EmployeDetails>();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.New Employee \n2.Edit Employee \n3.Delete Employee \n4.Show Employee \n5.Show All Employee \n6 Exit");
		
		int num=0;
		
		do {
			System.out.println("Choose your option :");
			num=sc.nextInt();
			if(num==1)
			{
				System.out.println("enter emp id :");
				int num1=sc.nextInt();
				if(h.get(num1)!=null)
				{
					System.out.println("Id is already exist..");
				}
				else
				{

					System.out.println("enter emp name :");
					String name1=sc.next();
					System.out.println("enter emp location :");
					String loc=sc.next();
					EmployeDetails emp1 = new EmployeDetails(name1,loc);
					h.put(num1,emp1);
					System.out.println("Id is added successfully...");
				}
			}
			if(num==2)
			{
				System.out.println("enter Emp Id : ");
				int num3 = sc.nextInt();
				if(h.get(num3)!=null)
				{
					System.out.println("enter new emp name : ");
					String str=sc.next();
					System.out.println("enter new emp loc : ");
					String n=sc.next();
					EmployeDetails emp1 = new EmployeDetails(str,n);
					h.replace(num3, emp1);
					System.out.println("Id is edited successfully...");
						
				}
				else
				{
					System.out.println("Id is does't exist");
				}
				
			}
			if(num==3)
			{
				System.out.println("enter Emp Id : ");
				int num3 = sc.nextInt();
				if(h.get(num3)!=null) {
					h.remove(num3);
					System.out.println("Id is deleted Successfully..");
					
				}else {
					System.out.println("Id is does't exist");
				}
			}
			if(num==4)
			{
				System.out.println("enter Emp Id : ");
				int num3 = sc.nextInt();
				if(h.get(num3)!=null) {
					System.out.println(h.get(num3));
					
				}else {
					System.out.println("Id is does't exist..");
				}
			}
			if(num==5)
			{
				System.out.println(h);
			}
			
		}
		while(num!=6);
	}

	
}
