package com.kommedSweden;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	public WebDriver driver;
	String path = properties_file_path.login_page;
	public login_page(WebDriver driver) {
		this.driver=driver;
		//initialize all these variables using pagefactory initelements
		PageFactory.initElements(driver, this);
	}
	generic_library gl = new generic_library(driver);
	
//	By username = By.xpath("//input[@name='username']");
	
//	@FindBy(xpath="//input[@name='username']")
//	WebElement username;
//	
//	@FindBy(xpath="//input[@name='pwd']")
//	WebElement password;
//	
//	@FindBy(xpath="//input[@name='submitbtn']")
//	WebElement login_button;
	
	public WebElement user_name() throws IOException {
		return driver.findElement(By.xpath(gl.access_properties_file(path,"xpath_username")));
	}
	public WebElement password() throws IOException {
		return driver.findElement(By.xpath(gl.access_properties_file(path, "xpath_password")));
	}
	public WebElement login_button() throws IOException {
		return driver.findElement(By.xpath(gl.access_properties_file(path, "xpath_login_button")));
	}
	
}
