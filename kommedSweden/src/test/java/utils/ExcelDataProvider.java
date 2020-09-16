package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.login_page;
import com.kommedSweden.properties_file_path;


public class ExcelDataProvider {
WebDriver driver=null;
String projectPath = System.getProperty("user.dir");
	
	
	@Test(dataProvider="test1data")
	public void test1(String username, String password) throws Exception {
		System.out.println("getting value here - "+username+" | "+password);
		generic_library.browser_wakeup_code(properties_file_path.chrome_browser_path);
		base.driver.get("https://eu1.kommed.se/login_new.php");
		login_page l = new login_page(base.driver);
		l.user_name().sendKeys(username);
		l.password().sendKeys(password);
		l.login_button().click();
		Thread.sleep(2000);
		String actual_result = base.driver.getCurrentUrl();
		System.out.println("url - "+actual_result);
		String expected_result = "https://eu1.kommed.se/start.php";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual_result, expected_result);	
		base.driver.quit();
		sa.assertAll();		
	}
	
	@DataProvider(name = "test1data")
	public Object[][] getData() {
		String excelPath =projectPath+ "\\excel\\multiple_user_login.xlsx";
		Object data[][] =ExcelUtils.testData(excelPath, "Credentials");
		return data;	
	}
}
