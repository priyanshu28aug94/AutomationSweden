package com.kommedSweden.collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import com.kommedSweden.generic_library;
import com.kommed.property_file_path_of_modules.properties_file_path_collections;

public class collection_campaign {
	
public WebDriver driver;
	
	public  collection_campaign(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public WebElement collection() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_register_payment, "collection")));
	}
	
	public WebElement collection_campaign() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign")));
	}
	
	public WebElement collection_campaign_overview() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_overview")));
	}
	
	public By collection_campaign_overview_new_campaign() throws IOException {
		//member_organization mo = new member_organization(driver);
		return By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_overview_new_campaign"));
	}
	
	public WebElement collection_campaign_overview_campaign_name() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_overview_campaign_name")));
	}
	
	public WebElement collection_campaign_new_dropdown() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_new_dropdown")));
	}
	
	public WebElement collection_campaign_new_name_input() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_new_name_input")));
	}
	
	public WebElement collection_campaign_new_startdate_input() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_new_startdate_input")));
	}
	
	public WebElement collection_campaign_new_enddate_input() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_new_enddate_input")));
	}
	
	public WebElement collection_campaign_new_submit() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_new_submit")));
	}
	
	public WebElement collection_campaign_new() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_new")));
	}
	
	public WebElement collection_campaign_admin() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_admin")));
	}
	
	public WebElement collection_campaign_admin_name() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_admin_name")));
	}
	
	public WebElement collection_campaign_admin_save() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_admin_save")));
	}
	
	public WebElement collection_campaign_pagetitle() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_pagetitle")));
	}

	public WebElement collection_campaign_overview_campaign() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_overview_campaign")));
	}
	
	public WebElement collection_campaign_graph_click() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_graph_click")));
	}

	public WebElement collection_campaign_graph_title() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_graph_title")));
	}
	
	public By collection_campaign_column_graph() throws IOException {
		//member_organization mo = new member_organization(driver);
		return By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_column_graph"));
	}

	public WebElement collection_campaign_graph_click1() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_collections.collection_campaign, "collection_campaign_graph_click1")));
	}
	
}
