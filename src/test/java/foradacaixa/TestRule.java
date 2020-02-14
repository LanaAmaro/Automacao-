package foradacaixa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;

public class TestRule {
	
	
	private static WebDriver driver;
	
	
	@Before
	public void beforeCenario() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("file:///D:/alana/Particular/versc3a3o-2.zip/Vers%C3%A3o%202/index.html");
		
		
	}
}
