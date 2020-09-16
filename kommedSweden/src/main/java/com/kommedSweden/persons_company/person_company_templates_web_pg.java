package com.kommedSweden.persons_company;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.generic_library;

public class person_company_templates_web_pg {
public WebDriver driver;
	
	public  person_company_templates_web_pg(WebDriver driver) {
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
	
	public WebElement person_company_templates_web_pg() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg")));
	}
	
	public WebElement person_company_templates_web_pg_textinput() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg_textinput")));
	}
	
	public WebElement person_company_templates_web_pg_savebutton() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg_savebutton")));
	}
	
	public WebElement person_company_templates_web_pg_1stelement_editbutton() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg_1stelement_editbutton")));
	}
	
	public WebElement person_company_templates_web_pg_edit_textinput() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg_edit_textinput")));
	}
	
	public WebElement person_company_templates_web_pg_edit_savebutton() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg_edit_savebutton")));
	}
	
	public WebElement person_company_templates_web_pg_1stelement() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg_1stelement")));
	}
	
	public WebElement person_company_templates_web_pg_1stelement_image() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg_1stelement_image")));
	}
	
	public WebElement person_company_templates_web_pg_1stelement_selectable_value_choose_file() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg_1stelement_selectable_value_choose_file")));
	}
	
	public WebElement person_company_templates_web_pg_1stelement_selectable_value_savebutton() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg_1stelement_selectable_value_savebutton")));
	}
	
	public WebElement person_company_templates_web_pg_1stelement_selectable_value_uploaded_file_name() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg_1stelement_selectable_value_uploaded_file_name")));
	}
	
	
	public By person_company_templates_web_pg_typelist() throws IOException {
        return By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_templates_web_pg, "person_company_templates_web_pg_typelist"));
     }

}
