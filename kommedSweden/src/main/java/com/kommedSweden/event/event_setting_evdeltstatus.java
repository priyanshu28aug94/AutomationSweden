package com.kommedSweden.event;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.generic_library;


public class event_setting_evdeltstatus {
	public WebDriver driver;
	public event_setting_evdeltstatus(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	properties_file_path_event pfpe = new properties_file_path_event();

	public WebElement event() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evdeltstatus, "event")));
	}
	public WebElement event_settings() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evdeltstatus, "event_settings")));
	}
	public WebElement event_deltstatus() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evdeltstatus, "event_deltstatus")));
	}
	public WebElement new_status() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evdeltstatus, "new_status")));
	}
	public WebElement click_checkbox() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evdeltstatus, "click_checkbox")));
	}
	public WebElement save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evdeltstatus, "save")));
	}
	public By event_delt_status_list() throws IOException {
		return By.xpath(generic_library.access_properties_file(pfpe.event_setting_evdeltstatus, "event_delt_status_list"));
	}
}
