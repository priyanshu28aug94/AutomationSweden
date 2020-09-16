package com.kommedSweden.collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.generic_library;

public class collection_reports_register_overview {
public WebDriver driver;
	
	public  collection_reports_register_overview(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public WebElement collection() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_reports_register_overview, "collection_tab")));
	}
	public WebElement collection_reports_submenu() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_reports_register_overview, "collection_reports_submenu")));
	}
	public WebElement collection_report_overview() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_reports_register_overview, "collection_report_overview")));
	}
	public WebElement collection_report_overview_title() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_reports_register_overview, "collection_report_overview_title")));
	}

}
