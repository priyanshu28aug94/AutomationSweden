package com.kommedSweden.administration;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class test_administration_menu_setting extends base {
	generic_library gl = new generic_library(driver);

	@Test
	public void administration_32() throws InterruptedException, IOException {
		administration_menu_setting ams=new administration_menu_setting(driver);
		gl.action_mouseover(ams.administration());
		gl.action_mouseover(ams.kommed());
		gl.click(ams.kommed_nemu_setting());
		String actual=gl.get_text(ams.kommed_menu_setting_text());
		String  expected_menu_setting_title = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_menu_setting, "expected_menu_setting_title");
		gl.assert_method(actual, expected_menu_setting_title);
		
}
	@Test
	public void administration_37() throws InterruptedException, IOException {
		administration_menu_setting ams=new administration_menu_setting(driver);
		gl.action_mouseover(ams.administration());
		gl.action_mouseover(ams.kommed());
		gl.click(ams.kommed_daublekey());
		Thread.sleep(2000);
		gl.select_by_value(ams.daublekey_type(), "P");
		Thread.sleep(2000);
		gl.select_by_value(ams.daublekey_type(), "P");
		gl.click(ams.daublekey_submit());
		String actual=gl.get_text(ams.daublekey_title_text());
		String  expected_daublekey_title = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_menu_setting, "expected_daublekey_title");
		gl.assert_method(actual, expected_daublekey_title);
	}
}
