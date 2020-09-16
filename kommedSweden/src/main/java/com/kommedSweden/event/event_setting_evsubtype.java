package com.kommedSweden.event;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.generic_library;


public class event_setting_evsubtype {
	public WebDriver driver;
	public event_setting_evsubtype(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	properties_file_path_event pfpe = new properties_file_path_event();
	public WebElement event() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evsubtype, "event")));
	}
	public WebElement event_settings() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evsubtype, "event_settings")));
	}
	public WebElement event_subtype() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evsubtype, "event_subtype")));
	}
	public WebElement ev_undertype() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evsubtype, "ev_undertype")));
	}
	public WebElement ev_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_setting_evsubtype, "ev_save")));
	}
	public By ev_subtype_list() throws IOException {
		return By.xpath(generic_library.access_properties_file(pfpe.event_setting_evsubtype, "ev_subtype_list"));
	}
}
