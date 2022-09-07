import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NpCode {
	public static void main(String[] args) {
		List<Integer> n = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			n.add(i);
		}
		int size, m, position = 0;
		size = n.size();
		m = 1;
//		while(size>1) {
//			++position;
//			position=position%size;
//			n.remove(position);
//			size=n.size();
//		}
		int value1 = n.get(n.size() - 1);// n[size-1]
		for (int i = 1; i <= size; i++) {

			if (i % 2 == 0) {
				n.remove(m);
				m++;
			}
		}
		int value2 = n.get(n.size() - 1);
		while (n.size() != 1) {

			if (value1 == value2) {
				size = n.size();
				m = 0;
				for (int i = 1; i <= size; i++) {
					if (i % 2 != 0) {
						n.remove(m);
						m++;
					}
				}
				value1 = value2;
				value2 = n.get(n.size() - 1);
			} else {
				size = n.size();
				m = 1;
				for (int i = 1; i <= size; i++) {

					if (i % 2 == 0) {
						n.remove(m);
						m++;
					}
				}
				value1 = value2;
				value2 = n.get(n.size() - 1);
			}
		}
		System.out.println(n.get(0));
	}
}
