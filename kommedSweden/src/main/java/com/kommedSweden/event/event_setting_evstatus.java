package com.kommedSweden.event;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.generic_library;


public class event_setting_evstatus {
	public WebDriver driver;
	public event_setting_evstatus(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	properties_file_path_event pfpe = new properties_file_path_event();
	
	public WebElement event() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evstatus, "event")));
	}
	public WebElement event_settings() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evstatus, "event_settings")));
	}
	public WebElement ev_status() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evstatus, "ev_status")));
	}
	public WebElement status() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evstatus, "status")));
	}
	public WebElement checkbox() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_event.event_setting_evstatus, "checkbox")));
	}
	public WebElement save_status() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_event.event_setting_evstatus, "save_status")));
	}
	public By ev_status_list() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_event.event_setting_evstatus, "ev_status_list"));
	}
}
