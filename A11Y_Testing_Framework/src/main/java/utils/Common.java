package utils;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


public class Common {
    private static WebDriver driver;
    public static URL scriptUrl;

    public Common(WebDriver driver)
    {
        if(this.driver==null) {
        	this.driver = driver;
        }
            
    }
    
    public static void setUp() {
    	
    	scriptUrl = Common.class.getResource("src/test/resources/axe.min.js");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/AccessibilityTesting/src/test/resources/Drivers/chromedriver.exe");
		
    }

//    public boolean pressEnter(WebDriver driver, String sourceXpath, String expectedTarget)
//    {
//        getElement(driver, sourceXpath).sendKeys(Keys.ENTER);
//        return getElement(driver,expectedTarget).isDisplayed();
//    }
//    
//    public void pressDown() throws AWTException
//    {
//    	Robot robot = new Robot();
//    	robot.keyPress(KeyEvent.VK_DOWN);
//    }
//    
//    public void pressUp() throws AWTException
//    {
//    	Robot robot = new Robot();
//    	robot.keyPress(KeyEvent.VK_UP);
//    }
//    
//    public void pressEnter() throws AWTException
//    {
//    	Robot robot = new Robot();
//    	robot.keyPress(KeyEvent.VK_ENTER);
//    }
//    
//    public void performSearch(String searchText, String locator, WebDriver driver)
//    {
//        getElement(driver,locator).sendKeys(searchText);
//
//    }
//
//    public WebElement getElement(WebDriver driver, String locator)
//    {
//        String locatorType = locator.split(":")[0];
//        String locatorValue = locator.split(":")[1];
//        switch(locatorType)
//        {
//            case "id": return driver.findElement(By.id(locatorValue));
//            case "xpath": return driver.findElement(By.xpath(locatorValue));
//            case "linktext": return driver.findElement(By.linkText(locatorValue));
//        }
//
//        return null;
//    }
//    
//    public void verifyTabNavigationValidation(WebElement source, WebElement destination, int number) throws InterruptedException {
//    	source.click();
//
//		WebElement sourcefocus = driver.switchTo().activeElement();
//
//		Assert.assertTrue(source.equals(sourcefocus), "Focus is not on source");
//
//		try {
//			Robot robot = new Robot();
//
//			for (int interation = 1; interation <= number; interation++) {
//				robot.keyPress(KeyEvent.VK_TAB);
//				robot.keyRelease(KeyEvent.VK_TAB);
//			}
//		}catch(Exception e){
//		}
//
//		Thread.sleep(1000);
//		WebElement destinationfocus = driver.switchTo().activeElement();
//		
//		Assert.assertTrue(destination.equals(destinationfocus), "Focus is not on destination");
//
//	}
//    public void verifyTabNavigationValidation(WebElement source, WebElement destination) throws InterruptedException {
//    
//		WebElement sourcefocus = driver.switchTo().activeElement();
//
//		Assert.assertTrue(source.equals(sourcefocus), "Focus is not on source");
//
//		sourcefocus.sendKeys(Keys.TAB);
//		Thread.sleep(2000);
//		WebElement destinationfocus = driver.switchTo().activeElement();
//		Assert.assertTrue(destination.equals(destinationfocus), "Focus is not on destination");
//
//	}
//    
//    public void verifyUpArrowNavigationValidation(WebElement source, WebElement destination, int number) throws InterruptedException {
//		source.click();
//		WebElement sourcefocus = driver.switchTo().activeElement();
//		Assert.assertTrue(source.equals(sourcefocus), "Focus is not on source");
//
//		try {
//			Robot robot = new Robot();
//
//			for (int interation = 1; interation <= number; interation++) {
//				robot.keyPress(KeyEvent.VK_UP);
//				robot.keyRelease(KeyEvent.VK_UP);
//			}
//		}catch(Exception e){
//		}
//
//		Thread.sleep(3000);
//		WebElement destinationfocus = driver.switchTo().activeElement();
//		Assert.assertTrue(destination.equals(destinationfocus), "Focus is not on destination");
//
//	}
//    
//    public void verifyDownArrowNavigationValidation(WebElement source, WebElement destination, int number) throws InterruptedException {
//		source.click();
//		WebElement sourcefocus = driver.switchTo().activeElement();
//		Assert.assertTrue(source.equals(sourcefocus), "Focus is not on source");
//
//		try {
//			Robot robot = new Robot();
//
//			for (int interation = 1; interation <= number; interation++) {
//				robot.keyPress(KeyEvent.VK_DOWN);
//				robot.keyRelease(KeyEvent.VK_DOWN);
//			}
//		}catch(Exception e){
//		}
//
//		Thread.sleep(3000);
//		WebElement destinationfocus = driver.switchTo().activeElement();
//		Assert.assertTrue(destination.equals(destinationfocus), "Focus is not on destination");
//
//	}
//    
//    public boolean isSelected(String option,String idOfSelectbox) {
//    	WebElement selectBox = driver.findElement(By.id("searchDropdownBox"));
//    	Select select = new Select(selectBox);
//    	return select.getFirstSelectedOption().getText().equals(idOfSelectbox);
//    }
}




