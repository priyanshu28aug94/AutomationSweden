package com.kommedSweden.billing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.generic_library;

public class billing {
	//public static final String billing_templates_invoice_templates="\\xpath_property_files\\billing_property_files\\billing_templates_invoice_template.properties";
	
	public WebDriver driver;
	public billing(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	generic_library gl = new generic_library(driver);
	
	public WebElement billing() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing, "billing")));
	}
	public WebElement ocr_string_text() throws IOException {
		return driver.findElement(By.xpath(gl.access_properties_file(properties_file_path_billing.billing, "ocr_string_text")));
	}
	
	public WebElement ocr_string_text_box() throws IOException {
		return driver.findElement(By.xpath(gl.access_properties_file(properties_file_path_billing.billing, "ocr_string_text_box")));
	}
	}
