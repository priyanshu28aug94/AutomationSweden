package com.kommedSweden;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class login_multipledata_test {
	generic_library gl = new generic_library(base.driver);
	
	@DataProvider
	public Object[][] get_data(){
		Object[][] data = new Object[3][2];
		
		data[0][0] = "tester@kommed.se";
		data[0][1] = "KibbCom1243";
		
		data[1][0] = "tester@kommed.seerw";
		data[1][1] = "KibbCom12432er";
		
		data[2][0] = "testeerer";
		data[2][1] = "tester12345";
		
		return data;
	}
	
	@Test(dataProvider="get_data")
	public void login_test(String username, String password) throws IOException, InterruptedException {
		System.out.println("hello");
		
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
	
	
}
