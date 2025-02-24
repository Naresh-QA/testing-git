package Test;

import java.io.InputStream;
import java.util.Scanner;

class bankaccount{
	private int accountnumber;
	private int balance;
	private String name;
	//static int initalbalance=1000;
	private int deposit;
	private int withdraw;
	private int newbalance;
	
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
		newbalance =deposit+balance;
	}
	public int getDeposit() {
		deposit=deposit+balance;
		System.out.println("New balance is : "+(deposit+balance));
		return deposit+balance;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		System.out.println("withdraw amount: "+ withdraw+ ", newbalance : "+(newbalance-withdraw));
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
	Scanner scanner = new Scanner(System.in);
	bankaccount where=new bankaccount(); 
	System.out.println("enter a number : ");
	 //scanner.nextLine();
	 
	where.setBalance(scanner.nextInt());
	where.getBalance();
	System.out.println("enter amount to deposit : ");
	where.setDeposit(scanner.nextInt());
	where.getNewbalance();
	System.out.println("enter amount to withdraw : ");
	where.setWithdraw(scanner.nextInt());
	where.getWithdraw();
System.out.println("enter name : ");
	where.setName(scanner.next());
	where.getName();
	

}
}

