package com.kommedSweden.member;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.member.member_reports_member_state;

public class test_member_reports_member_state extends base {
	generic_library gl = new generic_library(driver);
    @Test(groups= {"sanity"})
	public void member_10() throws IOException, InterruptedException   {
		member_reports_member_state mes =new member_reports_member_state(driver);
		System.out.println("hello");
		gl.action_mouseover(mes.member());
		gl.action_mouseover(mes.report());
		gl.click(mes.member_State());
		gl.click(mes.member_button());
		gl.assert_true_method(gl.is_file_downloaded_ext(gl.download_file_path, "xlsx"));
	}
    @Test(groups= {"sanity"})
	public void member_11() throws IOException, InterruptedException   {
		member_reports_member_state mes =new member_reports_member_state(driver);
		System.out.println("hello");
		gl.action_mouseover(mes.member());
		gl.action_mouseover(mes.report());
		gl.click(mes.report_organization_report());
		String actual=gl.get_text(mes.organization_report_page_title());
		System.out.println("hh");
		String member_report_organization_report = generic_library.access_properties_file(properties_file_path_member.external_input_member_reports_member_state, "member_report_organization_report");
		gl.assert_method(actual, member_report_organization_report);
	}
}
