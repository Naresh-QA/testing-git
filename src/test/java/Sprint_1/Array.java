package Sprint_1;

import org.eclipse.collections.impl.block.function.IfFunction;

public class Array {

	public static void main(String[] args) {
		

				int a[][]= {{100,120},{86,5},{78,86}};
				int search =8;
				boolean found=false;
				for(int row=0;row<a.length;row++) {
					for(int column=0;column<a[row].length;column++) {
						if(a[row][column]==search) {
							System.out.println("element is found "+ search);
							found=true;
							break;
						}
					}
				}
				if(!found) {
					System.out.println("element not found");
				}
	
}
}
