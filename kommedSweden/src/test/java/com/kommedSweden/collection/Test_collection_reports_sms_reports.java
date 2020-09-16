package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_reports_sms_reports extends base {
	generic_library gl = new generic_library(driver);
	    @Test(groups= {"sanity"})
		public void collection_050() throws IOException, InterruptedException   {
			collection_reports_sms_reports crm = new collection_reports_sms_reports(driver);
			gl.action_mouseover(crm.collection());		
			gl.action_mouseover(crm.collection_reports());		
			gl.click(crm.collection_reports_sms_reports());
			String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_reports_sms_reports, "expected_title");

			String title_text = gl.get_text(crm.collection_reports_sms_reports_title());
			gl.assert_method(title_text, expected_title);
		}

}
