package com.kommedSweden.member;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.member.member_settings_mission;

public class test_member_settings_mission extends base {
	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"})
	public void member_21() throws IOException, InterruptedException   {
		member_settings_mission msm= new member_settings_mission(driver);
		System.out.println("hello");
		gl.action_mouseover(msm.member());
		gl.action_mouseover(msm.settings());
		gl.click(msm.mission());
		gl.click(msm.new_mission());
		String new_mission = generic_library.access_properties_file(properties_file_path_member.external_input_member_settings_mission, "new_mission");
		gl.sendKeys(msm.new_mission(), new_mission);
		gl.click(msm.save_mission());
		String actual=gl.get_last_element(msm.mission_type_list());
		gl.assert_method(actual, new_mission);
	}
	
}
