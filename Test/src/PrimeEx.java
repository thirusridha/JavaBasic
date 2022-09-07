public class PrimeEx {
	public static void main(String[] args) {
		int num=200,k=0;
		for(int i=num;i>0;i--)
		{
			boolean b=true;
			for(int j=2;j<=num/2;j++)
			{
				if(i%j==0 && j!=i){
					b=false;
					break;
				}
			}
			if(b){
				if(k==0)
					System.out.println("largest num "+i);
				k=1;
				System.out.println(i);
				//break;
			}
		}
	}
}
