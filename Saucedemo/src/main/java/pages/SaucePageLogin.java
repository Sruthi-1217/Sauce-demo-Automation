package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driverfactory.DriverFactory;
import utils.EleInt;

public class SaucePageLogin extends DriverFactory {
	//********************constructor**************************
		public SaucePageLogin(WebDriver driver) {
			PageFactory.initElements(driver, this);
			}
		
		//*******************xpath for login screen ***********************
		@FindBy(xpath="//input[@placeholder='Username']")
		private WebElement UserName;
		
		
		@FindBy(xpath="//input[@placeholder='Password']")
		private WebElement Password;
		
		@FindBy(xpath="//input[@name='login-button']")
		private WebElement Login;
		
		@FindBy(xpath="//input[text='OK")
		private WebElement OK;
          
        
	   @FindBy(xpath="//a[@id='item_4_img_link']")
		private WebElement selecttheproduct;
        
	   @FindBy(xpath="//button[@id='add-to-cart']")
		private WebElement addtocart;
     
	   @FindBy(xpath="//div[@id=\"shopping_cart_container\"]")
		private WebElement shoppingCart;
	   
	   @FindBy(xpath="//button[@id=\"checkout\"]")
	   private WebElement checkout;
	 
	   @FindBy(xpath="//input[@placeholder=\"First Name\"]")
		private WebElement FirstName;
	   
	   @FindBy(xpath="//input[@placeholder=\"Last Name\"]")
		private WebElement LastName;
	   
	   @FindBy(xpath="//input[@placeholder=\"Zip/Postal Code\"]")
		private WebElement postalcode;
	   
	   @FindBy(xpath="//input[@id=\"continue\"]")
	   private WebElement Continue;
	   
	   @FindBy(xpath="//button[@id=\"cancel\"]")
		private WebElement cancelbutton;
	   
	   @FindBy(xpath="//div[@class=\"shopping_cart_container\"]")
	   private WebElement cartcontainer;
	 
	   @FindBy(xpath="//button[@id=\"remove-sauce-labs-backpack\"]")
	   private WebElement Removebutton;
	   
	   @FindBy(xpath="//button[@id=\"continue-shopping\"]")
	   private WebElement Continueshopping;
	 
	
	   
	 

    //**************************methods**********************************
        
        public void enterUserName(String value)
    	{
    		EleInt.typeText(UserName,value);
    	}
        
        public void enterpassword(String value)
    	{
    		EleInt.typeText(Password,value);
    	}
        
        
        public void clickonlogin(String value)
    	{
    		EleInt.click(Login);
    	}
        
        
        public void clickok(String value)
    	{
    		EleInt.click(OK);
    	}
        
        public void selectproduct(String value)
    	{
    		EleInt.click(selecttheproduct);
    	}
        
        
        public void addtheproduct(String value)
    	{
    		EleInt.click(addtocart);
    	}
        
        public void shoppingcart(String value)
    	{
    		EleInt.click(shoppingCart);
    	}
        
        public void checkout(String value)
    	{
    		EleInt.click(checkout);
    	}
        
        public void enterFirstName(String value)
    	{
    		EleInt.typeText(FirstName,value);
    	}
        
        public void enterLastName(String value)
    	{
    		EleInt.typeText(LastName,value);
    	}
        
        public void entePostalcode(String value)
    	{
    		EleInt.typeText(postalcode,value);
    	}
        
        public void Continue(String value)
    	{
    		EleInt.click(Continue);
    	}

        public void cancel(String value)
    	{
    		EleInt.click(cancelbutton);
    	}

        public void cartcontainer(String value)
    	{
    		EleInt.click(cartcontainer);
    	}

        public void Remove(String value)
    	{
    		EleInt.click(Removebutton);
    	}

        public void Continueshopping(String value)
    	{
    		EleInt.click(Continueshopping);
    	}

}

