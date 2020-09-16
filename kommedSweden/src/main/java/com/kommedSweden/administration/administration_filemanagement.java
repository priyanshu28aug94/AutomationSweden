package com.kommedSweden.administration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.generic_library;

public class administration_filemanagement {
	public WebDriver driver;
	public administration_filemanagement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement administration() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_filemanagement, "administration")));
	}
	public WebElement administration_file_management() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_filemanagement, "administration_file_management")));
	}
	public WebElement file_upload() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_filemanagement, "file_upload")));
	}
	public WebElement file_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_filemanagement, "file_save")));
	}
	public WebElement download_file() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_filemanagement, "download_file")));
	}
	public WebElement administration_import() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_filemanagement, "administration_import")));
	}
	public WebElement import_d2d_file() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_filemanagement, "import_d2d_file")));
	}
	public WebElement import_d2d_file_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_filemanagement, "import_d2d_file_save")));
	}
	public WebElement ad_file_mane_text() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_filemanagement, "ad_file_mane_text")));
	}
	public WebElement import_d2d_file_text() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_filemanagement, "import_d2d_file_text")));
	}
	
}
