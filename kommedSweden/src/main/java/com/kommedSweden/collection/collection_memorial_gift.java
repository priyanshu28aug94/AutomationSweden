package com.kommedSweden.collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import com.kommedSweden.generic_library;
import com.kommed.property_file_path_of_modules.properties_file_path_collections;


public class collection_memorial_gift {

public WebDriver driver;
	
	public  collection_memorial_gift(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public WebElement collection() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection")));
	}
	
	public WebElement collection_memorial_gift() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift")));
	}
	
	public WebElement collection_memorial_gift_pagetitle() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_pagetitle")));
	}
	
	public WebElement collection_memorial_gift_new() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_new")));
	}
	
	public WebElement collection_memorial_gift_new_dropdown() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_new_dropdown")));
	}
	
	public WebElement collection_memorial_gift_new_input() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_new_input")));
	}
	
	public WebElement collection_memorial_gift_new_submit() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_new_submit")));
	}
	
	public WebElement collection_memorial_gift_admin_pagetitle() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_admin_pagetitle")));
	}
	
	public WebElement collection_memorial_gift_selectgift() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_selectgift")));
	}
	
	public WebElement collection_memorial_gift_adminclick() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_adminclick")));
	}
	
	public WebElement collection_memorial_gift_admin_input1() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_admin_input1")));
	}
	
	public WebElement collection_memorial_gift_admin_input1date() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_admin_input1date")));
	}
	
	public WebElement collection_memorial_gift_admin_input1submit() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_admin_input1submit")));
	}
	
	public WebElement collection_memorial_gift_overview_campaign_parent1() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview_campaign_parent1")));
	}
	
	public WebElement collection_memorial_gift_overview_payers() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview_payers")));
	}
	
	public By collection_memorial_gift_overview_checknew() throws IOException {
		//member_organization mo = new member_organization(driver);
		return By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview_checknew"));
	}
	
	public WebElement collection_memorial_gift_overview_campaign_parent1_child() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview_campaign_parent1_child")));
	}
	
	public WebElement collection_memorial_gift_overview_date() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview_date")));
	}
	
	public WebElement collection_memorial_gift_overview_amount() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview_amount")));
	}
	
	public WebElement collection_memorial_gift_overview_poption() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview_poption")));
	}
	
	public WebElement collection_memorial_gift_overview_moption() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview_moption")));
	}
	
	public WebElement collection_memorial_gift_overview_puroption() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview_puroption")));
	}
	
	public WebElement collection_memorial_gift_overview_checkbox() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview_checkbox")));
	}
	
	public WebElement collection_memorial_gift_overview_sbutton() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview_sbutton")));
	}
	
	public WebElement collection_memorial_gift_admin_name() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_admin_name")));
	}
	
	public WebElement collection_memorial_gift_admin_save() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_admin_save")));
	}
	
	public WebElement collection_memorial_gift_overview() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_overview")));
	}
	
	public WebElement collection_memorial_gift_campaign_overview_campaign_name() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_memorial_gift, "collection_memorial_gift_campaign_overview_campaign_name")));
	}
	
	
}
