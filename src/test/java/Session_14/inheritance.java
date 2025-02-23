package Session_14;
class a{
	int z=100;
	void print(){
		System.out.println("this is parent class");
	}
			
}
class b extends a{
	int x=56;
	void man() {
		System.out.println("this is child class");
	}
}
class c extends b{
	int u=65;
	void child() {
		System.out.println("this is another child");
	}
		
}

public class inheritance {

	public static void main(String[] args) {
		c inhe=new c();
		System.out.println(inhe.z);
		System.out.println(inhe.x);
		System.out.println(inhe.u);

		inhe.print();
		inhe.man();
		inhe.child();
		
		
		

	}

}
