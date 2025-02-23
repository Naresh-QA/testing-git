package Session_15;
 class open {
	String test="printing in progress";
	void eat(){
		System.out.println("printing in progress");
	}
}
class close extends open{
	String test="printed the value";
	void eat() {
		System.out.println(super.test);
		//super.eat();
	}
		
}

public class final_super_keyword {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		close me=new close();
		open he=new open();
		
		me.eat();
		//he.eat();

	}

}
