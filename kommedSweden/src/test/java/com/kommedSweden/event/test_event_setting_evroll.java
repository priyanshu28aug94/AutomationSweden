package com.kommedSweden.event;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class test_event_setting_evroll extends base {
generic_library gl = new generic_library(driver);
	
	@Test
	public void eventsetting_07() throws InterruptedException, IOException {
		event_setting_evroll ese=new event_setting_evroll(driver);
		gl.action_mouseover(ese.event());
		gl.action_mouseover(ese.event_settings());
		gl.click(ese.ev_roll());
		gl.click(ese.new_roll());
		String evroll = generic_library.access_properties_file(properties_file_path_event.external_input_event_setting_evroll, "evroll");
		gl.sendKeys(ese.new_roll(), evroll );
		gl.click(ese.roll_save());
		String actual=gl.get_last_element(ese.ev_roll_list_type());
		gl.assert_method(actual, evroll);
}
}
