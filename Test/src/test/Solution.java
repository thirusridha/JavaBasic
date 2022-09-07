package test;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String IP = sc.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{

//	public static final  String pattern ="[0-2][][][.]{1}[0-9]{1,3}[.]{1}[0-9]{1,3}[.]{1}[0-9]{1,3}"; 
	public static final  String pattern="((([0-1]?[0-9]?[0-9]?)|([2][0-4][0-9]))|[2][5][0-5])[.]((([0-1]?[0-9]?[0-9]?)|([2][0-4][0-9]))|[2][5][0-5])[.]((([0-1]?[0-9]?[0-9]?)|([2][0-4][0-9]))|[2][5][0-5])[.]((([0-1]?[0-9]?[0-9]?)|([2][0-4][0-9]))|[2][5][0-5])";
//	public static final  String pattern="((([0-1]?[0-9]?[0-9]?)|([2][0-4][0-9]))|[2][5][0-5])[.]";
//	public static final  String pattern="[0-255 .,null]{1,5}";
}
//Write your code here
