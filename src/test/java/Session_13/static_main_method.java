package Session_13;

public class static_main_method {

	public static void main(String[] args) {
		System.out.println(static_methods.a);
		static_methods.v1();
		static_methods sm=new static_methods();
		System.out.println(sm.b);
		sm.v2();
		sm.v3();//static and non static method at one method.
		
	}

}
