package Test;

import java.io.InputStream;

class bankaccount{
	private int accountnumber;
	private int balance;
	private String name;
	//static int initalbalance=1000;
	private int deposit;
	private int withdraw;
	private int newbalance;
	public bankaccount(InputStream in) {
		// TODO Auto-generated constructor stub
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getBalance() {
		System.out.println("initial balance: "+ balance);
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNewbalance() {
		newbalance=(deposit+balance);
		System.out.println("deposited amount: "+deposit +" . new balance : "+(deposit+balance));
		return newbalance;
	}
	public void setNewbalance(int newbalance) {
		this.newbalance = newbalance;
	}
	public int getDeposit() {
		return deposit+newbalance;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		System.out.println("withdraw amount: "+ withdraw+ "newbalance : "+(newbalance-withdraw));
		return newbalance-withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}

public class test_work {
public static void main(String[] args) {
	
	bankaccount where=new bankaccount(System.in); 
	System.out.println("enter a number : ");
	int setbalance=where.nextInt();
	where.getBalance();

		/*where.setBalance(1000);
		where.setAccountnumber(123456789);
		where.setName("naresh");
		where.setDeposit(1000);
		where.setWithdraw(200);
		where.getAccountnumber();
		where.getBalance();
		where.getName();
		where.getDeposit();
		where.getNewbalance();
		where.getWithdraw();*/
		
	

}
}

