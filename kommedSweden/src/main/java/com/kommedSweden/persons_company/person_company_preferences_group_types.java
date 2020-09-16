package com.kommedSweden.persons_company;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.generic_library;

public class person_company_preferences_group_types {
public WebDriver driver;
	
	public  person_company_preferences_group_types(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement person_company() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preference, "person_company")));
	}
	
	public WebElement person_company_preferences() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preference, "person_company_preference")));
	}
	
	public WebElement person_company_preferences_group_types_xpath() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_group_types, "person_company_preferences_group_types_xpath")));
	}
	
	public WebElement person_company_preferences_group_types_1stelement_editbutton() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_group_types, "person_company_preferences_group_types_1stelement_editbutton")));
	}
	
	public WebElement person_company_preferences_group_types_edit_textinput() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_group_types, "person_company_preferences_group_types_edit_textinput")));
	}
	
	public WebElement person_company_preferences_group_types_edit_savebutton() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_group_types, "person_company_preferences_group_types_edit_savebutton")));
	}
	
	public WebElement person_company_preferences_group_types_1stelement() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_group_types, "person_company_preferences_group_types_1stelement")));
	}
	
	public WebElement person_company_preferences_group_types_textinput() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_group_types, "person_company_preferences_group_types_textinput")));
	}
	
	public WebElement person_company_preferences_group_types_savebutton() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_group_types, "person_company_preferences_group_types_savebutton")));
	}
	
	public WebElement person_company_preferences_group_types_1stelement_image() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_group_types, "person_company_preferences_group_types_1stelement_image")));
	}

	public By person_company_preferences_group_types_typelist() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_group_types, "person_company_preferences_group_types_typelist"));
	}

}
