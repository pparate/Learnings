package a11yTests;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.deque.axe.AXE;

import utils.Common;
public class Wcag2aaa {
	WebDriver driver;
	
	@BeforeTest
    public void initialize(){
		Common.setUp();
        driver = new ChromeDriver();
        
    }
	
	@Test
	public void TestWcg2aaa() {

		URL scriptUrl = Wcag2aaa.class.getResource("/axe.min.js");

		
		driver.get("https://www.amazon.com");
		AXE.inject(driver, scriptUrl);

		JSONObject responseJSON = new AXE.Builder(driver, scriptUrl).options("{\n" + "    runOnly: {\n"
				+ "      type: 'tag',\n" + "      values: ['wcag2aaa']\n" + "    }\n" + "  }").analyze();
		JSONArray violations = responseJSON.getJSONArray("violations");
			
		AXE.writeResults("Wcg2aaaRulesAmazon", responseJSON);
		
	}
	
	@AfterTest
    public void tearDown(){
        driver.quit();
    }
}




