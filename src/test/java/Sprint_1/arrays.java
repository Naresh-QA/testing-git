package Sprint_1;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class arrays {

	public static void main(String[] args) {

		int a[][]= {{100,120},{41 ,5},{78,86}};
		for(int column=0;column<=a.length-1;column++)
			for(int row=0;row<=a.length-1;row++)
				if (row ==100)
					System.out.println("it is found"+ row);
		
	}

	public static String tostring(int[][] a) {
		// TODO Auto-generated method stub
	return null;
	}
}
