package com.kommedSweden;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.kommedSweden.billing.billing_templates_invoice_template;

public class test_billing_templates_invoice_templates extends base{
	generic_library gl = new generic_library(driver);
	
	//@Test
	public void templateinvoice() throws InterruptedException, IOException {
		billing_templates_invoice_template btit = new billing_templates_invoice_template(driver);
		gl.action_mouseover(btit.billing());
		gl.action_mouseover(btit.billing_templates());
		gl.click(btit.billing_templates_invoice_templates());
		gl.sendKeys(btit.billing_templates_invoice_templates_name(), "enter any name");
		System.out.println(gl.get_last_element(btit.get_list_of_element()));
	}
	
	//@Test
	public void billing_001() throws InterruptedException, IOException {
		billing_templates_invoice_template btit = new billing_templates_invoice_template(driver);
		gl.action_mouseover(btit.billing());
		gl.verify_mouse_hover_dropdown_text(btit.mouseover_list_on_billing_module(), "Create invoices");		
	}
	
	@Test
	public void billing_002() throws InterruptedException, IOException {
		billing_templates_invoice_template btit = new billing_templates_invoice_template(driver);
		gl.action_mouseover(btit.billing());
		
	}
}
