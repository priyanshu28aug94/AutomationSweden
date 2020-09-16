package com.kommedSweden.home_page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_home_page;
import com.kommedSweden.generic_library;

public class home_page{
public WebDriver driver;
	
	public  home_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement home_page_image_icon() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_home_page.home_page, "home_page_image_icon")));
	}
	
	public WebElement home_page_image_last_records() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_home_page.home_page, "home_page_image_last_records")));
	}
	
	public WebElement home_page_image_last_records_1st_id() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_home_page.home_page, "home_page_image_last_records_1st_id")));
	}
	
	public WebElement home_page_last_records_1st_id() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_home_page.home_page, "home_page_last_records_1st_id")));
	}
	
	public WebElement home_page_last_records_1st_name() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_home_page.home_page, "home_page_last_records_1st_name")));
	}
	
	public WebElement home_page_last_records_id_title() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_home_page.home_page, "home_page_last_records_id_title")));
	}
	
	public By home_page_graph_iframe() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_home_page.home_page, "home_page_graph_iframe"));
	}
	
	public WebElement home_page_graph_iframe_title() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_home_page.home_page, "home_page_graph_iframe_title")));
	}
	

}
