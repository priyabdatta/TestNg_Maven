package testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;

@Listeners(TestNgListenerClass.class)

public class LoginTest extends BaseClass{
	
	  @Test
		public void LoginFailiurTest() {
		// test = report.startTest(" LoginFailiurTest");
		   
		   LoginPage login = new LoginPage();
		 
			login.LoginFunction("xyz@abc.com", "Abc@12345");
			
			WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
			
			String ActualMsg = ErrorMsg.getText();
			String ExpMsg = "The email or password you have entered is invalid.";
			
			Assert.assertEquals(ActualMsg, ExpMsg);
			
		//	report.endTest(test);

	}   @Test
	   public void LoginSuccessTest() {
		// test = report.startTest("LoginSuccessTest");
		
		LoginPage  login = new LoginPage();  
		login.LoginFunction("xyz@abc", "Abc@12345");
		//report.endTest(test);	  
}
	
	@Test
	@Parameters({"Param1" , "Param2"})
	public void ParameterizedTest(String UserNameVal, String PasswordVal) {
		
		LoginPage login = new LoginPage();
		login.LoginFunction(UserNameVal, PasswordVal);
		
	}
	@Test
	public void ExternalDataTest() {
		
		String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal = sheet.getRow(1).getCell(1).getStringCellValue();
		
		LoginPage login = new LoginPage();
		login.LoginFunction(UserNameVal, PasswordVal);
	}
}	   
