package com.kommedSweden.member;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.generic_library;
import com.kommedSweden.properties_file_path;

public class member_settings_mission {
public WebDriver driver;
	
	public  member_settings_mission(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement member() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_mission, "member")));
	}
	
	public WebElement settings() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_mission, "settings")));
	}
	public WebElement mission() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_mission, "mission")));
	}
	public WebElement new_mission() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_mission, "new_mission")));
	}
	public WebElement save_mission() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_mission, "save_mission")));
	}
	public By mission_type_list() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_member.member_settings_mission, "mission_type_list"));
	}
}
