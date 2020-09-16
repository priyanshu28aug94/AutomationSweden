package com.kommedSweden.member;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.generic_library;
import com.kommedSweden.properties_file_path;

public class member_settings_memberclose {
public WebDriver driver;
	
	public  member_settings_memberclose(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement member() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_memberclose, "member")));
	}
	public WebElement settings() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_memberclose, "settings")));
	}
	public WebElement close_mission() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_memberclose, "close_mission")));
	}
	public WebElement new_occasion() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_memberclose, "new_occasion")));
	}
	public WebElement save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_memberclose, "save")));
	}
	public By close_mission_list_type() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_memberclose, "close_mission_list_type"));
	}
	
}
