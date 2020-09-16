package com.kommedSweden.billing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.generic_library;

public class billing_reports_daily_reports {
	public WebDriver driver;
	public billing_reports_daily_reports(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	generic_library gl = new generic_library(driver);
	public WebElement billing_reports() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_report_daily_reports, "reports")));
	}
	
	public WebElement billing_reports_dailyreport() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_report_daily_reports, "billing_report_dailyreport")));
	}
	
	public By mousehover_list_on_report() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_report_daily_reports, "mousehover_list_on_reports"));
	}
	public WebElement billing_report_dailyreport_date() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_report_daily_reports, "billing_report_dailyreport_date")));
	}
	public WebElement billing_report_daily_report_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_billing.billing_report_daily_reports, "billing_report_daily_report_save")));
	}
}
