package com.kommedSweden.member;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.member.member_reports_membership_stat_year;

public class test_member_reports_membership_stat_year  extends base {
	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"})
	public void member_18() throws IOException, InterruptedException   { 
		member_reports_membership_stat_year msy=new member_reports_membership_stat_year(driver);
		System.out.println("hello");
		gl.action_mouseover(msy.member());
		gl.action_mouseover(msy.report());
		gl.click(msy.member_state_year());
		gl.assert_true_method(gl.is_file_downloaded_ext(gl.download_file_path, "xlsx"));
}
}
