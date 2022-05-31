package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import runner.BaseClass;

public class CreateLead extends BaseClass{
	

	@Given("click on Lead") 
	public void clickOnLead() {
		driver.findElement(By.linkText("Leads")).click();
		
	}
	@And ("click on create lead")
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	/*@And ("Enter company name as {string}")
	public void companyName(String Cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
		}
	@And ("Enter FIrst as {string} and last name as {string}")
	public void EnterName(String fname,String Lname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		
	}
	@When("click on create lead  button")
	public void submitLead() {
		driver.findElement(By.className("smallSubmit")).click();
		
	}
	@Then("lead should be created")
	public void createLeadPage() {*/
		
		
		
			
		
	}



