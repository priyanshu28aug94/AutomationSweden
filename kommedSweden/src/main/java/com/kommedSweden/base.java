package com.kommedSweden;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class base {
	
	public static WebDriver driver;
	generic_library gl = new generic_library(driver);
	static String path = properties_file_path.data_page;
	@BeforeClass
	public WebDriver initializeDriver() throws IOException {
	
	String browserName = gl.access_properties_file(path, "browser");
	
	if(browserName.equals("chrome")) {
		generic_library.browser_wakeup_code(properties_file_path.chrome_browser_path);
	}
	else if(browserName.equals("safari")){
		
	}
	else if(browserName=="firefox") {
		
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	}
	
	@BeforeMethod
	public void login_page() throws IOException {		
		driver.get(gl.access_properties_file(path, "url"));
		login_page l = new login_page(driver);
		l.user_name().sendKeys(gl.access_properties_file(path, "username"));
		l.password().sendKeys(gl.access_properties_file(path, "password"));
		l.login_button().click();
	}
	
	@AfterMethod
	public void logout_page() throws InterruptedException, IOException {
		logout_page lp = new logout_page(driver);
		gl.action_mouseover(lp.image());
		gl.click(lp.logout());
	}
	
	@AfterClass
	public void close_browser() {
		driver.quit();
	}
	
	@AfterSuite
	public void delete_folder() {
		gl.delete_folder(gl.download_file_path);
	}
}