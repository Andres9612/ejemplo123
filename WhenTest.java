package stepDefinitions;

import io.cucumber.java.en.When;
import pageObjects.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhenTest {
	
	public static WebDriver driver = GivenTest.driver;
	LoginPage lg;
	 @When("User enters username as {string}")
	 public void user_enters_username_as(String username) {
		 lg = new LoginPage(driver);
		 lg.sendEmail("email");
	 }			

	 @When("User enters password as {string}")
	 public void user_enters_password_as(String password) {
		 lg.sendPassword("password");
	 }
	 


	 @When("User click on sign in button")
	 public void user_click_on_sign_in_button() {
		 lg.clickSubmit();
	 }
	 
	 @When("User search dress")
	 public void user_search_dress() throws Exception {
		 lg.searchDress();
		 Thread.sleep(5000);
	 }
	 
	 @When("User click on dress button")
	 public void user_click_on_dress_button() throws Exception {
		 lg.clickDress(); 
		 Thread.sleep(5000);
	 }
	 
	 @When("User click on add to cart button")
	 public void user_click_on_add_to_cart_button() {
		 lg.clickaddToCart();
	 }
	 
	 @When("User click on Proceed to checkout")
	 public void user_click_on_Proceed_to_checkout_button() {
		 lg.clickcheckout1();
	 }

	 @When("User click on checkout2")
	 public void user_click_on_checkout2_button() {
		 lg.clickcheckout2();
	 }
	 
	 @When("User click on checkout3")
	 public void user_click_on_checkout3_button() {
		 lg.clickcheckout3();
	 }
	 

	 @When("User click on accept")
	 public void user_click_on_accept_button() {
		 lg.accept();
	 }
	 
	 
	 @When("User click on checkout4")
	 public void user_click_on_checkout4_button() {
		 lg.clickcheckout4();
	 }

	 @When("User click on pay")
	 public void user_click_on_pay_button() {
		 lg.clickpay();
	 }
	 
	 @When("User click on confirm")
	 public void user_click_on_confirm() {
		 lg.clickconfirm();
	 }
	 
}
