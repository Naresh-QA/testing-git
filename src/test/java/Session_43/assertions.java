package Session_43;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertions {
	@ Test
	void pass() {
		SoftAssert we=new SoftAssert();
		String aString="qwerty";
		String bString="qwerty";
		System.out.println("testing");
		System.out.println("testing2");
		//assertEquals(aString, bString);
		we.assertEquals(aString, bString);//softassert
		System.out.println("testing3");
		System.out.println("testing4");
		we.assertAll();
	}
}
