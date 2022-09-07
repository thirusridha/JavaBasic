public class MinEx 
{
	public static void main(String[] args) 
	{
		int min=0,max=0;
		int[] arr= {1,2,3,4,5,6};
		for(int i=0;i<arr.length-1;i++)
		{
			min=min+arr[i];
			
		}
		for(int i=1;i<arr.length;i++)
		{
			max=max+arr[i];
		}
		System.out.println(min+" "+max);
	}
}
