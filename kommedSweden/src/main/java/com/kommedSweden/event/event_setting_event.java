package com.kommedSweden.event;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.generic_library;


public class event_setting_event {
	public WebDriver driver;
	public event_setting_event(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	properties_file_path_event pfpe = new properties_file_path_event();
	public WebElement event() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_event, "event")));
	}
	public WebElement event_settings() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_event, "event_settings")));
	}
	public WebElement event_sub() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_event, "event_sub")));
	}
	public WebElement new_event() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_event, "new_event")));
	}
	public WebElement event_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_event.event_setting_event, "event_save")));
	}
	public By event_stetting_event_list() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_event.event_setting_event, "event_stetting_event_list"));
	}
}
