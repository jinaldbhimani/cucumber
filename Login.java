package steps;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import runner.BaseClass;

public class Login extends BaseClass {

	@And("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	    
	}
	@And("Enter the password as {string}")//Demosalesmangar
	public void enter_the_password_as_crmsfa(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword);
	   
	}
	@When("click the login button")//crmsfa
	public void click_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	   
	}
	@Then("homepage should diplayed")
	public void homepage_should_diplayed1() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	  if (displayed) {
		  System.out.println("Homepage displayed");
	  }
		  else {
			  System.out.println("Homepage not displayed");
			
		}
	}

	@But("Error msg should be displayed")
	public void errormsg() {
		boolean errormsg = driver.findElement(By.id("errorDiv")).isDisplayed();
		 if (errormsg) {
			  System.out.println("Error msg displayed");
		  }
			  else {
				  System.out.println("Error msg  not displayed");
				
			}
	}
	@When("click on CRMSFA")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@Then("Myhomepage should be displayed")
	public void verifyMyHomePage() {
		boolean displayed = driver.findElement(By.xpath("//div[text()='My Home']")).isDisplayed();
		if (displayed) {
			System.out.println("My Homepage displayed");
		} else {
			System.out.println("My Homepage is not displayed");
		}

	}

}
	
	
		


		
	
			
				
			
		

		
	
	

	

