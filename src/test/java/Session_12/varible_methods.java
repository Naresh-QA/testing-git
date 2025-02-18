package Session_12;

public class varible_methods {
	int id;
	String nameString;
	void print_statement()
	{
		System.out.println(id+"  "+nameString);
	}
	void setdata(int pid,String names)
	
	{
		id=pid;
		nameString=names;
	}
	varible_methods(int pid,String names) {
		id=pid;
		nameString=names;
	}
	

}
