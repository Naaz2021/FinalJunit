package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	@Test
public void TechfiosLoginTest() {
	WebDriver driver=BrowserFactory.startbrowser("chrome"," http://techfios.com/test/101/");
	LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	lp.insertcategory(null);
	lp.clickaddelement();
	
	lp.validatingjunitcheckbox();
	lp.validatingtoggleallcheckbox();
	
	lp.validatingcheckboxelement();
	lp.removeelement();
	//lp.validatingjunitcheckbox();

	//driver.close();
	//driver.quit();
}
}

