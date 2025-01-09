package arrays;

import org.checkerframework.framework.qual.FromByteCode;

public class single_dimenctional {

	private static int count;

	public static void main(String[] args) {
		int a[][]= { {100,200,10}, {5,6,4}, {96,25,8}, {78,89,33}, {89,56,4},{4,9,52}};
		int f=4;
		for(int[] row:a) {
			for(int column:row) {
				if(column==f) {
					count++;
				}
			//System.out.println(f);
			}

		}System.out.println(count);
		

	}	
}