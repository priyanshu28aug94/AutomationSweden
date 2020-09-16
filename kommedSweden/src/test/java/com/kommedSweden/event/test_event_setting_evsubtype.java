package com.kommedSweden.event;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class test_event_setting_evsubtype extends base {
generic_library gl = new generic_library(driver);
	
	@Test
	public void eventsetting_06() throws InterruptedException, IOException {
		event_setting_evsubtype esev= new event_setting_evsubtype(driver);
		gl.action_mouseover(esev.event());
		gl.action_mouseover(esev.event_settings());
		gl.click(esev.event_subtype());
		gl.click(esev.ev_undertype());
		String evsubtype = generic_library.access_properties_file(properties_file_path_event.external_input_event_setting_evsubtype, "evsubtype");
		gl.sendKeys(esev.ev_undertype(), evsubtype);
		gl.click(esev.ev_save());
		String actual=gl.get_last_element(esev.ev_subtype_list());
		gl.assert_method(actual, evsubtype);
		
}
}
