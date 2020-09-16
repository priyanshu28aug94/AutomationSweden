package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class Test_collection_reports_campaign_statistics extends base{
	generic_library gl = new generic_library(driver);
	    @Test(groups= {"sanity"})
		public void collection_059() throws IOException, InterruptedException   {
			collection_reports_campaign_statistics crc = new collection_reports_campaign_statistics(driver);
			gl.action_mouseover(crc.collection());		
			gl.action_mouseover(crc.collection_reports());		
			gl.click(crc.collection_reports_campaign_statistics());
			String expected = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_reports_campaign_statistics, "expected");
			String title_text = gl.get_text(crc.collection_reports_campaign_statistics_title());
			gl.assert_method(title_text, expected);
		}

}
