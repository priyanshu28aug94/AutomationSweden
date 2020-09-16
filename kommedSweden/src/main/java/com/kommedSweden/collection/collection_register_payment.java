package com.kommedSweden.collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import com.kommedSweden.generic_library;
import com.kommed.property_file_path_of_modules.properties_file_path_collections;


public class collection_register_payment {
public WebDriver driver;
	
	public  collection_register_payment(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public WebElement collection() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection")));
	}
	
	public WebElement collection_register_payment() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection_register_payment")));
	}
	
	public WebElement collection_register_payment_titletext() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection_register_payment_titletext")));
	}
	
	public WebElement collection_register_payment_id() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection_register_payment_id")));
	}
	
	public WebElement collection_register_payment_date() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection_register_payment_date")));
	}
	
	public WebElement collection_register_payment_amount() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection_register_payment_amount")));
	}
	public WebElement collection_register_payment_payment() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection_register_payment_payment")));
	}
	public WebElement collection_register_payment_campaign() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection_register_payment_campaign")));
	}
	public WebElement collection_register_payment_purpose() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection_register_payment_purpose")));
	}
	public WebElement collection_register_payment_agreement() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection_register_payment_agreement")));
	}
	public WebElement collection_register_payment_submit() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection_register_payment_submit")));
	}
	

}
