package com.kommedSweden.event;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_event;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.billing.billing_templates_invoice_template;
import com.kommedSweden.event.event_setting_evstatus;

public class test_event_setting_evstatus extends base {
generic_library gl = new generic_library(driver);
	
	@Test
	public void eventsetting_03() throws InterruptedException, IOException {
		event_setting_evstatus esv= new event_setting_evstatus(driver);
		gl.action_mouseover(esv.event());
		gl.action_mouseover(esv.event_settings());
		gl.click(esv.ev_status());
		gl.click(esv.status());
		String evstatus = generic_library.access_properties_file(properties_file_path_event.external_input_event_setting_evstatus, "evstatus");
		gl.sendKeys(esv.status(), evstatus);
		gl.click_checkbox(esv.checkbox());
		gl.click(esv.save_status());
		String actual=gl.get_last_element(esv.ev_status_list());
		gl.assert_method(actual, evstatus);
		
	}
}
