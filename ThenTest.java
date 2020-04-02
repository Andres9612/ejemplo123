package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ThenTest {
	
	WebDriver driver = WhenTest.driver;
	
	 @Then("Successful buy")
	 public void Successful_buy() {
	     // Write code here that turns the phrase above into concrete actions
		 //System.out.println("Primer Then");
		 
		 Assert.assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=order-confirmation&id_cart=1675053&id_module=30&id_order=179458&key=272342170b89337f911ec61d0d8c3f0d"));
		 System.out.println("Success!!");
	 }

}
