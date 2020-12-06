package testRun;

import org.testng.annotations.Test;

import baseUrl.DriverManager;

public class PracticeTest extends DriverManager {

	@Test
	public void firstTest() {

		DriverManager dm = new DriverManager();
		dm.pokeBrowser("edge");
		driver.get("https://www.lycamobile.us/en/");
	}

}
