package Session_13;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor;

public class static_methods {
	static int a=100;
	int b=200;
	static void v1() {
		System.out.println("this is static method");
	}
	void v2() {
		System.out.println("this is non static method");
	}
	void v3() {
		System.out.println(a);
		System.out.println(b);
		v1();
		v2();
	}
	public static void main(String[] args) {
		System.out.println(a);
		v1();
		static_methods sm=new static_methods();
		System.out.println(sm.b);
		sm.v2();
		sm.v3();//static and non static method at one method.
		
	}

}
