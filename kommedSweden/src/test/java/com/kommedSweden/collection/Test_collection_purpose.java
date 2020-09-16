package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_purpose extends base {
	
	generic_library gl = new generic_library(driver);
	     @Test(groups= {"sanity"})
		public void collection_14() throws IOException, InterruptedException   {
	    	 collection_purpose pcn = new collection_purpose(driver);
//			System.out.println("hello");
			gl.action_mouseover(pcn.collection());		
			gl.click(pcn.collection_purpose());
			String expected_title=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_purpose, "expected_title");

			String title_text = gl.get_text(pcn.collection_purpose_pagetitle());
			gl.assert_method(title_text, expected_title);
		}
		
	@Test(groups= {"sanity"})
		public void collection_15() throws IOException, InterruptedException   {
			 collection_purpose pcn = new collection_purpose(driver);
//				System.out.println("hello");
				gl.action_mouseover(pcn.collection());		
				gl.click(pcn.collection_purpose());
			gl.click(pcn.collection_purpose_new());
			String name = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_purpose, "name");			
			String admin_page_title = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_purpose, "admin_page_title");			
			gl.select_by_visible_text(pcn.collection_purpose_new_dropdown(), "Create main purpose");
			gl.sendKeys(pcn.collection_purpose_new_input(), name);
			gl.click(pcn.collection_purpose_new_submit());
			String title_text = gl.get_text(pcn.collection_purpose_admin_pagetitle());
			gl.assert_method(title_text, admin_page_title+name);
		
		}
		
		
		

	 @Test(groups= {"sanity"})
	public void collection_16() throws IOException, InterruptedException   {
		 collection_purpose pcn = new collection_purpose(driver);
//			System.out.println("hello");
		 String name = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_purpose, "name2");			
			String admin_page_title = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_purpose, "admin_page_title");			
		
			gl.action_mouseover(pcn.collection());		
			gl.click(pcn.collection_purpose());
		gl.click(pcn.collection_purpose_adminclick());
		String title_text = gl.get_text(pcn.collection_purpose_admin_pagetitle());
		gl.assert_method(title_text, admin_page_title+name);
	}
	
	@Test(groups= {"sanity"})
	public void collection_17() throws IOException, InterruptedException   {
		 collection_purpose pcn = new collection_purpose(driver);
//			System.out.println("hello");
		 String name = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_purpose, "name3");			
			
			gl.action_mouseover(pcn.collection());		
			gl.click(pcn.collection_purpose());
		String new_campaign=gl.get_last_element(pcn.collection_purpose_overview_checknew());
		gl.assert_method(new_campaign, name);
	}
	
	 @Test(groups= {"sanity"})
	public void collection_18() throws IOException, InterruptedException   {
		 collection_purpose pcn = new collection_purpose(driver);
//			System.out.println("hello");
		 String expected_title=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_purpose, "expected_title");
			gl.action_mouseover(pcn.collection());		
			gl.click(pcn.collection_purpose());
		gl.click(pcn.collection_purpose_statistic());
		String title_text = gl.get_text(pcn.collection_purpose_pagetitle());
		gl.assert_method(title_text, expected_title);
	}

}
