package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

WebDriver driver;


public LoginPage(WebDriver driver) {
	
	this.driver=driver;
}

@FindBy(how=How.XPATH,using="/html/body/div[4]/input[1]")WebElement ADD_CATEGORYELEMENT;
@FindBy(how=How.XPATH,using="/html/body/div[4]/input[2]")WebElement CLICKADD_BUTTON_ELEMENT;
@FindBy(how=How.XPATH,using="//*[@id=\"todos-content\"]/form/ul/li/input")WebElement JUNITCHECKBOX_ELEMENT;

//@FindBy(how=How.NAME,using="//*[name=allbox")WebElement TOGGLEALLCHECKBOX_ELEMENT;
@FindBy(how=How.XPATH,using="/html/body/div[3]/input[3]")WebElement TOGGLEALLCHECKBOX_ELEMENT;
public void insertcategory(String Category) {
	
	Random rnd=new Random();
	int generatedNumber=rnd.nextInt(999);
	
	
		
	ADD_CATEGORYELEMENT.sendKeys(Category+generatedNumber);
	
}
public void clickaddelement() {
	CLICKADD_BUTTON_ELEMENT.click();
}

public void validatingjunitcheckbox() {
	JUNITCHECKBOX_ELEMENT.click();
}


public void validatingtoggleallcheckbox() {
	TOGGLEALLCHECKBOX_ELEMENT.click();
}

@FindBy(how=How.XPATH,using="//*[@id=\"todos-content\"]/form/ul/li[1]")WebElement CHECKBOX_ELEMENT;
@FindBy(how=How.XPATH,using="/html/body/div[3]/input[1]")WebElement REMOVE_ELEMENT;



public void validatingcheckboxelement() {
	CHECKBOX_ELEMENT.click();
}
public void removeelement() {
	REMOVE_ELEMENT.click();
}
}
//public void validatingjunitcheckbox() {
//	JUNITCHECKBOX_ELEMENT.click();
//}
