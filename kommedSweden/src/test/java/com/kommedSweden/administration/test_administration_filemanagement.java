package com.kommedSweden.administration;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class test_administration_filemanagement extends base  {
generic_library gl = new generic_library(driver);
	
	@Test
	public void administration_3() throws InterruptedException, IOException {
		administration_filemanagement af= new administration_filemanagement(driver);
		gl.action_mouseover(af.administration());
		gl.click(af.administration_file_management());
		Thread.sleep(2000);
		gl.click(af.file_upload());
		String adminiatration_file_upload = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_filemanagement, "adminiatration_file_upload");
		gl.uploadFile("Resources\\administration\\", "phpdocs.docx");
		Thread.sleep(2000);
		gl.click(af.file_save());
		String actual=gl.get_text(af.ad_file_mane_text());
		String expe_ad_file_manegement_text = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_filemanagement, "expe_ad_file_manegement_text");
		gl.assert_method(actual, expe_ad_file_manegement_text);
}
	@Test
		public void administration_4() throws InterruptedException, IOException {
			administration_filemanagement af= new administration_filemanagement(driver);
			gl.action_mouseover(af.administration());
			gl.click(af.administration_file_management());
			gl.click(af.download_file());
			gl.assert_true_method(gl.is_file_downloaded_ext(gl.download_file_path, "log"));
			
					
	}
		@Test
			public void administration_5() throws InterruptedException, IOException {
			administration_filemanagement af= new administration_filemanagement(driver);
			gl.action_mouseover(af.administration());
			gl.click(af.administration_file_management());
			Thread.sleep(2000);
			gl.click(af.administration_import());
			String actual=gl.get_url();
			System.out.println(actual);
			String ad_import = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_filemanagement, "ad_import");
			gl.assert_method(actual, ad_import);
			Thread.sleep(3000);
			gl.click(af.import_d2d_file());
			String d2d_file_upload = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_filemanagement, "d2d_file_upload");
			gl.uploadFile("Resources\\administration\\", "phpdocs.docx");
			System.out.println("come");	
			gl.click(af.import_d2d_file_save());
			gl.browser_navigate_backword();
			String actual1=gl.get_text(af.import_d2d_file_text());
			String exp_d2d_file_import_text = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_filemanagement, "exp_d2d_file_import_text");
			gl.assert_method(actual1, exp_d2d_file_import_text);
			}
}
