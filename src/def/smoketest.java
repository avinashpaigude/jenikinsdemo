package def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smoketest 
{
	WebDriver driver;
	@Given("^a facebook url$")
	public void a_facebook_url() throws Throwable 
	{
	    driver = new FirefoxDriver();
	    driver.get("http://www.facebook.com");
	    driver.manage().window().maximize();
	}

	@When("^user enters the username and valid password$")
	public void user_enters_the_username_and_valid_password() throws Throwable 
	{
		driver.findElement(By.id("email")).sendKeys("avinashpaigude@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sfsfsf");
		driver.close();
		System.out.println("this is the  new change");
	
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable 
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
	
	}

	@Then("^use should be login to the application$")
	public void use_should_be_login_to_the_application() throws Throwable 
	{
	driver.close();
	}
	
	@Given("^a gmail url$")
	public void a_gmail_url() throws Throwable 
	{
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
	 
	}

	@When("^user enters the username and valid password for gmail$")
	public void user_enters_the_username_and_valid_password_for_gmail() throws Throwable 
	{
		
	  
	}

	@When("^click on login button for gmail$")
	public void click_on_login_button_for_gmail() throws Throwable 
	{
	
	}



}
