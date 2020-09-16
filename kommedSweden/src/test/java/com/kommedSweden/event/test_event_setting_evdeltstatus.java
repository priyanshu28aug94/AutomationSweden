package com.kommedSweden.event;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.event.event_setting_evdeltstatus;


public class test_event_setting_evdeltstatus extends base {
generic_library gl = new generic_library(driver);
	
	@Test
	public void eventsetting_04() throws InterruptedException, IOException {
		event_setting_evdeltstatus esev= new event_setting_evdeltstatus(driver);
		gl.action_mouseover(esev.event());
		gl.action_mouseover(esev.event_settings());
		gl.click(esev.event_deltstatus());
		gl.click(esev.new_status());
		String evdeltstatus = generic_library.access_properties_file(properties_file_path_event.external_input_event_setting_evdeltstatus, "evdeltstatus");
		gl.sendKeys(esev.new_status(), evdeltstatus);
		//gl.click_checkbox(esev.click_checkbox());
		gl.click(esev.save());
		String actual=gl.get_last_element(esev.event_delt_status_list());
		gl.assert_method(actual, evdeltstatus);
		
		
		
}
}
