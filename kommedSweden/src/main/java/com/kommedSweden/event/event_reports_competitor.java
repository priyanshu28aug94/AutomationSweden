package com.kommedSweden.event;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.generic_library;

public class event_reports_competitor {
	public WebDriver driver;
	public event_reports_competitor(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	properties_file_path_event pfpe = new properties_file_path_event();
	public WebElement event() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_reports_competitor, "event")));
	}
	public WebElement templates() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_reports_competitor, "templates")));
	}
	public WebElement competitor() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_reports_competitor, "competitor")));
	}
	public WebElement com_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_reports_competitor, "com_save")));
	}
	public WebElement event_competition_text() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_reports_competitor, "event_competition_text")));
	}
	
}
