package com.kommedSweden.persons_company;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.generic_library;

public class person_company_preferences_free_properties {
public WebDriver driver;
	
	public  person_company_preferences_free_properties(WebDriver driver) {
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
	
	public WebElement person_company_preferences_free_properties_xpath() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties")));
	}
	
	public WebElement person_company_preferences_free_properties_1stelement_editbutton() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_1stelement_editbutton")));
	}
	
	public WebElement person_company_preferences_free_properties_textinput() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_textinput")));
	}
	
	public WebElement person_company_preferences_free_properties_save_button() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_save_button")));
	}
	
	public WebElement person_company_preferences_free_properties_module_dropdown() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_module_dropdown")));
	}
	
	public WebElement person_company_preferences_free_properties_type_dropdown() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_type_dropdown")));
	}
	
	public WebElement person_company_preferences_free_properties_edit_textinput() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_edit_textinput")));
	}
	
	public WebElement person_company_preferences_free_properties_edit_savebutton() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_edit_savebutton")));
	}
	
	public WebElement person_company_preferences_free_properties_1stelement() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_1stelement")));
	}
	
	public WebElement person_company_preferences_free_properties_2ndelement() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_2ndelement")));
	}
	
	public WebElement person_company_preferences_free_properties_1stelement_image() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_1stelement_image")));
	}
	
	public WebElement person_company_preferences_free_properties_1stelement_selectable_values_textbox() throws IOException {
        return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_1stelement_selectable_values_textbox")));
     }
	
	public WebElement person_company_preferences_free_properties_1stelement_selectable_values_savebutton() throws IOException {
        return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_1stelement_selectable_values_savebutton")));
     }

	public WebElement person_company_preferences_free_properties_selectable_values_1stelement_editbutton() throws IOException {
        return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_selectable_values_1stelement_editbutton")));
     }
	
	public WebElement person_company_preferences_free_properties_selectable_values_1stelement_image() throws IOException {
        return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_selectable_values_1stelement_image")));
     }
	
	public WebElement person_company_preferences_free_properties_selectable_values_1stelement() throws IOException {
        return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_selectable_values_1stelement")));
     }
	
	public WebElement person_company_preferences_free_properties_1stelement_down_green_arrow() throws IOException {
        return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_1stelement_down_green_arrow")));
     }
	
	public WebElement person_company_preferences_free_properties_2ndelement_up_green_arrow() throws IOException {
        return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_2ndelement_up_green_arrow")));
     }
	
	public By person_company_preferences_free_properties_typelist() throws IOException {
        return By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_typelist"));
     }
	
	public By person_company_preferences_free_properties_selectable_values_typelist() throws IOException {
        return By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_preferences_free_properties, "person_company_preferences_free_properties_selectable_values_typelist"));
     }


}
