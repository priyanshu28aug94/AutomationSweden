package com.kommedSweden.administration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.generic_library;

public class administration_kommed {
	public WebDriver driver;
	public administration_kommed(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement administration() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "administration")));
	}
	public WebElement kommed() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "kommed")));
	}
	public WebElement contral_panel() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "contral_panel")));
	}
	public WebElement show_sql_no() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "show_sql_no")));
	}
	public WebElement show_sql_yes() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "show_sql_yes")));
	}
	public WebElement contral_panel_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "contral_panel_save")));
	}
	public WebElement contral_panel_text() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "contral_panel_text")));
	}
	public WebElement show_language_code() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "show_language_code")));
	}
	public WebElement show_language_code_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "show_language_code_save")));
	}
	public WebElement certificate_1() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "certificate_1")));
	}
	public WebElement certificate_1_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "certificate_1_save")));
	}
	public WebElement payment_mode() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "payment_mode")));
	}
	public WebElement Payment_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "Payment_save")));
	}
	public WebElement kommed_web() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "kommed_web")));
	}
	public WebElement kommed_web_name() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "kommed_web_name")));
	}
	public WebElement kommed_web_ip() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "kommed_web_ip")));
	}
	public WebElement kommed_web_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "kommed_web_save")));
	}
	public WebElement kommed_web_edit() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "kommed_web_edit")));
	}
	public WebElement kommed_newweb_name() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "kommed_newweb_name")));
	}
	public WebElement kommed_newweb_name_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "kommed_newweb_name_save")));
	}
	public WebElement kommed_web_1st_statement() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "kommed_web_1st_statement")));
	}
	public WebElement kommed_web_1st_webservice_img() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_kommed, "kommed_web_1st_webservice_img")));
	}
}
