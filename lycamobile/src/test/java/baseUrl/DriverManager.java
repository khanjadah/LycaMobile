package baseUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	public static WebDriver driver;

	public void pokeBrowser(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {

			//setup path here , if u dont setup path on environment variable.
			driver = new ChromeDriver();
		}

		else if(browser.equalsIgnoreCase("firefox")) {

			//setup path here , if u dont setup path on environment variable.
			driver = new FirefoxDriver();
		}

		else if(browser.equalsIgnoreCase("edge")) {

			//setup path here , if u dont setup path on environment variable.
			driver = new EdgeDriver();
		}

		else {

			System.out.println("Please Choose correct browser");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");

	}

}
