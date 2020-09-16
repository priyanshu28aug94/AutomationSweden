package com.kommedSweden.administration;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class test_administration_language extends base {
generic_library gl = new generic_library(driver);

	@Test
	public void administration_2() throws InterruptedException, IOException {
		administration_language al=new administration_language(driver);
		gl.action_mouseover(al.administration());
		gl.click(al.language());
		//gl.click(al.text_id());
		String text_id = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_language, "text_id");
		gl.sendKeys(al.text_id(), text_id);
		gl.click(al.search());
		String actual=gl.get_text(al.admin_language_text());
		String expected_text=generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_language, "expected_text");
		gl.assert_method(actual, expected_text);
}
	
}
