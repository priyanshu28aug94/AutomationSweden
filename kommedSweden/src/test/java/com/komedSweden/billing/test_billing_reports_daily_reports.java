package com.komedSweden.billing;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_billing;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.billing.billing;
import com.kommedSweden.billing.billing_reports_daily_reports;
import com.kommedSweden.billing.billing_templates_invoice_template;

public class test_billing_reports_daily_reports extends base{
	generic_library gl = new generic_library(driver);
	//@Test(groups= {"sanity"})
	public void Billing_006() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		billing_reports_daily_reports brdr = new billing_reports_daily_reports(driver);
		gl.action_mouseover(billing.billing());
		gl.action_mouseover(brdr.billing_reports());
		gl.verify_mouse_hover_dropdown_text(brdr.mousehover_list_on_report(), "DAILY REPORT");
		//done
	}
	
	//@Test(groups= {"sanity"})
	public void Billing_009() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		billing_reports_daily_reports brdr = new billing_reports_daily_reports(driver);
		properties_file_path_billing pfpb = new properties_file_path_billing();
		gl.action_mouseover(billing.billing());
		gl.action_mouseover(brdr.billing_reports());
		gl.click(brdr.billing_reports_dailyreport());
		String actualURL = gl.get_url();
		String expectedURL = gl.access_properties_file(pfpb.external_input_billing_report_daily_report, "billing_report_daily_report");
		gl.assert_method(actualURL, expectedURL);
		//done
	}
	
	@Test(groups= {"sanity"})
	public void Billing_017() throws InterruptedException, IOException {
		billing billing = new billing(driver);
		billing_reports_daily_reports brdr = new billing_reports_daily_reports(driver);
		properties_file_path_billing pfpb = new properties_file_path_billing();
		gl.action_mouseover(billing.billing());
		gl.action_mouseover(brdr.billing_reports());
		gl.click(brdr.billing_reports_dailyreport());
		String billing_report_daily_report_date = gl.access_properties_file(pfpb.external_input_billing_report_daily_report, "billing_report_daily_report_date");
		gl.sendKeys(brdr.billing_report_dailyreport_date(), billing_report_daily_report_date);
		gl.click(brdr.billing_report_daily_report_save());
		gl.assert_true_method(gl.is_file_downloaded_ext(gl.download_file_path, "xls"));
	}
}
