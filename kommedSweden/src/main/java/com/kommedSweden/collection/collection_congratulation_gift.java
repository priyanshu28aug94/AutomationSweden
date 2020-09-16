package com.kommedSweden.collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import com.kommedSweden.generic_library;
import com.kommed.property_file_path_of_modules.properties_file_path_collections;



public class collection_congratulation_gift {
	
	public WebDriver driver;
	
	public  collection_congratulation_gift(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement collection() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection")));
	}
	
	public WebElement collection_congratulation_gift() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift")));
	}
	
	public WebElement collection_congratulation_gift_pagetitle() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_pagetitle")));
	}
	
	public WebElement collection_congratulation_gift_new() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_new")));
	}

	public WebElement collection_congratulation_gift_new_input() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_new_input")));
	}
	
	public WebElement collection_congratulation_gift_new_dropdown() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_new_dropdown")));
	}
	
	public WebElement collection_congratulation_gift_new_submit() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_new_submit")));
	}
	
	
	public WebElement collection_congratulation_gift_admin_pagetitle() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_admin_pagetitle")));
	}
	
	public WebElement collection_congratulation_gift_adminclick() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_adminclick")));
	}
	
	public By collection_congratulation_gift_overview_checknew() throws IOException {
		//member_organization mo = new member_organization(driver);
		return By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_overview_checknew"));
	}
	
	public WebElement collection_congratulation_gift_campaign_overview_campaign_name() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_campaign_overview_campaign_name")));
	}
	
	public WebElement collection_congratulation_gift_overview() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_overview")));
	}
	
	public WebElement collection_congratulation_gift_admin_name() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_admin_name")));
	}

	public WebElement collection_congratulation_gift_admin_save() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_congratulation_gift, "collection_congratulation_gift_admin_save")));
	}

	
	
}
