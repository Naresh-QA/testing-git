package Test;

import java.util.Scanner;

class employee{
	String name;
	String designaition;
	int salary;
	double bonus;
	public void bonuss() {
		//double bonus=(0.2);}
		if (designaition.equals("manager"))
{
			bonus=0.2*salary;
			//System.out.println("name of the employee"+ name +"designation :" + designaition);
		}
		else if (designaition.equals("Developer")) {
			 bonus=(0.1*salary);
			
		}
		 else {
			  bonus=(0.05*salary);
		}
	}
	void print() {
		System.out.println(name);
		System.out.println(salary);
		System.out.println(designaition);
		System.out.println(bonus);
	}
	
}
public class Oops_conditions {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		employee where=new employee();
		where.name = scanner.next();
		where.salary=scanner.nextInt();
		where.designaition=scanner.next();
		where.bonuss();
		where.print();

	}

}

/*class Employee {
    String name;
    String designaition;
    int salary;
    double bonus;

    public void bonuss() {
        if (designaition.equals("manager")) {
            bonus = 0.2 * salary;
        } else if (designaition.equals("Developer")) {
            bonus = 0.1 * salary;
        } else {
            bonus = 0.05 * salary;
        }
    }

    void print() {
        System.out.println("Name of the employee: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designaition);
        System.out.println("Bonus: " + bonus);
    }
}

public class Oops_conditions {
    public static void main(String[] args) {
        Employee where = new Employee();
        where.name = "Naresh";
        where.salary = 1000;
        where.designaition = "Developer";

        where.bonuss(); // Call this method to calculate the bonus
        where.print();
    }
}*/



