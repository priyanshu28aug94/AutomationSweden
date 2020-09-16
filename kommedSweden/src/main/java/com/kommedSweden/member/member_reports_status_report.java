package com.kommedSweden.member;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.generic_library;
import com.kommedSweden.properties_file_path;

public class member_reports_status_report {
public WebDriver driver;
	
	public  member_reports_status_report(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement member() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_status_report, "member")));
	}
	public WebElement report() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_status_report, "report")));
	}
	public WebElement status_report() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_status_report, "status_report")));
	}
	public WebElement start_date() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_status_report, "start_date")));
	}
	public WebElement end_date() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_status_report, "end_date")));
	}
	public WebElement save_statusreport() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_status_report, "save_statusreport")));
	}
	public WebElement status_report_title() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_status_report, "status_report_title")));
	}
}
