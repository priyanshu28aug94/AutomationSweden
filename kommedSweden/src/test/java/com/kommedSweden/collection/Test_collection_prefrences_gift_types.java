package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_prefrences_gift_types extends base {
	
	generic_library gl = new generic_library(driver);
	    @Test(groups= {"sanity"})
		public void collection_28() throws IOException, InterruptedException   {
			collection_prefrences_gift_types pcn = new collection_prefrences_gift_types(driver);
//			System.out.println("hello");
			String expected_title=generic_library.access_properties_file(properties_file_path_collections.external_input_collection_prefrences_gift_types, "expected_title");

			gl.action_mouseover(pcn.collection());	
			gl.action_mouseover(pcn.collection_prefrences());
			gl.click(pcn.collection_prefrences_gift_type());
			
			String title_text = gl.get_text(pcn.collection_prefrences_gift_types_pagetitle());
			gl.assert_method(title_text, expected_title);
		}
		

}
