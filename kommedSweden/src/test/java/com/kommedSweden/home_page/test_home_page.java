package com.kommedSweden.home_page;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommed.property_file_path_of_modules.properties_file_path_home_page;
import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.collection.collection_campaign;
import com.kommedSweden.persons_company.person_company_create_user_client_list;

public class test_home_page extends base{
	
generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
	public void home_page_01() throws IOException, InterruptedException   {
		home_page hp = new home_page(driver);
		String home_page_last_records_id_title=generic_library.access_properties_file(properties_file_path_home_page.external_input_home_page, "home_page_last_records_id_title");
		gl.action_mouseover(hp.home_page_image_icon());
		gl.action_mouseover(hp.home_page_image_last_records());
		gl.click(hp.home_page_image_last_records_1st_id());
		String get_last_record_id = gl.get_text(hp.home_page_last_records_id_title());
		gl.click(hp.home_page_image_icon());
		String get_last_records_1st_id = gl.get_text(hp.home_page_last_records_1st_id());
		String get_last_records_1st_name = gl.get_text(hp.home_page_last_records_1st_name());
		gl.assert_method(get_last_record_id, home_page_last_records_id_title+get_last_records_1st_name+" ("+get_last_records_1st_id+")");
	}
	
	@Test(groups= {"sanity"})
	public void home_page_02() throws IOException, InterruptedException   {
		home_page hp = new home_page(driver);
		 String graph_title=generic_library.access_properties_file(properties_file_path_home_page.external_input_home_page, "home_page_graph_title");
		 gl.switch_frame_using_webelement(hp.home_page_graph_iframe());
		 String home_page_graph_title=gl.get_text(hp.home_page_graph_iframe_title());
		 gl.assert_method(home_page_graph_title, graph_title);
		 gl.back_to_mainwindow_after_iframe();
	}
}
