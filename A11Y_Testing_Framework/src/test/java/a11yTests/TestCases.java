//package a11yTests;
//import java.awt.AWTException;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//import org.testng.asserts.*;
//import utils.Common;
//import utils.Pages;
//
//public class TestCases {
//
//    Pages objAmazonPage;
//    Common comm;
//    SoftAssert softAssertion= new SoftAssert();
//    WebDriver driver;
//
//    @BeforeTest
//    public void initialize(){
//
//        Common.setUp();
//        driver = new ChromeDriver();
//        comm=new Common(driver);
//    }
//
//    @Test
//    public void SearchProduct() {
//        driver.get("https://www.amazon.com");
//        comm.performSearch("Mobiles", "id:twotabsearchtextbox",driver);
//        softAssertion.assertTrue(comm.pressEnter(driver,"id:nav-search-submit-button","xpath://span[contains(text(),'results')]"),"Expected page is not displayed");
//
//    }
//
//    public void tabNavigationValidationSourceToSource() throws InterruptedException {
//        driver.get("https://www.amazon.com");
//        objAmazonPage = new Pages(driver);
//        objAmazonPage.verifyTabNavigationValidation(objAmazonPage.search, objAmazonPage.search, 26);
//    }
//
//    @Test
//    public void tabNavigationValidation() throws InterruptedException {
//        driver.get("https://www.amazon.in");
//        objAmazonPage = new Pages(driver);
//        objAmazonPage.verifyTabNavigationValidation(objAmazonPage.searchTextBox, objAmazonPage.searchSubmitButton, 1);
//    }
//    
//    @Test
//    public void tabNavigationValidationForAmazon() throws InterruptedException {
//    	driver.get("https://www.amazon.in");
//    	objAmazonPage = new Pages(driver);
//    	objAmazonPage.searchTextBox.click();
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.searchTextBox, objAmazonPage.searchSubmitButton);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.searchSubmitButton, objAmazonPage.langSelection);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.langSelection, objAmazonPage.accountList);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.accountList, objAmazonPage.orders);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.orders, objAmazonPage.itemsInCart);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.itemsInCart, objAmazonPage.leftMenu);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.leftMenu, objAmazonPage.bestSellersLink);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.bestSellersLink, objAmazonPage.mobilesLink);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.mobilesLink, objAmazonPage.todaysDealsLink);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.todaysDealsLink, objAmazonPage.customerServiceLink);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.customerServiceLink, objAmazonPage.electronicsLink);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.electronicsLink, objAmazonPage.fashionLink);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.fashionLink, objAmazonPage.primeLink);
//    	objAmazonPage.verifyTabNavigationValidation(objAmazonPage.primeLink, objAmazonPage.homeAndKitchenLink);
//    }
//
//    @Test
//    public void upDownKeyForAmazon() throws AWTException {
//    	driver.get("https://www.amazon.in");
//    	objAmazonPage = new Pages(driver);
//    	objAmazonPage.searchDropdown.click();
//    	objAmazonPage.pressDown();
//    	objAmazonPage.pressDown();
//    	objAmazonPage.pressEnter();
//    	softAssertion.assertTrue(comm.pressEnter(driver,"id:nav-search-submit-button","xpath://span[contains(text(),'results')]"),"Expected page is not displayed");
//    	comm.isSelected("Amazon Devices", "searchDropdownBox");
//    }
//    @AfterTest
//    public void tearDown(){
//        driver.quit();
//    }
//}
//
//
//
//
