package Session_46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerclass implements ITestListener{


public void onTestSuccess(ITestResult result) {
 System.out.println("testcase pass");
}
public void onTestFailure(ITestResult result) {
	 System.out.println("testcase failed");
  }
public void onTestSkipped(ITestResult result) {
	 System.out.println("testcase skipped");
  }
public void onStart(ITestContext context) {
	 System.out.println("testcases exuction started");
  }
public void onFinish(ITestContext context) {
	 System.out.println("testcases exuction completed");

} 
}