package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages extends Common{

	WebDriver driver;

	@FindBy(xpath = "//a[@aria-label='Amazon']")
	public WebElement amazonLogo;
	
	@FindBy(xpath = "//div[@id='nav-search-dropdown-card']")
	public WebElement searchDropdown;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement searchTextBox;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	public WebElement searchSubmitButton;
	
	@FindBy(xpath = "//input[@title='Search']")
	public WebElement search;
	
	@FindBy(xpath = "//a[@aria-label='Choose a language for shopping.']")
	public WebElement langSelection;
	
	@FindBy(xpath = "//a[contains(@id,'accountList')]")
	public WebElement accountList;
	
	@FindBy(xpath = "//a[contains(@id,'nav-orders')]")
	public WebElement orders;
	
	@FindBy(xpath = "//a[contains(@aria-label,'items in cart')]")
	public WebElement itemsInCart;
	
	@FindBy(xpath = "//*[contains(@id,'nav-hamburger-menu')]")
	public WebElement leftMenu;
	
	@FindBy(xpath = "//div[@id='nav-xshop']//a[text()='Best Sellers']")
	public WebElement bestSellersLink;
	
	@FindBy(xpath = "//div[@id='nav-xshop']//a[text()='Mobiles']")
	public WebElement mobilesLink;
	
	@FindBy(xpath = "//div[@id='nav-xshop']//a[contains(text(),'Deals')]")
	public WebElement todaysDealsLink;
	
	@FindBy(xpath = "//div[@id='nav-xshop']//a[contains(text(),'Customer Service')]")
	public WebElement customerServiceLink;
	
	@FindBy(xpath = "//div[@id='nav-xshop']//a[contains(text(),'Electronics')]")
	public WebElement electronicsLink;
	
	@FindBy(xpath = "//div[@id='nav-xshop']//a[contains(text(),'Fashion')]")
	public WebElement fashionLink;
	
	@FindBy(xpath = "//div[@id='nav-xshop']//span[contains(text(),'Prime')]/..")
	public WebElement primeLink;
	
	@FindBy(xpath = "//div[@id='nav-xshop']//a[contains(text(),'Home & Kitchen')]")
	public WebElement homeAndKitchenLink;
	
	
	

	public Pages(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	
	
	

}
