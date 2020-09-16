package com.kommedSweden.collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.generic_library;

public class collection_prefrences_start_reason {
	
	public WebDriver driver;
	
	public  collection_prefrences_start_reason(WebDriver driver) {
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
	
	public WebElement collection_prefrences_start_reason() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_prefrences_start_reason, "collection_prefrences_start_reason")));
	}
	

	
	public WebElement collection_prefrences_start_reason_pagetitle() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_prefrences_start_reason, "collection_prefrences_start_reason_pagetitle")));
	}
	
	public WebElement collection_prefrences_start_reason_new_input() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_prefrences_start_reason, "collection_prefrences_start_reason_new_input")));
	}
	

	
	public WebElement collection_prefrences_start_reason_save() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_prefrences_start_reason, "collection_prefrences_start_reason_save")));
	}
 
	public By collection_prefrences_start_reason_new_template() throws IOException {
		//member_organization mo = new member_organization(driver);
		return By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_prefrences_start_reason, "collection_prefrences_start_reason_new_template"));
	}

	public WebElement collection_prefrences_start_reason_edit_button() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_prefrences_start_reason, "collection_prefrences_start_reason_edit_button")));
	}
	
	public WebElement collection_prefrences_start_reason_image_button() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_prefrences_start_reason, "collection_prefrences_start_reason_image_button")));
	}
	
	public WebElement collection_template_sponsor_letter_popup_input() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_popup_input")));
	}
	
	public WebElement collection_template_sponsor_letter_popup_save() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_popup_save")));
	}
	
	public WebElement collection_prefrences_start_reason_1stelement() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_prefrences_start_reason, "collection_prefrences_start_reason_1stelement")));
	}
	
	
}
