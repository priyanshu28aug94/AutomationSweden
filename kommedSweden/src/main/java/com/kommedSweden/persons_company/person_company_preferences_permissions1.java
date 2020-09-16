package com.kommedSweden.persons_company;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.generic_library;

public class person_company_preferences_permissions1 {
public WebDriver driver;
	
	public  person_company_preferences_permissions1(WebDriver driver) {
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
	
	public WebElement person_company_preferences_permissions_1() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_permissions1, "person_company_preferences_permissions_1")));
	}
	
	public WebElement person_company_preferences_permissions1_title() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_permissions1, "person_company_preferences_permissions1_title")));
	}

}
