package com.kommedSweden.event;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class test_event_reports_competitor extends base  {
generic_library gl = new generic_library(driver);
	
	@Test
	public void eventsetting_10() throws InterruptedException, IOException {
		event_reports_competitor erc= new event_reports_competitor(driver);
		gl.action_mouseover(erc.event());
		gl.action_mouseover(erc.templates());
		gl.click(erc.competitor());
		gl.click(erc.com_save());
		String actual=gl.get_text(erc.event_competition_text());
		String expected_competitor=generic_library.access_properties_file(properties_file_path_event.external_input_event_reports_competitor, "expected_competitor");
		gl.assert_method(actual, expected_competitor);
}
}
