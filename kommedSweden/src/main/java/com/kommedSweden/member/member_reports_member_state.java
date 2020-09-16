package com.kommedSweden.member;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.generic_library;
import com.kommedSweden.properties_file_path;

public class member_reports_member_state {
public WebDriver driver;
	
	public  member_reports_member_state(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement member() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_member_state, "member")));
	}
	public WebElement report() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_member_state, "report")));
	}
	public WebElement member_State() throws IOException {		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_member_state, "member_State")));
	}
	public WebElement member_button() throws IOException {		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_member_state, "member_button")));
	}
	public WebElement member_statistics_title_text() throws IOException {		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_member_state, "member_statistics_title_text")));
	}
	public WebElement report_organization_report() throws IOException {		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_member_state, "report_organization_report")));
	}
	public WebElement organization_report_page_title() throws IOException {		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_reports_member_state, "organization_report_page_title")));
	}
}
