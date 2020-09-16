package com.kommedSweden.collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.generic_library;

public class collection_prefrences_gift_types {

public WebDriver driver;
	
	public  collection_prefrences_gift_types(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public WebElement collection() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection")));
	}
	
	public WebElement collection_prefrences() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_prefrences_gift_types, "collection_prefrences")));
	}
	
	public WebElement collection_prefrences_gift_type() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_prefrences_gift_types, "collection_prefrences_gift_types")));
	}
	

	
	public WebElement collection_prefrences_gift_types_pagetitle() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_prefrences_gift_types, "collection_prefrences_gift_types_pagetitle")));
	}
	
	
}
