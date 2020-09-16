package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_reports_memorial_card extends base {
	generic_library gl = new generic_library(driver);
	    @Test(groups= {"sanity"})
		public void collection_049() throws IOException, InterruptedException   {
			collection_reports_memorial_card crm = new collection_reports_memorial_card(driver);
			gl.action_mouseover(crm.collection());		
			gl.action_mouseover(crm.collection_reports());		
			gl.click(crm.collection_reports_memorial_card());
			String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_reports_memorial_card, "expected_title");
			String title_text = gl.get_text(crm.collection_reports_memorial_card_title());
			gl.assert_method(title_text,expected_title );
		}

}
