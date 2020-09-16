package com.kommedSweden.collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.generic_library;

public class collection_reports_bank_statement {
public WebDriver driver;
	
	public  collection_reports_bank_statement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public WebElement collection() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_reports_bank_statement, "collection_tab")));
	}
	public WebElement collection_reports_submenu() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_reports_bank_statement, "collection_reports_submenu")));
	}
	public WebElement collection_reports_bank_statement_submenu() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_reports_bank_statement, "collection_reports_bank_statement_submenu")));
	}
	public WebElement collection_report_bank_statements_title() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_reports_bank_statement, "collection_report_bank_statements_title")));
	}
}
