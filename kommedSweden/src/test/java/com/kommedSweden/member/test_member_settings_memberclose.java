package com.kommedSweden.member;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.member.member_settings_memberclose;

public class test_member_settings_memberclose extends base {
	generic_library gl = new generic_library(driver);
//	@Test(groups= {"sanity"})
//public void member_24() throws IOException, InterruptedException   {
//		member_settings_memberclose msms =new member_settings_memberclose(driver);
//		System.out.println("hello");
//		gl.action_mouseover(msms.member());
//		gl.action_mouseover(msms.settings());
//		gl.click(msms.close_mission());
//		gl.click(msms.new_occasion());
//		String new_occasion = generic_library.access_properties_file(properties_file_path_member.external_input_member_settings_memberclose, "new_occasion");
//		gl.sendKeys(msms.new_occasion(), new_occasion);
//		gl.click(msms.save());
//		String actual=gl.get_last_element(msms.close_mission_list_type());
//		gl.assert_method(actual, new_occasion);
//}
}
