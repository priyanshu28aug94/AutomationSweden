package com.komedSweden.billing;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.billing.billing;
import com.kommedSweden.billing.billing_templates_invoice_template;

public class test_billing extends base {

	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"})
	public void billing_001() throws InterruptedException, IOException {
		billing_templates_invoice_template btit = new billing_templates_invoice_template(driver);
		gl.action_mouseover(btit.billing());
		String expected = "CREATE INVOICES";
		gl.verify_mouse_hover_dropdown_text(btit.mouseover_list_on_billing_module(), expected);	
		//done
	}
	
	@Test(groups= {"sanity"})
	public void billing_002() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		gl.action_mouseover(billing.billing());
		gl.click(billing.billing());
		String actual = gl.get_text(billing.ocr_string_text());
		String expected = gl.access_properties_file(properties_file_path_billing.external_input_billing, "ocr_text");
		System.out.println(expected);
		gl.assert_method(actual, expected);
		//done
	}
	
	@Test(groups= {"sanity"})
	public void billing_0010() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		billing_templates_invoice_template btit = new billing_templates_invoice_template(driver);
		properties_file_path_billing pfpb = new properties_file_path_billing();
		gl.action_mouseover(btit.billing());
		gl.click(btit.billing());
		String actualURL = gl.get_url();
		//gl.sendKeys(billing.ocr_string_text_box(), gl.access_properties_file(properties_file_path_billing.external_input_billing, "ocr_text_box"));
		String expectedURL = gl.access_properties_file(pfpb.external_input_billing, "billing_pageURL") ;
		gl.assert_method(actualURL, expectedURL);
		//done
	}
	
	
}
