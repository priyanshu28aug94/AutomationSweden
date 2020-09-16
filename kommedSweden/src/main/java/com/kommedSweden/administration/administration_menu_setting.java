package com.kommedSweden.administration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.generic_library;

public class administration_menu_setting {
	public WebDriver driver;
	public administration_menu_setting(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
		public WebElement administration() throws IOException {
			return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_menu_setting, "administration")));
		}
		public WebElement kommed() throws IOException {
			return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_menu_setting, "kommed")));
		}
		public WebElement kommed_nemu_setting() throws IOException {
			return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_menu_setting, "kommed_nemu_setting")));
		}
		public WebElement kommed_menu_setting_text() throws IOException {
			return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_menu_setting, "kommed_menu_setting_text")));
		}
		public WebElement kommed_daublekey() throws IOException {
			return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_menu_setting, "kommed_daublekey")));
		}
		public WebElement daublekey_type() throws IOException {
			return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_menu_setting, "daublekey_type")));
		}
		public WebElement daublekey_status() throws IOException {
			return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_menu_setting, "daublekey_status")));
		}
		public WebElement daublekey_submit() throws IOException {
			return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_menu_setting, "daublekey_submit")));
		}
		public WebElement daublekey_title_text() throws IOException {
			return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_menu_setting, "daublekey_title_text")));
		}
		
}

