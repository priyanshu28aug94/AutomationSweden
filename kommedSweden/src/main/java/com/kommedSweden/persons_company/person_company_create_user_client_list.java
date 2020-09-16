package com.kommedSweden.persons_company;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.generic_library;

public class person_company_create_user_client_list {
public WebDriver driver;
	
	public  person_company_create_user_client_list(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement person_company() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preference, "person_company")));
	}
	
	public WebElement person_company_create_user_xpath() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_create_user, "person_company_create_user")));
	}
	
	public WebElement person_company_create_user_client_list() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_create_user_client_list, "person_company_create_user_client_list")));
	}
	
	public WebElement person_company_create_user_client_list_1st_user() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_create_user_client_list, "person_company_create_user_client_list_1st_user")));
	}
	
	public WebElement person_company_create_user_client_list_kundsida_ID() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_create_user_client_list, "person_company_create_user_client_list_kundsida_ID")));
	}
	
	public WebElement person_company_create_user_client_list_mina_kunder() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_create_user_client_list, "person_company_create_user_client_list_mina_kunder")));
	}
	
	public WebElement person_company_create_user_client_list_my_customers_title() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_create_user_client_list, "person_company_create_user_client_list_my_customers_title")));
	}

}
