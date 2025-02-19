package Session_12;

public class encapsulation {
	private int name;
	private String wordString;
	private int rollno;
	//method
	public int getName() {//it will show the value
		System.out.println(name);
		return name;
	}
	public void setName(int name) {//it will assign the value
		this.name = name;
	}
	public String getWordString() {
		return wordString;
	}
	public void setWordString(String wordString) {
		this.wordString = wordString;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
