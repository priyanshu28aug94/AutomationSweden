package com.komedSweden.billing;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.billing.billing;
import com.kommedSweden.billing.billing_print_invoice;
import com.kommedSweden.billing.billing_templates_invoice_template;

public class test_billing_templates_invoice_template extends base {
	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"})
	public void Billing_005() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		billing_templates_invoice_template btit = new billing_templates_invoice_template(driver);
		gl.action_mouseover(billing.billing());
		gl.action_mouseover(btit.billing_templates());
		String expected = "INVOICE TEMPLATES";
		gl.verify_mouse_hover_dropdown_text(btit.mouseover_list_on_template_module(), expected);
		//done
	}

	@Test(groups= {"sanity"})
	public void Billing_007() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		properties_file_path_billing pfpb = new properties_file_path_billing();
		billing_templates_invoice_template btit = new billing_templates_invoice_template(driver);
		gl.action_mouseover(billing.billing());
		gl.action_mouseover(btit.billing_templates());
		gl.click(btit.billing_templates_invoice_templates());
		String actualURL = gl.get_url();
		String expectedURL = gl.access_properties_file(pfpb.external_input_billing_template_invoice_template, "template_invoice_template_pageURL");
		gl.assert_method(actualURL, expectedURL);
		//done
	}

	@Test(groups= {"sanity"})
	public void Billing_013() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		billing_templates_invoice_template btit = new billing_templates_invoice_template(driver);
		gl.action_mouseover(billing.billing());
		gl.action_mouseover(btit.billing_templates());
		gl.click(btit.billing_templates_invoice_templates());
		String actual = "Kommed"+gl.gettingDateAndTime();
		gl.sendKeys(btit.billing_templates_invoice_templates_name(), actual);
		gl.click(btit.billing_templates_invoice_template_invoices_template_button());
		String expected = gl.get_last_element(btit.get_list_of_element());
		gl.assert_method(actual, expected);
		//done
	}

}
