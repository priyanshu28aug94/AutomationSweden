package com.kommedSweden.member;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.member.member_settings_missionstart;

public class test_member_settings_missionstart extends base {
	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"})
	public void member_22() throws IOException, InterruptedException   {
		member_settings_missionstart msms=new member_settings_missionstart(driver);
		System.out.println("hello");
		gl.action_mouseover(msms.member());
		gl.action_mouseover(msms.settings());
		gl.click(msms.start_mission());
		gl.click(msms.new_occasion());
		String mission_start = generic_library.access_properties_file(properties_file_path_member.external_input_member_settings_missionstart, "mission_start");
		gl.sendKeys(msms.new_occasion(), mission_start);
		gl.click(msms.save_occasion());
		String actual=gl.get_text(msms.new_mission_title());
		String expected=generic_library.access_properties_file(properties_file_path_member.external_input_member_settings_missionstart, "mission_start_title_text");
		gl.assert_method(actual, expected);
		
}
	
}
