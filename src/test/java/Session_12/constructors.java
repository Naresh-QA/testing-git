package Session_12;

public class constructors {
	int Number;
	String name;
	/*constructors() {
	int Number=100;
	String name="mom";
	}*/
	constructors(int num,String na){
		Number=num;
		name=na;
	}
	void print() {
		System.out.println(Number);
		System.out.println(name);
	}

	public static void main(String[] args) {
		constructors co=new constructors(101,"reee");
		co.print();

	}

}
