package com.kommedSweden.administration;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class test_administration_statistic_reduction extends base {
	generic_library gl = new generic_library(driver);

	@Test
	public void administration_19() throws InterruptedException, IOException {
		administration_statistic_reduction asr= new administration_statistic_reduction(driver);
		gl.action_mouseover(asr.administration());
		gl.action_mouseover(asr.administration_statictis_reduction());
		gl.click(asr.administration_staticstis_reduction_posting_list());
		gl.click(asr.from_date());
		System.out.println("come");
		Thread.sleep(2000);
		String from_date = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_statistic_reduction, "from_date");
		gl.sendKeys(asr.from_date(), from_date);
		gl.click(asr.last_date());
		String last_date = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_statistic_reduction, "last_date");
		gl.sendKeys(asr.last_date(), last_date);
		Thread.sleep(3000);
		gl.click(asr.posting_list_save());
		gl.assert_true_method(gl.is_file_downloaded_ext(gl.download_file_path, "pdf"));
		
}
	@Test
	public void administration_20() throws InterruptedException, IOException {
		administration_statistic_reduction asr= new administration_statistic_reduction(driver);
		gl.action_mouseover(asr.administration());
		gl.action_mouseover(asr.administration_statictis_reduction());
		gl.click(asr.administration_webfile());
		Thread.sleep(2000);
		String getting_last_web_element_befour_upload=gl.get_last_element(asr.ad_web_file_list());
		String getting_last_value_befour_space=gl.trim_string_using_space(getting_last_web_element_befour_upload);
		int s2i = Integer.parseInt(getting_last_value_befour_space);
		int inum = s2i+1;
		String i2s = Integer.toString(inum);
		gl.click(asr.web_file());
		String web_file = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_statistic_reduction, "web_file");
		gl.uploadFile("Resources\\administration\\", "rapport.pdf");
		Thread.sleep(1000);
		gl.click(asr.web_file_save());
		String get_web_file=gl.get_last_element(asr.ad_web_file_list());
		gl.assert_method(get_web_file, i2s+" "+web_file);
		
				
}	

}
