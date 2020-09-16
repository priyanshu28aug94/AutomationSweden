package com.kommedSweden.member;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.member.member_reports_member_state;
import com.kommedSweden.member.member_reports_parish_statistics;

public class test_member_reports_parish_statistics extends base {
	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"})
	public void member_12() throws IOException, InterruptedException   {
		
		member_reports_parish_statistics sta=new member_reports_parish_statistics(driver);
		System.out.println("hello");
		gl.action_mouseover(sta.member());
		gl.action_mouseover(sta.report());
        gl.click(sta.statiktis());
        gl.click(sta.start_date());
        String start_date = generic_library.access_properties_file(properties_file_path_member.external_input_member_reports_parish_statistics, "start_date");
        gl.sendKeys(sta.start_date(), start_date);
        gl.click(sta.end_date());
        String end_date = generic_library.access_properties_file(properties_file_path_member.external_input_member_reports_parish_statistics, "end_date");
        gl.sendKeys(sta.end_date(), end_date);
        gl.click(sta.send_button());
        gl.assert_true_method(gl.is_file_downloaded_ext(gl.download_file_path, "xls"));

}
}
