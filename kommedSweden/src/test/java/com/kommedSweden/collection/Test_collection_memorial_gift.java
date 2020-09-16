package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_memorial_gift extends base {
	
	generic_library gl = new generic_library(driver);
	  @Test(groups= {"sanity"})
		public void collection_5() throws IOException, InterruptedException   {
			collection_memorial_gift pcn = new collection_memorial_gift(driver);
//			System.out.println("hello");
			gl.action_mouseover(pcn.collection());		
			gl.click(pcn.collection_memorial_gift());
			String expected_title=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_memorial_gift, "expected_title");
			
			String title_text = gl.get_text(pcn.collection_memorial_gift_pagetitle());
			gl.assert_method(title_text, expected_title);
		}
		
	@Test(groups= {"sanity"})
		public void collection_6() throws IOException, InterruptedException   {
			collection_memorial_gift pcn = new collection_memorial_gift(driver);
//			System.out.println("hello");
			gl.action_mouseover(pcn.collection());		
			gl.click(pcn.collection_memorial_gift());
			gl.click(pcn.collection_memorial_gift_new());
			String name = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_memorial_gift, "name");
			String expected_admin_title=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_memorial_gift, "expected_admin_title");
			gl.select_by_visible_text(pcn.collection_memorial_gift_new_dropdown(), "Create main campaign");
			gl.sendKeys(pcn.collection_memorial_gift_new_input(), name);
			gl.click(pcn.collection_memorial_gift_new_submit());
			String title_text = gl.get_text(pcn.collection_memorial_gift_admin_pagetitle());
			gl.assert_method(title_text, expected_admin_title);
		
		}
		
		
		

	@Test(groups= {"sanity"})
	public void collection_7() throws IOException, InterruptedException   {
		collection_memorial_gift pcn = new collection_memorial_gift(driver);
//		System.out.println("hello");
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_memorial_gift());
		gl.click(pcn.collection_memorial_gift_selectgift());
		gl.click(pcn.collection_memorial_gift_adminclick());
		
		//   gl.ClickOnLastElementFromList(pcn.collection_memorial_gift_overview_checknew());
		 String name2=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_congratulation_gift, "name2");
	        pcn.collection_memorial_gift_admin_name().clear();
	     	gl.sendKeys(pcn.collection_memorial_gift_admin_name(), name2);
			gl.click(pcn.collection_memorial_gift_admin_save());
			gl.click(pcn.collection_memorial_gift_overview());
			String c_name = gl.get_text(pcn.collection_memorial_gift_campaign_overview_campaign_name());
			gl.assert_method(c_name, name2);
	}
	
	 @Test(groups= {"sanity"})
	public void collection_8() throws IOException, InterruptedException   {
		collection_memorial_gift pcn = new collection_memorial_gift(driver);
//		System.out.println("hello");
		String name = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_memorial_gift, "name");
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_memorial_gift());
		String new_campaign=gl.get_last_element(pcn.collection_memorial_gift_overview_checknew());
		gl.assert_method(new_campaign, name);
	}
	
	@Test(groups= {"sanity"})
	public void collection_9() throws IOException, InterruptedException   {
		collection_memorial_gift pcn = new collection_memorial_gift(driver);
//		System.out.println("hello");
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_memorial_gift());
		gl.click(pcn.collection_memorial_gift_overview_campaign_parent1());
		gl.click(pcn.collection_memorial_gift_overview_campaign_parent1_child());
		String id=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_memorial_gift, "id");
		String date=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_memorial_gift, "date");
		String amount=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_memorial_gift, "amount");
		String dropdown1=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_memorial_gift, "dropdown1");
		String dropdown2=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_memorial_gift, "dropdown2");
		String dropdown3=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_memorial_gift, "dropdown3");
		String expected_title=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_memorial_gift, "expected_title");
		gl.sendKeys(pcn.collection_memorial_gift_overview_payers(), id);
		gl.sendKeys(pcn.collection_memorial_gift_overview_date(), date);
		gl.sendKeys(pcn.collection_memorial_gift_overview_amount(), amount);
		gl.select_by_value(pcn.collection_memorial_gift_overview_poption(), dropdown1);
		gl.select_by_value(pcn.collection_memorial_gift_overview_moption(), dropdown2);
		gl.select_by_value(pcn.collection_memorial_gift_overview_puroption(), dropdown3);
		gl.click(pcn.collection_memorial_gift_overview_checkbox());
		gl.click(pcn.collection_memorial_gift_overview_sbutton());
		String title_text = gl.get_text(pcn.collection_memorial_gift_pagetitle());
		gl.assert_method(title_text, expected_title);
		
	}
		
}