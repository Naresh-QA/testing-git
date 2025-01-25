package Session_9;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence to be reversed");
		String a=sc.next();
		
		//String a=("abcde");
		String b=("");
		for(int i=a.length()-1;i>=0;i--) {
			b+=a.charAt(i);
		}
		System.out.println(b);
		Scanner tc=new Scanner(System.in);
		System.out.println("enter a value");
		String aString=tc.next();
		String bString="";
		char y[]=aString.toCharArray();
		for(int row=y.length-1;row>=0;row--) {
			bString+=y[row];
		}System.out.println(bString);*/
		StringBuffer aString= new StringBuffer("QWERTY");
		System.out.println(aString.reverse());
	}

}
