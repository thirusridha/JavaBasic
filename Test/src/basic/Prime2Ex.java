package basic;
public class Prime2Ex {
	public static void main(String[] args) {
		for(int i=1;i<200;i++)
		{
			int p=0;
			for(int j=2;j<=10;j++)
			{
				if(i%j==0){
					p=1;
					break;
				}
			}
			if(p==0){
				for(int m=2;m<=i/2;m++)
				{
					if(i%m==0){
						System.out.println(i);
						break;
					}
				}
			}
		}
	}
}
