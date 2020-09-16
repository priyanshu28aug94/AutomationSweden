package com.kommedSweden.persons_company;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.generic_library;

public class person_company_new {

public WebDriver driver;
	
	public  person_company_new(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public WebElement person_company() throws IOException {
		//member_organization mo = new member_organization(driver);
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_new, "person_company")));
	}
	
	public WebElement person_company_new() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_new, "person_company_new")));
	}
	
	public WebElement person_company_new_titletext() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_new, "person_company_new_titletext")));
	}
	
	public WebElement person_company_new_firstname() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_new, "person_company_new_firstname")));
	}
	
	public WebElement person_company_new_lastname() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_new, "person_company_new_lastname")));
	}
	
	public WebElement person_company_new_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_new, "person_company_new_save")));
	}
	
	public WebElement person_company_new_id() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_new, "person_company_new_id")));
	}
	
	public WebElement person_company_new_pagetitle() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_new, "person_company_new_pagetitle")));
	}
}
