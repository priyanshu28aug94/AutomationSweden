package com.komedSweden.billing;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.billing.billing;
import com.kommedSweden.billing.billing_search_invoicebundle;

public class test_billing_search_invoicebundle extends base {
	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"})
	public void Billing_004() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		billing_search_invoicebundle bsi = new billing_search_invoicebundle(driver);
		properties_file_path_billing pfpb = new properties_file_path_billing();
		gl.action_mouseover(billing.billing());
		gl.click(bsi.billing_search_invoice_bundle());
		String actualURL = gl.get_url();
		String expectedURL = gl.access_properties_file(pfpb.external_input_billing_search_invoicebundle, "billing_search_invoicebundle_pageURL");
		gl.assert_method(actualURL, expectedURL);
		//done
	}
}
