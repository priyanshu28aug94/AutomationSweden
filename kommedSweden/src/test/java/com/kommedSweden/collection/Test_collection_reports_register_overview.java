package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_reports_register_overview extends base {

	generic_library gl = new generic_library(driver);
    @Test(groups= {"sanity"}, enabled = true)
	public void gift_42() throws IOException, InterruptedException   {
		collection_reports_register_overview crm = new collection_reports_register_overview(driver);
		gl.action_mouseover(crm.collection());		
		gl.action_mouseover(crm.collection_reports_submenu());		
		gl.click(crm.collection_report_overview());
		String expected = generic_library.access_properties_file(properties_file_path_collections.collection_external_input_report, "register_overview");
		String actual = gl.get_text(crm.collection_report_overview_title());
		gl.assert_method(actual, expected);
	}
}
