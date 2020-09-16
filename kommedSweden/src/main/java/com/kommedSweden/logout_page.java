package com.kommedSweden;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout_page {
	public WebDriver driver;
	
	public logout_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	String path = properties_file_path.logout_page;
	generic_library gl = new generic_library(driver);
	/*
	By image = By.xpath("//div[@id='cssmenu']/ul/li[1]/a/.");
	By logout = By.xpath("//div[@class='container_10']/div/ul/li[1]/ul[1]/li[4]/a");
	*/
	
//	By image = By.xpath(gl.access_properties_file(path, "image"));
//	@FindBy(xpath="//div[@id='cssmenu']/ul/li[1]/a/.")
//	WebElement image;
	
//	@FindBy(xpath="//div[@class='container_10']/div/ul/li[1]/ul[1]/li[4]/a")
//	WebElement logout;
	
	/*
	public WebElement image() {
		return driver.findElement(image);
	}
	public WebElement logout() {
		return driver.findElement(logout);	
	}
	*/
	
	public WebElement image() throws IOException {
		return driver.findElement(By.xpath(gl.access_properties_file(path, "image")));
	}
	
	public WebElement logout() throws IOException {
		return driver.findElement(By.xpath(gl.access_properties_file(path, "logout")));	
	}
	
}
