package Session_17;

import java.util.Scanner;

public class data_conversions {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter int vlaue of s1");
		int s1=(scanner.nextInt());
		System.out.println("Enter int vlaue of s2");
		int s2=(scanner.nextInt());
		System.out.println("Enter double vlaue of s3");
		
		Double s3=(scanner.nextDouble());
		System.out.println("Enter boolean vlaue of s4");
		Boolean s4=(scanner.nextBoolean());
		System.out.println("Enter boolean vlaue of s5");
		Boolean s5=(scanner.nextBoolean());
		System.out.println("Enter char vlaue of s6");
		String s6=(scanner.next());
		
		System.out.println(String.valueOf(s1));
		System.out.println(String.valueOf(s2));
		System.out.println(String.valueOf(s3));
		System.out.println(String.valueOf(s4));
		System.out.println(String.valueOf(s5));
		System.out.println(String.valueOf(s6));
		
		/*String wString=scanner.nextLine();
		System.out.println("Enter int vlaue of s1");
		String s1=(scanner.next());
		System.out.println("Enter int vlaue of s2");
		String s2=(scanner.next());
		System.out.println("Enter double vlaue of s3");
		
		String s3=(scanner.next());
		System.out.println("Enter boolean vlaue of s4");
		String s4=(scanner.next());
		System.out.println("Enter boolean vlaue of s5");
		String s5=(scanner.next());
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		System.out.println(Integer.parseInt(s1)+Double.parseDouble(s3));
		System.out.println(Boolean.parseBoolean(s4));
		System.out.println(Boolean.parseBoolean(s5));*/
		

		scanner.close();


	}

}
