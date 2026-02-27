package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SaucePageLogin;

public class Saucedemo {

    SaucePageLogin sp;

    public Saucedemo() {
        sp = new SaucePageLogin(DriverFactory.getDriver());
    }

    @Given("user should enter the valid username")
    public void user_should_enter_the_valid_username() {
       sp.enterUserName("standard_user");
    }

    @When("user can enter the  valid password")
    public void user_can_enter_the_valid_password() {
       sp.enterpassword("secret_sauce");
    }

    @When("click on the login button")
    public void click_on_the_login_button() {
       
    	sp.clickonlogin("");
    }
    
    

    @When("user logged into the application successfully")
    public void user_logged_into_the_application_successfully() {
       System.out.println("login to the application successfully");
    }
    
    @When("user select the product")
    public void user_select_the_product() {
        sp.selectproduct("");
    }

    @When("user add the product into cart")
    public void user_add_the_product_into_cart() {
        sp.addtheproduct("");
    }

    @When("user navigate to the cart")
    public void user_navigate_to_the_cart() {
        sp.shoppingcart("");
    }
    
    @When("user click on checkout button")
    public void user_click_on_checkout_button() {
        sp.checkout("");
    }
    
    @When("user can enter the first name")
    public void user_can_enter_the_first_name() {
        sp.enterFirstName("ABC");
    }

    @When("user can enter the last name")
    public void user_can_enter_the_last_name() {

       // WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
        
     //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName"))); 
        // Replace "lastName" with your actual locator

        sp.enterLastName("EFG");
    }

    @When("user can enter the zip\\/postal code")
    public void user_can_enter_the_zip_postal_code() {
       sp.entePostalcode("123456");
    }
    
    @When("user can click on continue button")
    public void user_can_click_on_continue_button() {
        sp.Continue("");
    }

    @When("user can click on cancel button")
    public void user_can_click_on_cancel_button() {
        sp.cancel("");
    }
    
    @When("user can complete the order process")
    public void user_can_complete_the_order_process() {
    	 System.out.println("complete order process successfully");
    }
    
    @When("user can click on cart container")
    public void user_can_click_on_cart_container() {
        sp.cartcontainer("");
    }

    @When("user can remove the added product successfully")
    public void user_can_remove_the_added_product_successfully() {
        sp.Remove("");
    }

    @Then("user can clcik on continue the shopping button navigates to home page")
    public void user_can_clcik_on_continue_the_shopping_button_navigates_to_home_page() {
        sp.Continueshopping("");
    }


    }