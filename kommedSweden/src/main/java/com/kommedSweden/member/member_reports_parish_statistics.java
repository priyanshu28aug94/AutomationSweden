package com.kommedSweden.member;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.generic_library;


public class member_reports_parish_statistics {
	public WebDriver driver;
	public  member_reports_parish_statistics(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement member() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_parish_statistics, "member")));
	}
	public WebElement report() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_parish_statistics, "report")));
	}
	public WebElement statiktis() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_parish_statistics, "statiktis")));
	}
	public WebElement start_date() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_parish_statistics, "start_date")));
	}
	public WebElement end_date() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_parish_statistics, "end_date")));
	}
	public WebElement send_button() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_parish_statistics, "send_button")));
	}
	public WebElement parish_statistik_page_title() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_parish_statistics, "parish_statistik_page_title")));
	}
}
