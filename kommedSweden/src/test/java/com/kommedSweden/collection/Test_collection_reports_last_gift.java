package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_reports_last_gift extends base {
	generic_library gl = new generic_library(driver);
	    @Test(groups= {"sanity"})
		public void collection_058() throws IOException, InterruptedException   {
			collection_reports_last_gift crl = new collection_reports_last_gift(driver);
			gl.action_mouseover(crl.collection());		
			gl.action_mouseover(crl.collection_reports());		
			gl.click(crl.collection_reports_last_gift());
			String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_reports_last_gift, "expected_title");
			String title_text = gl.get_text(crl.collection_reports_last_gift_title());
			gl.assert_method(title_text, expected_title);
		}

}
