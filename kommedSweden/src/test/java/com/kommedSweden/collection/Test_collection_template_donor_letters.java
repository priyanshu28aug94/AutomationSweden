package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_template_donor_letters extends base{
	
	generic_library gl = new generic_library(driver);
	//   @Test(groups= {"sanity"})
		public void collection_23() throws IOException, InterruptedException   {
		   collection_template_donor_letters pcn = new collection_template_donor_letters(driver);
//			System.out.println("hello");
			gl.action_mouseover(pcn.collection());		
			gl.action_mouseover(pcn.collection_template());	
			gl.click(pcn.collection_template_donor_letters());
			String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_template_donor_letters, "expected_title");
			String title_text = gl.get_text(pcn.collection_template_donor_letters_pagetitle());
			gl.assert_method(title_text, expected_title);
		}
		
		//  @Test(groups= {"sanity"})
		public void collection_24() throws IOException, InterruptedException   {
			   collection_template_donor_letters pcn = new collection_template_donor_letters(driver);
//				System.out.println("hello");
				gl.action_mouseover(pcn.collection());		
				gl.action_mouseover(pcn.collection_template());	
				gl.click(pcn.collection_template_donor_letters());
			
			String name=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_template_donor_letters, "name");
			gl.sendKeys(pcn.collection_template_donor_letters_new_input(), name);
			gl.click(pcn.collection_template_donor_letters_save());
			
			String new_template = gl.get_last_element(pcn.collection_template_donor_letters_new_template());
			gl.assert_method(new_template, name);
		}
		
	//  @Test(groups= {"sanity"})
			public void collection_25() throws IOException, InterruptedException   {
				   collection_template_donor_letters pcn = new collection_template_donor_letters(driver);
//					System.out.println("hello");
				   String collection_upload_files_pdf = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_upload_files_pdf, "collection_upload_files_pdf");
					gl.action_mouseover(pcn.collection());		
					gl.action_mouseover(pcn.collection_template());	
					gl.click(pcn.collection_template_donor_letters());
					
					gl.click(pcn.collection_template_donor_letters_1stelement());
					gl.click(pcn.collection_template_donor_letters_upload_file());
					gl.uploadFile("Resources\\collection\\", collection_upload_files_pdf+".pdf");
					gl.click(pcn.collection_template_donor_letters_savebutton());
					String get_file_name = gl.trim_string_using_dot(gl.get_text(pcn.collection_template_donor_letters_1stelement_selectable_value_uploaded_file_name()));
					gl.assert_method(get_file_name, collection_upload_files_pdf);
					
			}
		
		@Test(groups= {"sanity"})
		public void collection_26() throws IOException, InterruptedException   {
			   collection_template_donor_letters pcn = new collection_template_donor_letters(driver);
//				System.out.println("hello");
			   String external_input_web_pg_disable_image = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_template_donor_letters, "disable_image");
		    	String external_input_web_pg_active_image =generic_library.access_properties_file(properties_file_path_collections.external_input_collection_template_donor_letters, "active_image");
			   
				gl.action_mouseover(pcn.collection());		
				gl.action_mouseover(pcn.collection_template());	
				gl.click(pcn.collection_template_donor_letters());
				String get_edited_element_text_beforeclick = pcn.collection_template_donor_letters_image_button().getAttribute("title");
				if (get_edited_element_text_beforeclick.equals(external_input_web_pg_disable_image)) {
					gl.click(pcn.collection_template_donor_letters_image_button());
					String get_edited_element_text_afterclick = pcn.collection_template_donor_letters_image_button().getAttribute("title");
					gl.assert_method(get_edited_element_text_afterclick, external_input_web_pg_active_image);
				}else {
					gl.click(pcn.collection_template_donor_letters_image_button());
					String get_edited_element_text_afterclick = pcn.collection_template_donor_letters_image_button().getAttribute("title");
					gl.assert_method(get_edited_element_text_afterclick, external_input_web_pg_disable_image);
				}
						
		}
		
		//  @Test(groups= {"sanity"})
			public void collection_28() throws IOException, InterruptedException   {
			  collection_template_donor_letters pcn = new collection_template_donor_letters(driver);
//				System.out.println("hello");
				gl.action_mouseover(pcn.collection());		
				gl.action_mouseover(pcn.collection_template());	
				gl.click(pcn.collection_template_donor_letters());
				gl.click(pcn.collection_template_donor_letters_edit_button());
				gl.get_window_handle(1);
				String name=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_template_donor_letters, "name2");
				gl.sendKeys(pcn.collection_template_sponsor_letter_popup_input(), name);
				gl.click(pcn.collection_template_sponsor_letter_popup_save());
				gl.get_window_handle(0);
				String new_template = gl.get_text(pcn.collection_template_donor_letters_1stelement());
				gl.assert_method(new_template, name);
			}
		
}
