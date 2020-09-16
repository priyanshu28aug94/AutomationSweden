package com.kommedSweden.billing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.generic_library;

public class billing_templates_paying {
	public WebDriver driver;
	public billing_templates_paying(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	generic_library gl = new generic_library(driver);
	
	public WebElement billing_templates_paying() throws IOException {
		return driver.findElement(By.xpath(gl.access_properties_file(properties_file_path_billing.billing_templates_paying, "billing_template_paying")));
	}
	
	public WebElement billing_template_paying_textbox() throws IOException {
		return driver.findElement(By.xpath(gl.access_properties_file(properties_file_path_billing.billing_templates_paying, "billing_template_paying_textbox")));
	}
	
	public WebElement billing_template_paying_savebutton() throws IOException {
		return driver.findElement(By.xpath(gl.access_properties_file(properties_file_path_billing.billing_templates_paying, "billing_template_paying_savebutton"))); 
	}
	
	public By billing_template_paying_listofelement() throws IOException {
		return By.xpath(gl.access_properties_file(properties_file_path_billing.billing_templates_paying, "billing_template_paying_listofelement"));
	}
}
