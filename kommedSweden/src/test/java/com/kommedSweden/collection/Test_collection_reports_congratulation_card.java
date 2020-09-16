package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_reports_congratulation_card extends base {
	generic_library gl = new generic_library(driver);
	    @Test(groups= {"sanity"})
		public void collection_055() throws IOException, InterruptedException   {
			collection_reports_congratulation_card crc = new collection_reports_congratulation_card(driver);
			gl.action_mouseover(crc.collection());		
			gl.action_mouseover(crc.collection_reports());		
			gl.click(crc.collection_reports_congratulation_card());
			String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_reports_congratulation_card, "expected_title");
			String title_text = gl.get_text(crc.collection_reports_congratulation_card_title());
			gl.assert_method(title_text, expected_title);
		}

}
