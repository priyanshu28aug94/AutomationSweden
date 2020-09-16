package com.kommedSweden.member;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.member.member_organization;

public class test_member_organization extends base {
	
	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"})
	public void member_1() throws IOException, InterruptedException   {
		member_organization mo = new member_organization(driver);
		System.out.println("hello");
		gl.action_mouseover(mo.member());
		gl.click(mo.organization());
		String actual=gl.get_url();
		String organization=generic_library.access_properties_file(properties_file_path_member.external_input_member_organization, "organization");
		gl.assert_method(actual, organization);
	}
	
	@Test(groups= {"sanity"})
	public void member_2() throws IOException, InterruptedException   {
		member_organization mo = new member_organization(driver);
		System.out.println("hello");
		gl.action_mouseover(mo.member());
		gl.click(mo.organization());
		String actual=gl.get_url();
		String organization=generic_library.access_properties_file(properties_file_path_member.external_input_member_organization, "organization");
		gl.assert_method(actual, organization);
	}
	@Test(groups= {"sanity"})
			public void member_3() throws IOException, InterruptedException   {
				member_organization mo = new member_organization(driver);
				
				System.out.println("hello");
				gl.action_mouseover(mo.member());
                gl.click(mo.organization());
				gl.click(mo.create_org());
				String actual=gl.get_url();
				System.out.println(actual);
				String create_new_org = generic_library.access_properties_file(properties_file_path_member.external_input_member_organization, "create_new_org");
			    gl.assert_method(actual, create_new_org);				
					
			}
//			@Test(groups= {"sanity"})
//			public void member_4() throws IOException, InterruptedException   {
//				member_organization mo = new member_organization(driver);
//				
//				System.out.println("hello");
//				gl.action_mouseover(mo.member());
//				gl.click(mo.organization());
//				gl.click(mo.create_org());
//				String actual=gl.get_url();
//				String create_new_org = generic_library.access_properties_file(properties_file_path_member.external_input_member_organization, "create_new_org");
//			    gl.assert_method(actual, create_new_org);	
//			    gl.click(mo.create_neworg());
//			    String new_org = generic_library.access_properties_file(properties_file_path_member.external_input_member_organization, "new_org");
//			    gl.sendKeys(mo.create_neworg(), new_org);
//			    
//				}
			
			@Test(groups= {"sanity"})
			public void member_4() throws IOException, InterruptedException   {
				member_organization mo = new member_organization(driver);
				
				System.out.println("hello");
				gl.action_mouseover(mo.member());
				gl.click(mo.organization());
				Thread.sleep(2000);
				gl.click(mo.create_org());
				String actual=gl.get_url();
				String create_new_org = generic_library.access_properties_file(properties_file_path_member.external_input_member_organization, "create_new_org");
			    gl.assert_method(actual, create_new_org);	
			    gl.click(mo.create_neworg());
			    String new_org = generic_library.access_properties_file(properties_file_path_member.external_input_member_organization, "new_org");
			    String new_group_withtime=new_org+gl.gettingDateAndTime();
			    gl.sendKeys(mo.create_neworg(), new_org);
			    gl.click(mo.create_neworgsave());
			    String actualf=gl.FindTheRequiredStringFromAList(mo.member_create_new_org_list(), new_group_withtime);
			    gl.assert_method(actualf, new_group_withtime);
			    
				}
			@Test(groups= {"sanity"})
			public void member_5() throws IOException, InterruptedException   {
				member_organization mo = new member_organization(driver);
				System.out.println("hello");
				gl.action_mouseover(mo.member());
				gl.click(mo.organization());
				gl.click(mo.list_of_active_members());
				String actual=gl.get_url();
				System.out.println(actual);
				String list_of_active_member = generic_library.access_properties_file(properties_file_path_member.external_input_member_organization, "list_of_active_member");
				gl.assert_method(actual, list_of_active_member);
			    
				}
			@Test(groups= {"sanity"})
			public void member_6() throws IOException, InterruptedException   {
				member_organization mo = new member_organization(driver);
				System.out.println("hello");
				gl.action_mouseover(mo.member());
				gl.click(mo.organization());
				Thread.sleep(2000);
				gl.click(mo.list_all_members());
				String actual=gl.get_url();
				System.out.println(actual);
				String list_of_all_member = generic_library.access_properties_file(properties_file_path_member.external_input_member_organization, "list_of_all_member");
				gl.assert_method(actual, list_of_all_member);
			    
				
				}
			@Test(groups= {"sanity"})
			public void member_7() throws IOException, InterruptedException   {
				member_organization mo = new member_organization(driver);
				System.out.println("hello");
				gl.action_mouseover(mo.member());
				gl.click(mo.organization());
				Thread.sleep(2000);
				gl.click(mo.create_new_group());
				gl.get_window_handle(1);
				gl.select_by_value(mo.group_type(), "2");
				gl.select_by_value(mo.undergroup_subtype(), "4");
				gl.click(mo.group_name());
				String new_group = generic_library.access_properties_file(properties_file_path_member.external_input_member_organization, "new_group");
				String new_group_withtime=new_group+gl.gettingDateAndTime();
				gl.sendKeys(mo.group_name(), new_group_withtime);
				gl.click(mo.group_save());
				gl.get_window_handle(0);
				String actual=gl.FindTheRequiredStringFromAList(mo.member_org_create_user_group_type_list(), new_group_withtime);
				gl.assert_method(actual, new_group_withtime);
						
				}
}

