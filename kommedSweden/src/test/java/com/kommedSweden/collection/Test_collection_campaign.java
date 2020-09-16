package com.kommedSweden.collection;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;


public class Test_collection_campaign extends base {

	generic_library gl = new generic_library(driver);
	    @Test(groups= {"sanity"})
		public void collection_19() throws IOException, InterruptedException   {
			collection_campaign pcn = new collection_campaign(driver);
//			System.out.println("hello");
			gl.action_mouseover(pcn.collection());		
			gl.click(pcn.collection_campaign());
			String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_campaign, "expected_title");
			String title_text = gl.get_text(pcn.collection_campaign_pagetitle());
			gl.assert_method(title_text, expected_title);
		}
		
	@Test(groups= {"sanity"})
	public void collection_20() throws IOException, InterruptedException   {
		collection_campaign pcn = new collection_campaign(driver);
//		System.out.println("hello");
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_campaign());
			gl.click(pcn.collection_campaign_new());
			String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_campaign, "expected_title");
			String name = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_campaign, "name");	
			String sdate=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_campaign, "sdate");
			String edate=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_campaign, "edate");
			gl.select_by_visible_text(pcn.collection_campaign_new_dropdown(), "Create main campaign");
			gl.sendKeys(pcn.collection_campaign_new_name_input(), name);
			gl.sendKeys(pcn.collection_campaign_new_startdate_input(), sdate);
			gl.sendKeys(pcn.collection_campaign_new_enddate_input(), edate);
			gl.click(pcn.collection_campaign_new_submit());
			String title_text = gl.get_text(pcn.collection_campaign_pagetitle());
			gl.assert_method(title_text, expected_title);
		
		}
		
		
		

	@Test(groups= {"sanity"})
	public void collection_21() throws IOException, InterruptedException   {
		collection_campaign pcn = new collection_campaign(driver);
//		System.out.println("hello");
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_campaign());
		gl.click(pcn.collection_campaign_overview_campaign());
		gl.click(pcn.collection_campaign_admin());
        String name=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_campaign, "name2");
        pcn.collection_campaign_admin_name().clear();
     	gl.sendKeys(pcn.collection_campaign_admin_name(), name);
		gl.click(pcn.collection_campaign_admin_save());
		gl.click(pcn.collection_campaign_overview());
		String c_name = gl.get_text(pcn.collection_campaign_overview_campaign_name());
		gl.assert_method(c_name, name);
	}
	
	@Test(groups= {"sanity"})
	public void collection_22() throws IOException, InterruptedException   {
		collection_campaign pcn = new collection_campaign(driver);
		 String name=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_campaign, "name");
//		System.out.println("hello");
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_campaign());
		String new_campaign=gl.get_last_element(pcn.collection_campaign_overview_new_campaign());
		gl.assert_method(new_campaign, name);
	}

	@Test(groups= {"sanity"})
	public void collection_23() throws IOException, InterruptedException   {
		collection_campaign pcn = new collection_campaign(driver);
		 String graph_title1=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_campaign, "graph_title1");
		 String graph_title=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_campaign, "graph_title");

		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_campaign());
	
		
		gl.switch_frame_using_webelement(pcn.collection_campaign_column_graph());

		gl.click(pcn.collection_campaign_graph_click1());
		String cgraph_title=gl.get_text(pcn.collection_campaign_graph_title());
	gl.assert_method(cgraph_title, graph_title);
	System.out.println(cgraph_title);
	gl.click(pcn.collection_campaign_graph_click1());
	cgraph_title=gl.get_text(pcn.collection_campaign_graph_title());
	gl.assert_method(cgraph_title, graph_title1);
	System.out.println(cgraph_title);
	 gl.back_to_mainwindow_after_iframe();

		
	}
	
}
