package com.kommedSweden.administration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.generic_library;

public class administration_language {
	public WebDriver driver;
	public administration_language(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement administration() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_language, "administration")));
	}
	public WebElement language() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_language, "language")));
	}
	public WebElement text_id() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_language, "text_id")));
	}
	public WebElement search() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_language, "search")));
	}
	public WebElement admin_language_text() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_language, "admin_language_text")));
	}
	
}
