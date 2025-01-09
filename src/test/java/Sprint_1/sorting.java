package Sprint_1;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		int a [][]= {{7,34},{34,56},{2,7},{45,45}};
		System.out.println("before sorting "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting "+Arrays.toString(a));
	}

}
