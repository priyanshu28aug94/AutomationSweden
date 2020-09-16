package com.komedSweden.billing;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.billing.billing;
import com.kommedSweden.billing.billing_create_invoice;
import com.kommedSweden.billing.billing_templates_invoice_template;

public class test_billing_create_invoice extends base {
	//online support is very less with netbeans
	//its difficult to change version of java and related plugins 
	//small error auto solving suggestion are not in netbeans
	generic_library gl = new generic_library(driver);

	@Test(groups= {"sanity"})
	public void billing_012() throws InterruptedException, IOException {
		billing_templates_invoice_template btit = new billing_templates_invoice_template(driver);
		billing_create_invoice bci = new billing_create_invoice(driver);
		properties_file_path_billing pfpb = new properties_file_path_billing();
		gl.action_mouseover(btit.billing());
		gl.click(bci.billing_create_invoice());
		String actualURL = gl.get_url();
		String expectedURL = gl.access_properties_file(pfpb.external_input_billing_create_invoice, "billing_create_invoice_pageURL");
		gl.assert_method(actualURL, expectedURL);
		//done
	}	
}
