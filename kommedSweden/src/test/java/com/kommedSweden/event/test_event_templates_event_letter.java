package com.kommedSweden.event;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class test_event_templates_event_letter extends base {
generic_library gl = new generic_library(driver);
	
	@Test
	public void eventsetting_08() throws InterruptedException, IOException {
		event_templates_event_letter etel= new event_templates_event_letter(driver);
		gl.action_mouseover(etel.event());
		gl.action_mouseover(etel.templates());
		gl.click(etel.event_letter());
		gl.click(etel.create_new_event_letter());
		String event_letter = generic_library.access_properties_file(properties_file_path_event.external_input_event_templates_event_letter, "event_letter");
		gl.sendKeys(etel.create_new_event_letter(), event_letter);
		gl.click(etel.letter_save());
		String actual=gl.get_last_element(etel.event_letter_list_type());
		gl.assert_method(actual, event_letter);
		
				
		
}
}
