package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {
	
	WebDriver driver = BaseClass.driver;
	
	ExtentTest test = BaseClass.test;
	
	//---------------------------------------------WebElements------------------------------------//
	
	@FindBy(className = "login")
	WebElement LoginLink;
	
	@FindBy(name = "user_login")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(name = "btn_login")
	WebElement LoginBtn;
	
	@FindBy(className = "rememberMe")
	WebElement RememberMe;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//-------------------------------Functions----------------------------------------------------//
	
public void LoginFunction(String UserNameVal, String PassVal) {
		
	
		
		LoginLink.click();
		test.log(LogStatus.PASS, "Click on Login Link","Login link clicked successfully");
		
		UserName.sendKeys(UserNameVal);
		test.log(LogStatus.PASS, "Enter UserName","Name Entered successfully");
		
		Password.sendKeys(PassVal);
		test.log(LogStatus.PASS, "Enter Password","Password Entered successfully");
		
		RememberMe.click();
		test.log(LogStatus.PASS, "Click on Remember Me","clicked successfully");
		
		LoginBtn.click();
		test.log(LogStatus.PASS, "Click on Login button","Login button clicked successfully");
	}
   // public void UICheck() {
    //	WebElement UserName = driver.findElement(By.name("user_login"));
    }

