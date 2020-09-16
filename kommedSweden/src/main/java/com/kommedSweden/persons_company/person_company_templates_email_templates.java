package com.kommedSweden.persons_company;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class person_company_templates_email_templates extends base {
public WebDriver driver;
	
	public  person_company_templates_email_templates(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement person_company() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preference, "person_company")));
	}
	
	public WebElement person_company_templates() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates")));
	}
	
	public WebElement person_company_templates_email_templates() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_email_templates, "person_company_templates_email_templates")));
	}
	
	public WebElement person_company_templates_email_templates_textinput() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_email_templates, "person_company_templates_email_templates_textinput")));
	}
	
	public WebElement person_company_templates_email_templates_savebutton() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_email_templates, "person_company_templates_email_templates_savebutton")));
	}
	
	public WebElement person_company_templates_email_templates_1stelement() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_email_templates, "person_company_templates_email_templates_1stelement")));
	}
	
	public WebElement person_company_templates_email_templates_1stelement_image() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_email_templates, "person_company_templates_email_templates_1stelement_image")));
	}
	
	public WebElement person_company_templates_email_templates_1stelement_HTML_textarea() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_email_templates, "person_company_templates_email_templates_1stelement_HTML_textarea")));
	}
	
	public WebElement person_company_templates_email_templates_1stelement_HTML_savebutton() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_email_templates, "person_company_templates_email_templates_1stelement_HTML_savebutton")));
	}
	
	
	public By person_company_templates_email_templates_typelist() throws IOException {
        return By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_email_templates, "person_company_templates_email_templates_typelist"));
     }


}
