package com.kommedSweden.collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.generic_library;

public class collection_template_sponsor_letter {
	
public WebDriver driver;
	
	public  collection_template_sponsor_letter(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public WebElement collection() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection")));
	}
	
	public WebElement collection_template() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_memorial_congratulation_card, "collection_template")));
	}
	
	public WebElement collection_template_sponsor_letter() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter")));
	}
	
	public WebElement collection_template_sponsor_letter_new_input() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_new_input")));
	}
	
	public WebElement collection_template_sponsor_letter_save() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_save")));
	}
	
	public By collection_template_sponsor_letter_new_template() throws IOException {
		//member_organization mo = new member_organization(driver);
		return By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_new_template"));
	}
	
	public WebElement collection_template_sponsor_letter_edit_button() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_edit_button")));
	}
	
	public WebElement collection_template_sponsor_letter_pagetitle() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_pagetitle")));
	}
	
	public WebElement collection_template_sponsor_letter_popup_input() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_popup_input")));
	}
	
	public WebElement collection_template_sponsor_letter_popup_save() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_popup_save")));
	}
	
	public WebElement collection_template_sponsor_letter_image_button() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_image_button")));
	}

	public WebElement collection_template_sponsor_letter_1stelement() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_1stelement")));
	}

	public WebElement collection_template_sponsor_letter_upload_file() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_upload_file")));
	}
	
	public WebElement collection_template_sponsor_letter_1stelement_selectable_value_uploaded_file_name() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_1stelement_selectable_value_uploaded_file_name")));
	}
	
	public WebElement collection_template_sponsor_letter_savebutton() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_template_sponsor_letter, "collection_template_sponsor_letter_savebutton")));
	}
	
}
