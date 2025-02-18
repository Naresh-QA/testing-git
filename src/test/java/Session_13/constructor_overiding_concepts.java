package Session_13;

public class constructor_overiding_concepts {
	int z;
	double y;
	constructor_overiding_concepts(int a, int b) {
	System.out.println(a+b);
	}
	public constructor_overiding_concepts(int a , double b) {
		int z=a;
		double y=b;
		System.out.println(z+y);
	}

	public static void main(String[] args) {
		
		constructor_overiding_concepts cd=new constructor_overiding_concepts(100,12.2);
		
	}

}
