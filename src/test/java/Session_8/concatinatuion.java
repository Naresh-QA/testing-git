package Session_8;

import java.util.Arrays;

import Sprint_1.arrays;

public class concatinatuion {

	public static void main(String[] args) {
		String a="   143   ";
		String b="to";
		String c="you";
		String e="to dfgvjn ergfenr ergferf werfwer werfwerf wef wef wer fwerfwref  wef wrf werf werf wreef";
		String s= a.concat(b+c+e);
				//System.out.println(a.concat(b+c).length());
		System.out.println(s.charAt(4));
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("you"));
		System.out.println(s.equals(c));
		System.out.println(b==e);
		System.out.println(b=="To");
		System.out.println(b.equalsIgnoreCase("To"));
		System.out.println(s.replace('w', 'n'));
		System.out.println(s.replace("werfwerf", "naresh"));
		System.out.println(s.substring(0,6));
		String n="naresh@gmail.com";//split with regards to delimeter.
		String m[]=n.split("il");
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(Arrays.toString(m));
		
		


}
} 