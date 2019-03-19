/*package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginstepDefinition {
	WebDriver driver;
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kumar\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://classic.crmpro.com/login.cfm");
	    
	}
	@When("^Title of login page is CRMPRO Log In Screen")
	public void title_of_login_page_is_CRMPRO_Log_In_Screen(){
		String Logintitle=driver.getTitle();
		System.out.println(Logintitle);
		Assert.assertEquals("CRMPRO Log In Screen",Logintitle);
	    
	}
	//Regular  Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String password){
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	    
	}
	
	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button(){
		driver.findElement(By.xpath("//input[@value='Login']")).submit();
	   
	}
	@Then("^User is on home page$")
	public void user_is_on_home_page() throws InterruptedException{
		Thread.sleep(3000);
		String hometitle=driver.getTitle();
		System.out.println(hometitle);
		Assert.assertEquals("CRMPRO",hometitle);
	}
	@Then("^User move to contacts$")
	public void user_move_to_contacts() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
		
		driver.findElement(By.linkText("New Contact")).click();
		}
	@Then("^User enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String fristname, String lastname, String position) {
		driver.findElement(By.id("first_name")).sendKeys(fristname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.id("company_position")).sendKeys(position);
	    
	}

	@Then("^User save the details$")
	public void user_save_the_details(){
		driver.findElement(By.xpath("//input[@value='Save']")).submit();
	    
	}
	
	@Then("^close the browser$")
	public void close_the_browser(){
		driver.quit();
	}
	   
	   

}*/
