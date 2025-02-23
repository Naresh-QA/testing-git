package Session_14;
class p{
	int z=100;
	void print(){
		System.out.println("this is parent class");
	}
			
}
class q extends p{
	int x=56;
	void man() {
		System.out.println("this is child class");
	}
}
class r extends p{
	int u=65;
	void child() {
		System.out.println("this is another child");
	}
		
}

public class hierachy_inheritance {

	public static void main(String[] args) {
		q first=new q();
		r second=new r();
		System.out.println(first.z);
		System.out.println(first.x);
		System.out.println(second.u);
		System.out.println(second.z);
		first.man();
		first.print();
		second.child();
		second.print();



		

	}

}
