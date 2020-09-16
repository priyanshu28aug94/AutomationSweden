package com.kommedSweden.collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import com.kommedSweden.generic_library;
import com.kommed.property_file_path_of_modules.properties_file_path_collections;


public class collection_purpose {
	
	public WebDriver driver;
	
	public  collection_purpose(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement collection() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection")));
	}
	
	public WebElement collection_purpose() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_purpose, "collection_purpose")));
	}
	
	public WebElement collection_purpose_pagetitle() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_purpose, "collection_purpose_pagetitle")));
	}
	
	public WebElement collection_purpose_new() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_purpose, "collection_purpose_new")));
	}

	public WebElement collection_purpose_new_input() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_purpose, "collection_purpose_new_input")));
	}
	
	public WebElement collection_purpose_new_dropdown() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_purpose, "collection_purpose_new_dropdown")));
	}
	
	public WebElement collection_purpose_new_submit() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_purpose, "collection_purpose_new_submit")));
	}
	
	
	public WebElement collection_purpose_admin_pagetitle() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_purpose, "collection_purpose_admin_pagetitle")));
	}
	
	public WebElement collection_purpose_adminclick() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_purpose, "collection_purpose_adminclick")));
	}
	
	public By collection_purpose_overview_checknew() throws IOException {
		//member_organization mo = new member_organization(driver);
		return By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_purpose, "collection_purpose_overview_checknew"));
	}
	
	public WebElement collection_purpose_statistic() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_purpose, "collection_purpose_statistic")));
	}

}
