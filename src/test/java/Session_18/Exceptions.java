package Session_18;

import java.util.Scanner;

import net.bytebuddy.asm.Advice.Enter;

public class Exceptions {

	public static void main(String[] args) throws InterruptedException {
		double z=1000;
		int doo=(int)z;
		int a[]=new int[5];
		Scanner scanner=new Scanner(System.in);
		Thread.sleep(5000);	
		try {
			System.out.println("enter A position value from 0-4");
			int pos=scanner.nextInt();
			
			
			//int pos=scanner.nextInt();
			
			System.out.println("enter input value ");
			
			int input=scanner.nextInt();
			
			a[pos]=input;
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		System.out.println("executed");
		
		
		
//		try {
//			
//		}
//		catch (Exception e){
//			System.out.println(e.getMessage());
//		}
//		System.out.println("executed");
//		//System.out.println(input);
//	}
	}
}
