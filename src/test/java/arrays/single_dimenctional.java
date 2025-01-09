package arrays;

import org.checkerframework.framework.qual.FromByteCode;

public class single_dimenctional {

	public static void main(String[] args) {
		int a[][]= { {100,200,10}, {5,6,4}, {96,25,8}, {78,89,33}, {89,56,4},{8,9,52}};
		int f=0;
		for(int[] row:a) {
			for(int column:row) {
				f+=column;
			//System.out.println(f);
			}System.out.println(f);

		}
		

	}	
}