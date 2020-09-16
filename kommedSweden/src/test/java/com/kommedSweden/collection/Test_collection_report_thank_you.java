package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_report_thank_you extends base{
	generic_library gl = new generic_library(driver);
    @Test(groups= {"sanity"}, enabled = true)
	public void gift_45() throws IOException, InterruptedException   {
    	collection_report_thank_you crm = new collection_report_thank_you(driver);
		gl.action_mouseover(crm.collection());		
		gl.action_mouseover(crm.collection_reports_submenu());		
		gl.click(crm.collection_reports_thank_you());
		String expected = generic_library.access_properties_file(properties_file_path_collections.collection_external_input_report, "thankyou_letter");
		String actual = gl.get_text(crm.collection_report_thank_you_title());
		gl.assert_method(actual, expected);
	}

}
