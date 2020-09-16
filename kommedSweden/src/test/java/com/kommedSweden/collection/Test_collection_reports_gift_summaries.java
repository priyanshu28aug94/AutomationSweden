package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_reports_gift_summaries extends base {
	generic_library gl = new generic_library(driver);
	    @Test(groups= {"sanity"})
		public void collection_052() throws IOException, InterruptedException   {
			collection_reports_gift_summaries crg = new collection_reports_gift_summaries(driver);
			gl.action_mouseover(crg.collection());		
			gl.action_mouseover(crg.collection_reports());		
			gl.click(crg.collection_reports_gift_summaries());
			String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_reports_gift_summaries, "expected_title");

			String title_text = gl.get_text(crg.collection_reports_gift_summaries_title());
			gl.assert_method(title_text, expected_title);
		}

}
