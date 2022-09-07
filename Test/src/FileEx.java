import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileEx
{
	public static void main(String[] args) throws IOException
	{
		List<String> records = new ArrayList<>();
		Reader file = new FileReader("E:\\data\\a.txt");
	//	BufferedReader br = new BufferedReader(file);
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
	
			records.add(sc.nextLine());
			
		}
		records.stream().forEach(a -> System.out.println("fileRecors - " + a));
		records.stream().forEach( System.out::println);
		ArrayList<Comparable> a = new ArrayList<Comparable>();
		a.add("3aa");
		a.add(23);
		a.add(3.3);
		a.forEach( System.out::println);
	}
}
