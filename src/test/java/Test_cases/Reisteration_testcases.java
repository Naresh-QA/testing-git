package Test_cases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import pom_files.Homepage;
import pom_files.Registeration_pom;

public class Reisteration_testcases extends Base_testcases {
@Test
void register() {
	Homepage hp=new Homepage(driver);
	hp.register();
	Registeration_pom reg=new Registeration_pom(driver);
	reg.setbusinessname(randomString());
	reg.setfullname("naresh");
	
}


}
