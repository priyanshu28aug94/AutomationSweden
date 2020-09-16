package com.kommedSweden.billing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.generic_library;
import com.kommedSweden.properties_file_path;

public class billing_templates_invoice_template {
	public WebDriver driver;
	public billing_templates_invoice_template(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	generic_library gl = new generic_library(driver);
	
	public WebElement billing() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_templates_invoice_templates, "billing")));
	}
	
	public WebElement billing_templates() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_templates_invoice_templates, "templates")));
	}
	
	public WebElement billing_templates_invoice_templates() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_templates_invoice_templates, "invoice_templates")));
	}
	
	public WebElement billing_templates_invoice_templates_name() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_templates_invoice_templates, "name")));
	}
	
	//By PersonAndCompanySearchClickOnSelectDropDown = By.xpath("//div[@id='inputarea_input']/select");
	public By get_list_of_element() throws IOException {
		 return By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_templates_invoice_templates, "element_list"));
	}
	
	public By mouseover_list_on_billing_module() throws IOException {
		 return By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_templates_invoice_templates, "mouseover_list_on_billing_module"));
	}
	
	public By mouseover_list_on_template_module() throws IOException {
		 return By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_templates_invoice_templates, "mouseover_list_on_template_module"));
	}
	
	
	public By billing1() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_templates_invoice_templates, "billing"));
	}
	
	public WebElement billing_templates_invoice_template_create_invoices_button() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_templates_invoice_templates, "create_invoices")));
	}
	
	public WebElement billing_templates_invoice_template_invoices_template_button() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_templates_invoice_templates, "button")));
	}
}
