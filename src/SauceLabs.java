import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SauceLabs {

	public static final String USERNAME = "oauth-ajay.gupta1711-d6709";
	public static final String ACCESS_KEY = "ae19e8af-5c02-4676-a144-72bdd895885c";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub"; 
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		// Deprecated Code
/*		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "100"); */
		
		ChromeOptions options = new ChromeOptions();
		options.setPlatformName("Windows 10");
		options.setBrowserVersion("latest");
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chormedriver.exe");
		 WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), options);
		 driver.get("https://www.google.com/");
		 System.out.println(driver.getTitle());
		

	}

}
