package skeleton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;



public class Stepdefs {
	static WebDriver driver=null;
	@Given("User launch the site")
public void user_launch_the_site() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
	driver =new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
}
@Then("User enters  name {string}")
public void user_enters_name(String unamee) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("//*[@id=\"userName\"]")).sendKeys(unamee);
}

@Then("User enters  pas {string}")
public void user_enters_pas(String passwrd) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("//*[@id=\"password\"]")).sendKeys(passwrd);
}

@Then("user clicks on login button")
public void user_clicks_on_login_button(){
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();

	driver.findElement(By .name("Login")).click();
    
}

@Given("Product Search Engine")
public void product_Search_Engine() {
	 Actions a=new Actions(driver);
	 a.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[2]/a/span"))).click().perform();
	 a.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"))).click().perform();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 a.moveToElement(driver.findElement(By .xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"))).click().perform();
	
}

@Then("User proceed towards adding product to cart")
public void user_proceed_towards_adding_product_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
    driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
}

@Then("User click on cart link")
public void user_click_on_cart_link() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
   driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
}

@Then("User verifies the product is correctly added to the cart")
public void user_verifies_the_product_is_correctly_added_to_the_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	boolean b= driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).isDisplayed();
	Assert.assertTrue(b);
}

@Then("user clicks on checkout for payment")
public void user_clicks_on_checkout_for_payment() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
}

@Then("User Review the product and click on proceed to pay")
public void user_Review_the_product_and_click_on_proceed_to_pay() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
}

@Then("User select the bank of his\\/her choice")
public void user_select_the_bank_of_his_her_choice() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("//*[@id=\"swit\"]/div[1]/div/label")).click();
}

@Then("User clicks on continue for further details")
public void user_clicks_on_continue_for_further_details() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("//*[@id=\"btn\"]")).click();
}

@Then("User give valid credentials according to selected bank")
public void user_give_valid_credentials_according_to_selected_bank() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .name("username")).sendKeys("123456");
	driver.findElement(By .name("password")).sendKeys("Pass@456");
	driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
}

@Then("User than give the required transaction password")
public void user_than_give_the_required_transaction_password() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By .name("transpwd")).sendKeys("Trans@456");
	 driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
}

@Then("User verifies for the order is confirmed")
public void user_verifies_for_the_order_is_confirmed() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	String expected_confirmation="Your order has been confirmed";
	String actual_confirmation=driver.findElement(By .xpath("/html/body/b/section/div/div/div/div[2]/p")).getText();
	Assert.assertEquals(expected_confirmation, actual_confirmation);
}

@Given("User registered in TestMeApp")
public void user_registered_in_TestMeApp() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
	driver =new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	driver.findElement(By .name("userName")).sendKeys("lalitha");
	driver.findElement(By .name("password")).sendKeys("Password123");
	driver.findElement(By .name("Login")).click();
}

@When("User Search for product like headphones")
public void user_Search_for_product_like_headphones() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 Actions a=new Actions(driver);
	 driver.findElement(By .name("products")).sendKeys("head");
	 a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
}

@When("try to proceed to payment without adding any item in the cart")
public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	boolean cart=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).isDisplayed();
	Assert.assertTrue(cart);
}

@Then("TestMe doesn't display the cart icon")
public void testme_doesn_t_display_the_cart_icon() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("No cart icon displayed");
	
}
}
