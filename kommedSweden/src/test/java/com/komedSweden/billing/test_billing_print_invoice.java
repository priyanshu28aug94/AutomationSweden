package com.komedSweden.billing;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.billing.billing;
import com.kommedSweden.billing.billing_print_invoice;

public class test_billing_print_invoice extends base {
	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"})
	public void Billing_003() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		properties_file_path_billing pfpb = new properties_file_path_billing();
		billing_print_invoice bpi = new billing_print_invoice(driver); 
		gl.action_mouseover(billing.billing());
		gl.click(bpi.billing_print_invoice());
		String actualURL = gl.get_url();
		String expectedURL = gl.access_properties_file(pfpb.external_input_billing_print_invoice, "billing_print_invoice_expected_pageURL");
		gl.assert_method(actualURL, expectedURL);
		//done
	}
	
}

