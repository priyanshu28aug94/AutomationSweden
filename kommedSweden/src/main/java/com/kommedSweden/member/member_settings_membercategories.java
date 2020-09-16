package com.kommedSweden.member;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.generic_library;
import com.kommedSweden.properties_file_path;

public class member_settings_membercategories {
public WebDriver driver;
	
	public  member_settings_membercategories(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement member() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_membercategories, "member")));
	}
	public WebElement categories() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_membercategories, "categories")));
	}
	public WebElement settings() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_membercategories, "settings")));
	}
	public WebElement new_category() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_membercategories, "new_category")));
	}
	public WebElement select_checkbox() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_membercategories, "select_checkbox")));
	}
	public WebElement category_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_membercategories, "category_save")));
	}
	public By mem_categories_list() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_membercategories, "mem_categories_list"));
	}
	
	
}
