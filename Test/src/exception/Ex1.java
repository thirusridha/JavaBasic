package exception;
public class Ex1 {
	public static void main(String[] args) {
		int j=0;
		try {
			for(int i=3;i>-2;i--)
			{
				j=5/i;
				System.out.println(j);
			}
		} catch (Exception e) {
			System.out.println("exception occured");
		}
		System.out.println(j);
	}
}
