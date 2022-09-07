import java.util.Scanner;

public class ArrayLeftRot
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an array size : ");
		int size=sc.nextInt();
		System.out.println("enter values : ");
		int arr[] =new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter a number for rotation towards left : ");
		int num=sc.nextInt();
		while(arr.length<num)
			num=num-arr.length;
		int num1=num;
		int b[] = new int[arr.length];
			for(int j=0;j<arr.length-num1;j++)
			{
				b[j]=arr[num];
				num++;
			}
		int l=0;
		for(int k=arr.length-num1;k<arr.length;k++)
		{
			b[k]=arr[l];
			l++;
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
