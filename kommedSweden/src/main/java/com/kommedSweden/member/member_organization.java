package com.kommedSweden.member;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.generic_library;

public class member_organization {
	public WebDriver driver;
	
	public  member_organization(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement member() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "member")));
	}
	
	public WebElement organization() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "organization")));
	}
	public WebElement create_org() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "create_org")));
	}
	public WebElement create_neworg() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "create_neworg")));
	}
	public WebElement create_neworgsave() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "create_neworgsave")));
	}
	public WebElement list_of_active_members() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "list_of_active_members")));
	}
	public WebElement list_all_members() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "list_all_members")));
	}
	public WebElement create_new_group() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "create_new_group")));
	}
	
	public WebElement group_type() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "group_type")));
	}
	public WebElement undergroup_subtype() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "undergroup_subtype")));
	}
	public WebElement group_name() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "group_name")));
	}
	public WebElement group_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "group_save")));
	}
	public By member_org_create_user_group_type_list() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "member_org_create_user_group_type_list"));
	}
	public By member_create_new_org_list() throws IOException {
		return By.xpath(generic_library.access_properties_file(properties_file_path_member.member_organization, "member_create_new_org_list"));
	}
}
