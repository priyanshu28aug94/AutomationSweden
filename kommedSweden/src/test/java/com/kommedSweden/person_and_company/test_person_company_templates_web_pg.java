package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_templates_web_pg;

public class test_person_company_templates_web_pg extends base {
	
	generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
	public void preson_company_059() throws IOException, InterruptedException   {
		person_company_templates_web_pg pcp = new person_company_templates_web_pg(driver);
		String external_input_web_pg_input_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_templates_web_pg, "external_input_web_pg_input_text");
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_templates());
		gl.click(pcp.person_company_templates_web_pg());
		gl.sendKeys(pcp.person_company_templates_web_pg_textinput(), external_input_web_pg_input_text);
		gl.click(pcp.person_company_templates_web_pg_savebutton());
		String person_company_templates_web_pg_input_text=gl.get_last_element(pcp.person_company_templates_web_pg_typelist());
		gl.assert_method(person_company_templates_web_pg_input_text, external_input_web_pg_input_text);
	}
	
	@Test(groups= {"sanity"})
	public void preson_company_060() throws IOException, InterruptedException   {
		person_company_templates_web_pg pcp = new person_company_templates_web_pg(driver);
		String external_input_1stelement_edit_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_templates_web_pg, "external_input_1stelement_edit_text");
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_templates());
		gl.click(pcp.person_company_templates_web_pg());
		gl.click(pcp.person_company_templates_web_pg_1stelement_editbutton());
		gl.get_window_handle(1);
		gl.sendKeys(pcp.person_company_templates_web_pg_edit_textinput(), external_input_1stelement_edit_text);
		gl.click(pcp.person_company_templates_web_pg_edit_savebutton());
		gl.get_window_handle(0);
		String get_edited_element_text = gl.get_text(pcp.person_company_templates_web_pg_1stelement());
		gl.assert_method(get_edited_element_text, external_input_1stelement_edit_text);
	}
	
	   @Test(groups= {"sanity"})
		public void preson_company_061() throws IOException, InterruptedException   {
	    	person_company_templates_web_pg pcp = new person_company_templates_web_pg(driver);
	    	String external_input_web_pg_disable_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_templates_web_pg, "external_input_web_pg_disable_image");
	    	String external_input_web_pg_active_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_templates_web_pg, "external_input_web_pg_active_image");
			gl.action_mouseover(pcp.person_company());
			gl.action_mouseover(pcp.person_company_templates());
			gl.click(pcp.person_company_templates_web_pg());
			String get_edited_element_text_beforeclick = pcp.person_company_templates_web_pg_1stelement_image().getAttribute("title");
			if (get_edited_element_text_beforeclick.equals(external_input_web_pg_disable_image)) {
				gl.click(pcp.person_company_templates_web_pg_1stelement_image());
				String get_edited_element_text_afterclick = pcp.person_company_templates_web_pg_1stelement_image().getAttribute("title");
				gl.assert_method(get_edited_element_text_afterclick, external_input_web_pg_active_image);
			}else {
				gl.click(pcp.person_company_templates_web_pg_1stelement_image());
				String get_edited_element_text_afterclick = pcp.person_company_templates_web_pg_1stelement_image().getAttribute("title");
				gl.assert_method(get_edited_element_text_afterclick, external_input_web_pg_disable_image);
			}
		}
	    
	    @Test(groups= {"sanity"})
		public void preson_company_062() throws IOException, InterruptedException   {
			person_company_templates_web_pg pcp = new person_company_templates_web_pg(driver);
			String person_company_upload_files_pdf = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_upload_files, "person_company_upload_files_pdf");
			gl.action_mouseover(pcp.person_company());
			gl.action_mouseover(pcp.person_company_templates());
			gl.click(pcp.person_company_templates_web_pg());
			gl.click(pcp.person_company_templates_web_pg_1stelement());
			gl.click(pcp.person_company_templates_web_pg_1stelement_selectable_value_choose_file());
			gl.uploadFile("Resources\\person_and_company\\", person_company_upload_files_pdf+".pdf");
			gl.click(pcp.person_company_templates_web_pg_1stelement_selectable_value_savebutton());
			String get_file_name = gl.trim_string_using_dot(gl.get_text(pcp.person_company_templates_web_pg_1stelement_selectable_value_uploaded_file_name()));
			gl.assert_method(get_file_name, person_company_upload_files_pdf);
		}

}
