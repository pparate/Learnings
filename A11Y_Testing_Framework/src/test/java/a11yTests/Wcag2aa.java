package a11yTests;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.deque.axe.AXE;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Common;
public class Wcag2aa {
	WebDriver driver;
	
	@BeforeTest
    public void initialize(){
		WebDriverManager.chromedriver().setup();
		Common.setUp();
        driver = new ChromeDriver();
        
    }
	
	@Test
	public void TestWcg2aaa() {

	
		driver.get("https://www.flipkart.com");
		AXE.inject(driver, Common.scriptUrl);

		JSONObject responseJSON = new AXE.Builder(driver, Common.scriptUrl).options("{\n" + "    runOnly: {\n"
				+ "      type: 'tag',\n" + "      values: ['wcag2aa']\n" + "    }\n" + "  }").analyze();
		JSONArray violations = responseJSON.getJSONArray("violations");
		AXE.writeResults("Wcg2aaaRulesFlipkart", responseJSON);
		
	}
	
	@AfterTest
    public void tearDown(){
        driver.quit();
    }
}




