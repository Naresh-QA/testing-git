package Session_43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_after_method {

	//public static void main(String[] args) {
		@ Test(priority=1)
		void search(){
			System.out.println("Search successfull");
	}
		@BeforeMethod
		void login() {
			System.out.println("login successful");
		}
		@AfterMethod
		void logout() {
			System.out.println("logout successful");
		}
		@ Test(priority=2)
		void advsearch() {
			System.out.println("adv search successful");
		}
}
