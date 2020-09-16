package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;


public class Test_collection_congratulation_gift extends base {
	
	generic_library gl = new generic_library(driver);
	    @Test(groups= {"sanity"})
		public void collection_10() throws IOException, InterruptedException   {
			collection_congratulation_gift pcn = new collection_congratulation_gift(driver);
//			System.out.println("hello");
			
			String expected_title=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_congratulation_gift, "expected_title");
			
			gl.action_mouseover(pcn.collection());		
			gl.click(pcn.collection_congratulation_gift());
			
			String title_text = gl.get_text(pcn.collection_congratulation_gift_pagetitle());
			gl.assert_method(title_text, expected_title);
		}
		
	@Test(groups= {"sanity"})
		public void collection_11() throws IOException, InterruptedException   {
			collection_congratulation_gift pcn = new collection_congratulation_gift(driver);
//			System.out.println("hello");
			gl.action_mouseover(pcn.collection());		
			gl.click(pcn.collection_congratulation_gift());
			gl.click(pcn.collection_congratulation_gift_new());
			String name = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_congratulation_gift, "name");			
			String expected_admin_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_congratulation_gift, "expected_admin_title");	
			gl.select_by_visible_text(pcn.collection_congratulation_gift_new_dropdown(), "Create main campaign");
			gl.sendKeys(pcn.collection_congratulation_gift_new_input(), name);
			gl.click(pcn.collection_congratulation_gift_new_submit());
			String title_text = gl.get_text(pcn.collection_congratulation_gift_admin_pagetitle());
			gl.assert_method(title_text, expected_admin_title);
		
		}
		
		
		

	@Test(groups= {"sanity"})
	public void collection_12() throws IOException, InterruptedException   {
		collection_congratulation_gift pcn = new collection_congratulation_gift(driver);
//		System.out.println("hello");
		
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_congratulation_gift());
		gl.click(pcn.collection_congratulation_gift_adminclick());
		 String name2=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_congratulation_gift, "name2");
	        pcn.collection_congratulation_gift_admin_name().clear();
	     	gl.sendKeys(pcn.collection_congratulation_gift_admin_name(), name2);
			gl.click(pcn.collection_congratulation_gift_admin_save());
			gl.click(pcn.collection_congratulation_gift_overview());
			String c_name = gl.get_text(pcn.collection_congratulation_gift_campaign_overview_campaign_name());
			gl.assert_method(c_name, name2);
	}
	
	@Test(groups= {"sanity"})
	public void collection_13() throws IOException, InterruptedException   {
		collection_congratulation_gift pcn = new collection_congratulation_gift(driver);
//		System.out.println("hello");
		String name2= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_congratulation_gift, "name");
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_congratulation_gift());
		String new_campaign=gl.get_last_element(pcn.collection_congratulation_gift_overview_checknew());
		gl.assert_method(new_campaign, name2);
	}

}
