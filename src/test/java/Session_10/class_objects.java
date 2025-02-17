package Session_10;

public class class_objects {
	//VARIABLES
	public int eid;
	public String name;
	public String job;
	public int salary;
	//methods
	public void print(){
		System.out.println(eid);
		System.out.println(name);
		System.out.println(job);
		System.out.println(salary);
		
	}
	

	public static void main(String[] args) {
		class_objects e1=new class_objects();
		e1.eid=001;
		e1.job="testong";
		e1.salary= 100000;
		e1.name="naresh";
		e1.print();

	}

}
