package com.kommedSweden.billing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.generic_library;

public class billing_create_invoice {
	public WebDriver driver;
	public billing_create_invoice(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	generic_library gl = new generic_library(driver);
	
	public WebElement billing_create_invoice() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_create_invoice, "create_invoice")));
	}
	
	public WebElement billing_create_invoice_button() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_create_invoice, "create_invoice_button")));
	}
}
