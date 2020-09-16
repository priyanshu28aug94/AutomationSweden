package com.kommedSweden.member;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.member.member_reports_status_report;

public class test_member_reports_status_report extends base {
	generic_library gl = new generic_library(driver);
//	@Test(groups= {"sanity"})
//	public void member_14() throws IOException, InterruptedException   {
//		member_reports_status_report rsr= new member_reports_status_report(driver);
//		System.out.println("hello");
//		gl.action_mouseover(rsr.member());
//		gl.action_mouseover(rsr.report());
//		gl.click(rsr.status_report());
//		gl.click(rsr.start_date());
//		Thread.sleep(2000);
//		String start_date = generic_library.access_properties_file(properties_file_path_member.external_input_member_reports_status_report, "start_date");
//		gl.sendKeys(rsr.start_date(), start_date);
//		gl.click(rsr.end_date());
//		Thread.sleep(2000);
//		String end_date = generic_library.access_properties_file(properties_file_path_member.external_input_member_reports_status_report, "end_date");
//		gl.sendKeys(rsr.end_date(), end_date);
//		gl.click(rsr.save_statusreport());
//		String actual=gl.get_text(rsr.status_report_title());
//		String expected=generic_library.access_properties_file(properties_file_path_member.external_input_member_reports_status_report, "status_report_title_text");
//		gl.assert_method(actual, expected);
//}
}
