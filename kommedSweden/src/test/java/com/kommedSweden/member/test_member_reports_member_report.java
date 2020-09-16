package com.kommedSweden.member;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.member.member_reports_member_report;

public class test_member_reports_member_report extends base {
	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"})
	public void member_16() throws IOException, InterruptedException   { 
		member_reports_member_report rmr= new member_reports_member_report(driver);
		System.out.println("hello");
		gl.action_mouseover(rmr.member());
		gl.action_mouseover(rmr.report());
		gl.click(rmr.member_report());
		gl.click(rmr.member_report_send()); 
		gl.assert_true_method(gl.is_file_downloaded_ext(gl.download_file_path, "xlsx"));
}
}
