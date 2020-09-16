package com.kommedSweden.event;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.generic_library;


public class event_templates_event_letter {
	public WebDriver driver;
	public event_templates_event_letter(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	properties_file_path_event pfpe = new properties_file_path_event();
	public WebElement event() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_templates_event_letter, "event")));
	}
	public WebElement templates() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_templates_event_letter, "templates")));
	}
	public WebElement event_letter() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_templates_event_letter, "event_letter")));
	}
	public WebElement create_new_event_letter() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(pfpe.event_templates_event_letter, "create_new_event_letter")));
	}
	public WebElement letter_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_event.event_templates_event_letter, "letter_save")));
	}
	public By event_letter_list_type() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_event.event_templates_event_letter, "event_letter_list_type"));
	}
}
