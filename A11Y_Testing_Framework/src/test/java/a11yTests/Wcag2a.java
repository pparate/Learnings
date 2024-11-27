package a11yTests;

import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.deque.axe.AXE;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Common;

public class Wcag2a {
	WebDriver driver;
	public static URL scriptUrl;
	
	@BeforeTest
    public void initialize(){
		
		scriptUrl = Wcag2a.class.getResource("/axe.min.js");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
    }
	
	@Test
	public void TestWcg2a() throws Exception {
		
		
		driver.get("https://www.google.com");
		AXE.inject(driver, scriptUrl);
		
		JSONObject responseJSON = new AXE.Builder(driver, scriptUrl).analyze();
		
//		JSONObject responseJSON = new AXE.Builder(driver, scriptUrl).include("title").analyze();
		
//		JSONObject responseJSON = new AXE.Builder(driver, scriptUrl).exclude("title").analyze();
		
//		JSONObject responseJSON = new AXE.Builder(driver, scriptUrl).include("h1").exclude("title").analyze();
		
//		JSONObject responseJSON = new AXE.Builder(driver, scriptUrl).skipFrames().analyze();
		
//		JSONObject responseJSON = new AXE.Builder(driver, scriptUrl).options("{\r\n"
//				+ "    runOnly: {\r\n"
//				+ "      type: 'tag',\r\n"
//				+ "      values: ['wcag2aaa']\r\n"
//				+ "    }\r\n"
//				+ "  }").analyze();
		
//		JSONObject responseJSON = new AXE.Builder(driver, scriptUrl).options("{\r\n"
//				+ "    runOnly: {\r\n"
//				+ "      type: 'rule',\r\n"
//				+ "      values: ['area-alt']\r\n"
//				+ "    }\r\n"
//				+ "  }").analyze();
		
		
		JSONArray violations = responseJSON.getJSONArray("violations");
						
		if(violations.length()==0) {
			System.out.println("No Violations found");
		}else {
			AXE.writeResults("Wcg2aRulesAmazon", responseJSON);
			Assert.assertFalse(true,AXE.report(violations));
		}
		
		
		
	}
	
	@AfterTest
    public void tearDown(){
        driver.quit();
    }
}




