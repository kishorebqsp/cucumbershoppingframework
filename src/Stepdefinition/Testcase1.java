package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pom.Cartpage;
import Pom.Dresspage;
import Pom.Homepage;
import Pom.Loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testcase1 {
	public WebDriver driver;
	@Given("^user should click on sign$")
	public void user_should_click_on_sign() {
		driver=new FirefoxDriver();
		driver.get("http://automationpractice.com");
	Loginpage l=new Loginpage(driver);
	l.signbtn();
	   
	}

	@When("^Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_valid_and(String username, String password) {
		Loginpage l=new Loginpage(driver);
		l.emailaddresstb(username);
		l.passwordbtn(password);
	}	
	

	@When("^click on login button$")
	public void click_on_login_button() {
		Loginpage l=new Loginpage(driver);
		l.login();
	}

	@Then("^user should be succesfully login$")
	public void user_should_be_succesfully_login() {
	   System.out.println("home page should be dispalyed");
	}

	@When("^click on seaarch box and search for dress$")
	public void click_on_seaarch_box_and_search_for_dress() {
	  Homepage h=new Homepage(driver);
	  h.serachtb("dress");
	  h.serachbtn();
	}

	@Then("^user should navigate to dress page$")
	public void user_should_navigate_to_dress_page() {
		System.out.println("dresspage should be dispalyed");
	
	}

	@When("^select the dress and add to cart$")
	public void select_the_dress_and_add_to_cart() {
		 Dresspage d=new Dresspage(driver);
		 d.dressselected();
	}

	@Then("^product should be add to cart and close the page$")
	public void product_should_be_add_to_cart_and_close_the_page() throws InterruptedException {
	   Cartpage c=new Cartpage(driver);
	   c.addtocart();
	   Thread.sleep(3000);
	   c.closebtn();
	}

	

	@Then("^logout page should be disaplyaed$")
	public void logout_page_should_be_disaplyaed() {
	   System.out.println("user should be logout");
	}


}
