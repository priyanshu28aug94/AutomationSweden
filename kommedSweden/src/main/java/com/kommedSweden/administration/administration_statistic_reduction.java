package com.kommedSweden.administration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.generic_library;

public class administration_statistic_reduction {
	public WebDriver driver;
	public administration_statistic_reduction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement administration() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_statistic_reduction, "administration")));
	}
	public WebElement administration_statictis_reduction() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_statistic_reduction, "administration_statictis_reduction")));
	}
	public WebElement administration_staticstis_reduction_posting_list() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_statistic_reduction, "administration_staticstis_reduction_posting_list")));
	}
	public WebElement from_date() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_statistic_reduction, "from_date")));
	}
	public WebElement last_date() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_statistic_reduction, "last_date")));
	}
	public WebElement posting_list_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_statistic_reduction, "posting_list_save")));
	}
	public WebElement ad_statistik_postlist_test() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_statistic_reduction, "ad_statistik_postlist_test")));
	}
	
	public WebElement administration_webfile() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_statistic_reduction, "administration_webfile")));
	}
	public WebElement web_file() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_statistic_reduction, "web_file")));
	}
	public WebElement web_file_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_statistic_reduction, "web_file_save")));
	}
	public By ad_web_file_list() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_statistic_reduction, "ad_web_file_list"));
	}
	
}
