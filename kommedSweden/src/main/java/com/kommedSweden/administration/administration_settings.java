
package com.kommedSweden.administration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.generic_library;


public class administration_settings {
	public WebDriver driver;
	public administration_settings(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement administration() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "administration")));
	}
	public WebElement ad_setting() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "ad_setting")));
	}
	public WebElement language() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "language")));
	}
	public WebElement ad_postcode() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "ad_postcode")));
	}
	public WebElement ad_postcode_country() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "ad_postcode_country")));
	}
	public WebElement ad_postcode_organization() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "ad_postcode_organization")));
	}
	public WebElement ad_postcode_zipcode() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "ad_postcode_zipcode")));
	}
	public WebElement ad_city() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "ad_city")));
				
	}
	public WebElement ad_create_postcode() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "ad_create_postcode")));
				
	}
	public WebElement ad_postcode_search() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "ad_postcode_search")));
				
	}
	public WebElement search_postcode_pincode() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "search_postcode_pincode")));
				
	}
	public WebElement search_postcode_city() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_settings, "search_postcode_city")));
				
	}
	
	
}
