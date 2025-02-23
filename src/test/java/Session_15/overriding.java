package Session_15;
class abc {
	void m1(int a,int b) {
		System.out.println(a);
	}
	void m2(int x, int y) {
		System.out.println(x);
	}
}
class xyz extends abc{
	void m1(int a, int b) {//overriding
		System.out.println(a*a);
	}
	void m2(int x) {//overloding
		System.out.println(x);
	}
}

public class overriding {


	public static void main(String[] args) {
		xyz mark=new xyz();
		mark.m1(10, 10);
		mark.m2(25);
		mark.m2(2, 5);

	}

}
