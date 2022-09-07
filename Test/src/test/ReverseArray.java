package test;
public class ReverseArray 
{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,9};
		int j=0;
		int num=arr.length;
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[num-1];
			arr[num-1]=temp;
			num--;
			j++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
