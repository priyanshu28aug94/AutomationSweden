package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_preferences_commitment;

public class test_person_company_preferences_commitment extends base {
	
generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
	public void person_company_046() throws IOException, InterruptedException   {
		person_company_preferences_commitment pcp = new person_company_preferences_commitment(driver);
		String external_input_commitment_input_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_commitment, "external_input_commitment_input_text");
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_preferences());
		gl.click(pcp.person_company_preferences_commitment_xpath());
		gl.sendKeys(pcp.person_company_preferences_commitment_textinput(), external_input_commitment_input_text);
		gl.click(pcp.person_company_preferences_commitment_savebutton());
		String person_company_perferences_commitment_input_text=gl.get_last_element(pcp.person_company_preferences_commitment_typelist());
		gl.assert_method(person_company_perferences_commitment_input_text, external_input_commitment_input_text);
	}
	
	@Test(groups= {"sanity"})
	public void person_company_047() throws IOException, InterruptedException   {
		person_company_preferences_commitment pcp = new person_company_preferences_commitment(driver);
		String external_input_commitment_1stelement_editbutton = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_commitment, "external_input_commitment_1stelement_editbutton");
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_preferences());
		gl.click(pcp.person_company_preferences_commitment_xpath());
		gl.click(pcp.person_company_preferences_commitment_1stelement_editbutton());
		gl.get_window_handle(1);
		gl.sendKeys(pcp.person_company_preferences_commitment_edit_textinput(), external_input_commitment_1stelement_editbutton);
		gl.click(pcp.person_company_preferences_commitment_edit_savebutton());
		gl.get_window_handle(0);
		String get_edited_element_text = gl.get_text(pcp.person_company_preferences_commitment_1stelement());
		gl.assert_method(get_edited_element_text, external_input_commitment_1stelement_editbutton);
	}
	
	    @Test(groups= {"sanity"})
		public void person_company_048() throws IOException, InterruptedException   {
	    	person_company_preferences_commitment pcp = new person_company_preferences_commitment(driver);
	    	String external_input_commitment_disable_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_commitment, "external_input_commitment_disable_image");
	    	String external_input_commitment_active_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_commitment, "external_input_commitment_active_image");
			gl.action_mouseover(pcp.person_company());
			gl.action_mouseover(pcp.person_company_preferences());
			gl.click(pcp.person_company_preferences_commitment_xpath());
			String get_edited_element_text_beforeclick = pcp.person_company_preferences_commitment_1stelement_image().getAttribute("title");
			if (get_edited_element_text_beforeclick.equals(external_input_commitment_disable_image)) {
				gl.click(pcp.person_company_preferences_commitment_1stelement_image());
				String get_edited_element_text_afterclick = pcp.person_company_preferences_commitment_1stelement_image().getAttribute("title");
				gl.assert_method(get_edited_element_text_afterclick, external_input_commitment_active_image);
			}else {
				gl.click(pcp.person_company_preferences_commitment_1stelement_image());
				String get_edited_element_text_afterclick = pcp.person_company_preferences_commitment_1stelement_image().getAttribute("title");
				gl.assert_method(get_edited_element_text_afterclick, external_input_commitment_disable_image);
			}
		}



}
