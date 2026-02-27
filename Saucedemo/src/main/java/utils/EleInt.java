package utils;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import timeUnits.TimeUnits;



public class EleInt {

	

	
	private static WebDriver driver;

		//********************constructor**************************
		public EleInt(WebDriver driver) {
			EleInt.driver=driver;
			PageFactory.initElements(driver, this);
			}
	// Click on a WebElement
	public static void click(WebElement element) {
		
		element.click();
		
	
	}

	// Type text into an input field
	public static void typeText(WebElement element, String text) {
		System.out.println("_-------------> "+text);
		element.sendKeys(text);
	}

	// Clear text from an input field
	public static void clearText(WebElement element) {
		element.clear();
		
		
	}

	// Press Enter key on a WebElement
	public static void pressEnter(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}

	// Press Tab key on a WebElement
	public static void pressTab(WebElement element) {
		element.sendKeys(Keys.TAB);
	}

	// Get text from a WebElement
	public static String getText(WebElement element) {
		return element.getText();
	}

	// Check if a WebElement is displayed
	public static boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	// Check if a WebElement is enabled
	public static boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	// Check if a WebElement is selected (for checkboxes or radio buttons)
	public static boolean isSelected(WebElement element) {
		return element.isSelected();
	}

	// Submit a form using a WebElement (e.g., a submit button)
	public static void submitForm(WebElement element) {
		element.submit();
	}

	// Add more utility methods as needed for your specific testing requirements

	// Enables FullSctreen Window
	public static void setFullScreen(WebDriver driver) {
		JavascriptExecutor JsExec = (JavascriptExecutor) driver;
		JsExec.executeScript("window.scrollTo(0, 0);"); // Scroll to top to ensure window is visible
		JsExec.executeScript(
				"window.setTimeout(function() { window.moveTo(0, 0); window.resizeTo(screen.width, screen.height); }, 500);");
	}

	/** START>>>These two methods deal with each other **/

	public static By clickIfPresent(WebDriver driver, By locator) {
		WebElement element = waitForElementPresence(driver, locator);
		if (element != null) {
			element.click();
		} else {
			System.out.println("Element not found within the timeout period.");
			return null;

		}
		return locator;
	}

	private static WebElement waitForElementPresence(WebDriver driver, By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TimeUnits.EXPECTED_TIME_WEBELE));
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			return null;
		}

	}

	/***** <<<<<<<<<*END */

	/** START >>> **/
	public static WebElement clickIfPresent(WebDriver driver, WebElement element) {
		
	    
		if (isElementPresent(element) &&element != null) {
			element.click();
			return element;
		}
		return null;      

	}
	public static boolean isElementPresent(WebElement element) {
        try {
            // Attempt to access a property of the element to check its presence
            element.isDisplayed();
            return true; // No exception, element is present
        } catch (NoSuchElementException | NullPointerException e) {
            return false; // Element not present or null
        }
    }
	
	 // ✅ FIXED ALERT DISMISS METHOD
    public static boolean alertdismiss() {
        WebDriver activeDriver = getActiveDriver(); 
        if (activeDriver == null) {
            System.out.println(" WebDriver is null in alertdismiss(). Make sure it’s initialized before calling.");
            return false;
        }

        try {
            WebDriverWait wait = new WebDriverWait(activeDriver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = activeDriver.switchTo().alert();
            System.out.println(" Alert found: " + alert.getText());
            alert.dismiss();
            System.out.println(" Alert dismissed successfully.");
            return true;
        } catch (TimeoutException e) {
            System.out.println("No alert appeared within timeout.");
        } catch (Exception e) {
            System.out.println(" Error dismissing alert: " + e.getMessage());
        }
        return false;
    }

    // ✅ FIXED ALERT ACCEPT METHOD
    public static boolean alertaccept() {
        WebDriver activeDriver = getActiveDriver(); 
        if (activeDriver == null) {
            System.out.println("WebDriver is null in alertaccept(). Make sure it’s initialized before calling.");
            return false;
        }

        try {
            WebDriverWait wait = new WebDriverWait(activeDriver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = activeDriver.switchTo().alert();
            System.out.println(" Alert found: " + alert.getText());
            alert.accept();
            System.out.println("Alert accepted successfully.");
            return true;
        } catch (TimeoutException e) {
            System.out.println(" No alert appeared within timeout.");
        } catch (Exception e) {
            System.out.println(" Error accepting alert: " + e.getMessage());
        }
        return false;
    }

   
    private static WebDriver getActiveDriver() {
        
        if (driver != null) {
            return driver;
        }

        try {
            Class<?> baseClass = Class.forName("base.BaseClass");
            return (WebDriver) baseClass.getMethod("getDriver").invoke(null);
        } catch (Exception e) {
            System.out.println(" Could not get WebDriver from BaseClass: " + e.getMessage());
        }

        
        try {
            Class<?> factoryClass = Class.forName("utils.DriverFactory");
            return (WebDriver) factoryClass.getMethod("getDriver").invoke(null);
        } catch (Exception e) {
            System.out.println("Could not get WebDriver from DriverFactory: " + e.getMessage());
        }

        System.out.println(" No active WebDriver found.");
        return null;
    }

    public static void typeText1(WebElement enterComments, String value) {
        enterComments.sendKeys(value);
    }
}

/** <<<<<<< END */
