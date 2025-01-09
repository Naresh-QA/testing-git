package Sprint_1;

import org.eclipse.collections.impl.parallel.CountCombiner;

public class examples_arrays {

	private static int Count;

	public static void main(String[] args) {
		int a[][]= {{10,12},{23,45},{78,89},{85,45},{23,41}};
		int number=10;
		boolean found=false;
		for(int[] row:a) {
			for(int column:row) {
				if(column==number) {
					Count++;
					found=true;
				}
				
			}
			
		}System.out.println(Count);
		if(found=false) {
		System.out.println("not found");}
	}
}
