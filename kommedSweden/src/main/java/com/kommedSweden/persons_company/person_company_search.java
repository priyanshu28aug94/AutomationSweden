package com.kommedSweden.persons_company;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.generic_library;

public class person_company_search {
	
public WebDriver driver;
	
	public  person_company_search(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public WebElement person_company() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_new, "person_company")));
	}
	
	public WebElement person_search() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_search")));
	}
	public WebElement person_search_pagetitle() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_search_pagetitle")));
	}
	public WebElement person_company_member() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_member")));
	}
	public WebElement person_company_member_search() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_member_search")));
	}
	public WebElement person_company_member_search_title() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_member_search_title")));
	}
	public WebElement person_company_member_search_ammount() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_member_search_ammount")));
	}
	public WebElement person_company_member_search_ammount_title() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_member_search_ammount_title")));
	}
	public WebElement person_company_fundraising() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_fundraising")));
	}
	public WebElement person_company_fundraising_search_amount() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_fundraising_search_amount")));
	}
	public WebElement person_company_fundraising_search_amount_title() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_fundraising_search_amount_title")));
	}
	public WebElement person_company_subscription() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_subscription")));
	}
	public WebElement person_company_subscription_search() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_subscription_search")));
	}
	public WebElement person_company_subscription_search_title() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_subscription_search_title")));
	}
	public WebElement person_company_groups() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_groups")));
	}
	public WebElement person_company_commitment() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_commitment")));
	}
	public WebElement person_company_sales() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_sales")));
	}
	public WebElement person_company_ledger() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_ledger")));
	}
	public WebElement person_company_account() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_account")));
	}
	public WebElement person_company_event() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_event")));
	}
	public WebElement kommed_logo() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "kommed_logo")));
	}
	public WebElement kommed_last_records() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "kommed_last_records")));
	}
	public WebElement kommed_last_user() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "kommed_last_user")));
	}
	public WebElement view_donor_info() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "view_donor_info")));
	}
	public WebElement view_history() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "view_history")));
	}
	public WebElement view_ledger() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "view_ledger")));
	}
	public WebElement notes_docs() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "notes_docs")));
	}
	public WebElement reg_payments() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "reg_payments")));
	}
	public WebElement view_member() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "view_member")));
	}
	public WebElement subscription() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "subscription")));
	}
	public WebElement commitment() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "commitment")));
	}
	public WebElement sales() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "sales")));
	}
	public WebElement groups() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "groups")));
	}
	public WebElement account() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "account")));
	}
	public WebElement event() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "event")));
	}
	public WebElement settings() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "settings")));
	}
	public WebElement last_user_title() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "last_user_title")));
	}
	public WebElement reg_payment_title() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "reg_payment_title")));
	}	
	public WebElement reg_payment_date() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "reg_payment_date")));
	}
	public WebElement reg_payment_amount() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "reg_payment_amount")));
	}
	public WebElement reg_payment_radio() throws IOException {
	
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "reg_payment_radio")));
	}
	public WebElement memeber_org() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "memeber_org")));
	}
	public WebElement member_submit_btn() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "member_submit_btn")));
	}
	public WebElement commitment_new() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "commitment_new")));
	}
	public WebElement person_company_new_id() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_new_id")));
	}
	public WebElement person_company_new_pagetitle() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_new_pagetitle")));
	}
	public WebElement person_company_group_dropdown() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_group_dropdown")));
	}
	public WebElement person_company_event_title() throws IOException {
		
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_person_company.person_company_search, "person_company_event_title")));
	}
}
