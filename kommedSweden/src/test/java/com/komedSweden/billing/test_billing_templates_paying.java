package com.komedSweden.billing;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.billing.billing;
import com.kommedSweden.billing.billing_templates_invoice_template;
import com.kommedSweden.billing.billing_templates_paying;

public class test_billing_templates_paying extends base {
	generic_library gl = new generic_library(driver);
	//@Test(groups= {"sanity"})
	public void Billing_008() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		billing_templates_invoice_template btit = new billing_templates_invoice_template(driver);
		billing_templates_paying btp =new billing_templates_paying(driver);
		properties_file_path_billing pfpb = new properties_file_path_billing();
		gl.action_mouseover(billing.billing());
		gl.action_mouseover(btit.billing_templates());
		gl.click(btp.billing_templates_paying());
		String actualURL = gl.get_url();
		String expectedURL = gl.access_properties_file(pfpb.external_input_billing_template_paying, "billing_templates_paying_pageURL");
		gl.assert_method(actualURL, expectedURL);
		//done
	}
	
	@Test(groups= {"sanity"})
	public void Billing_016() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		billing_templates_invoice_template btit = new billing_templates_invoice_template(driver);
		billing_templates_paying btp =new billing_templates_paying(driver);
		properties_file_path_billing pfpb = new properties_file_path_billing();
		gl.action_mouseover(billing.billing());
		gl.action_mouseover(btit.billing_templates());
		gl.click(btp.billing_templates_paying());
		String expected = "kommed "+ gl.gettingDateAndTime();
		gl.sendKeys(btp.billing_template_paying_textbox(), expected);
		gl.click(btp.billing_template_paying_savebutton());
		//String actual = gl.get_last_element(btp.billing_template_paying_listofelement());
		String actual = gl.FindTheRequiredStringFromAList(btp.billing_template_paying_listofelement(),expected);
		gl.assert_method(actual, expected);
		//verification enter name into text box and click on save button
	}
}
