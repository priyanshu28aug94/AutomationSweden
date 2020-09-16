package com.kommedSweden.event;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.event.event_setting_event;



public class test_event_setting_event extends base {
generic_library gl = new generic_library(driver);
	
	@Test
	public void eventsettin_05() throws InterruptedException, IOException {
		event_setting_event ese= new event_setting_event(driver);
		gl.action_mouseover(ese.event());
		gl.action_mouseover(ese.event_settings());
		gl.click(ese.event_sub());
		gl.click(ese.new_event());
		String event = generic_library.access_properties_file(properties_file_path_event.external_input_event_setting_event, "event");
		gl.sendKeys(ese.new_event(), event);
		gl.click(ese.event_save());
		String actual=gl.get_last_element(ese.event_stetting_event_list());
		gl.assert_method(actual, event);
}
}
