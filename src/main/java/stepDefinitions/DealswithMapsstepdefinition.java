package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealswithMapsstepdefinition {
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
	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable credentials){
		for (Map<String,String> data:credentials.asMaps(String.class, String.class))
		{
	
		driver.findElement(By.name("username")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
		
	}
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
	@Then("^User move to deals$")
	public void user_move_to_deals() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
		
		driver.findElement(By.linkText("New Deal")).click();
		}
	@Then("^User enters deals details$")
	public void user_enters_deals_details(DataTable datavalues) throws InterruptedException{
		
		
		
		for(Map<String,String> inputs:datavalues.asMaps(String.class, String.class)){
			
		driver.findElement(By.id("title")).sendKeys(inputs.get("title"));
		driver.findElement(By.id("amount")).sendKeys(inputs.get("amount"));
		driver.findElement(By.id("probability")).sendKeys(inputs.get("probability"));
		driver.findElement(By.xpath("//input[@value='Save']")).submit();
		//Thread.sleep(5000);
		//driver.switchTo().frame("mainpanel");
		
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
		
		driver.findElement(By.xpath("//a[@title='New Deal']")).click();
	}
	}
	
	@Then("^quit browser$")	public void quit_browser(){
		driver.quit();
	}
	   
}



