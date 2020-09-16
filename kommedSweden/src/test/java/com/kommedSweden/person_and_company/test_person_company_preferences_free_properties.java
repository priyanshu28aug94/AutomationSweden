package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_preferences_free_properties;
import com.kommedSweden.persons_company.person_company_preferences_properties;

public class test_person_company_preferences_free_properties extends base {
	
	generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
	public void preson_company_054() throws IOException, InterruptedException   {
		person_company_preferences_free_properties pcp = new person_company_preferences_free_properties(driver);
		String external_input_free_properties_person_type_dropdown = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_free_properties, "external_input_free_properties_person_type_dropdown");
		String external_input_free_properties_person_module_dropdown = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_free_properties, "external_input_free_properties_person_module_dropdown");
		String external_input_free_properties_input_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_free_properties, "external_input_email_report_title");
		String input_text_with_dateandtime= external_input_free_properties_input_text+gl.gettingDateAndTime();
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_preferences());
		gl.click(pcp.person_company_preferences_free_properties_xpath());
		gl.sendKeys(pcp.person_company_preferences_free_properties_textinput(), input_text_with_dateandtime);
		gl.select_by_value(pcp.person_company_preferences_free_properties_type_dropdown(), external_input_free_properties_person_type_dropdown);
		gl.select_by_value(pcp.person_company_preferences_free_properties_module_dropdown(), external_input_free_properties_person_module_dropdown);
		gl.click(pcp.person_company_preferences_free_properties_save_button());
		String person_company_perferences_relationship_input_text=gl.FindTheRequiredStringFromAList(pcp.person_company_preferences_free_properties_typelist(),input_text_with_dateandtime);
		gl.assert_method(person_company_perferences_relationship_input_text, input_text_with_dateandtime);
	}
	
	@Test(groups= {"sanity"})
	public void preson_company_055() throws IOException, InterruptedException   {
		person_company_preferences_free_properties pcp = new person_company_preferences_free_properties(driver);
		String external_input_free_properties_person_type_dropdown = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_free_properties, "external_input_free_properties_person_type_dropdown");
		String external_input_free_properties_Gvoavtal_module_dropdown = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_free_properties, "external_input_free_properties_Gvoavtal_module_dropdown");
		String external_input_free_properties_input_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_free_properties, "external_input_email_report_title");
		String input_text_with_dateandtime= external_input_free_properties_input_text+gl.gettingDateAndTime();
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_preferences());
		gl.click(pcp.person_company_preferences_free_properties_xpath());
		gl.sendKeys(pcp.person_company_preferences_free_properties_textinput(), input_text_with_dateandtime);
		gl.select_by_value(pcp.person_company_preferences_free_properties_type_dropdown(), external_input_free_properties_person_type_dropdown);
		gl.select_by_value(pcp.person_company_preferences_free_properties_module_dropdown(), external_input_free_properties_Gvoavtal_module_dropdown);
		gl.click(pcp.person_company_preferences_free_properties_save_button());
		String person_company_perferences_relationship_input_text=gl.FindTheRequiredStringFromAList(pcp.person_company_preferences_free_properties_typelist(),input_text_with_dateandtime);
		gl.assert_method(person_company_perferences_relationship_input_text, input_text_with_dateandtime);
	}
	
	@Test(groups= {"sanity"})
	public void preson_company_056() throws IOException, InterruptedException   {
		person_company_preferences_free_properties pcp = new person_company_preferences_free_properties(driver);
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_preferences());
		gl.click(pcp.person_company_preferences_free_properties_xpath());
		String get_1st_element_name_beforeclick = gl.get_text(pcp.person_company_preferences_free_properties_1stelement());
		Thread.sleep(1000);
		gl.click(pcp.person_company_preferences_free_properties_1stelement_down_green_arrow());
		String get_2nd_element_name_afterclick = gl.get_text(pcp.person_company_preferences_free_properties_2ndelement());
		gl.assert_method(" "+get_1st_element_name_beforeclick, get_2nd_element_name_afterclick);
		gl.click(pcp.person_company_preferences_free_properties_2ndelement_up_green_arrow());
		String get_1st_element_name_afterclick = gl.get_text(pcp.person_company_preferences_free_properties_1stelement());
		gl.assert_method(get_2nd_element_name_afterclick, " "+get_1st_element_name_afterclick);
			}
	
	@Test(groups= {"sanity"})
	public void person_company_057() throws IOException, InterruptedException   {
		person_company_preferences_free_properties pcp = new person_company_preferences_free_properties(driver);
		String external_input_1stelement_edit_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_free_properties, "external_input_1stelement_edit_text");
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_preferences());
		gl.click(pcp.person_company_preferences_free_properties_xpath());
		gl.click(pcp.person_company_preferences_free_properties_1stelement_editbutton());
		gl.get_window_handle(1);
		gl.sendKeys(pcp.person_company_preferences_free_properties_edit_textinput(), external_input_1stelement_edit_text);
		gl.click(pcp.person_company_preferences_free_properties_edit_savebutton());
		gl.get_window_handle(0);
		String get_edited_element_text = gl.get_text(pcp.person_company_preferences_free_properties_1stelement());
		gl.assert_method(get_edited_element_text, "  "+external_input_1stelement_edit_text);
	}
	
	    @Test(groups= {"sanity"})
		public void person_company_058() throws IOException, InterruptedException   {
			person_company_preferences_free_properties pcp = new person_company_preferences_free_properties(driver);
			String external_input_free_properties_disable_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_free_properties, "external_input_free_properties_disable_image");
			String external_input_free_properties_active_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_free_properties, "external_input_free_properties_active_image");
			gl.action_mouseover(pcp.person_company());
			gl.action_mouseover(pcp.person_company_preferences());
			gl.click(pcp.person_company_preferences_free_properties_xpath());
			String get_edited_element_text_beforeclick = pcp.person_company_preferences_free_properties_1stelement_image().getAttribute("title");
			if (get_edited_element_text_beforeclick.equals(external_input_free_properties_disable_image)) {
				gl.click(pcp.person_company_preferences_free_properties_1stelement_image());
				String get_edited_element_text_afterclick = pcp.person_company_preferences_free_properties_1stelement_image().getAttribute("title");
				gl.assert_method(get_edited_element_text_afterclick, external_input_free_properties_active_image);
			}else {
				gl.click(pcp.person_company_preferences_free_properties_1stelement_image());
				String get_edited_element_text_afterclick = pcp.person_company_preferences_free_properties_1stelement_image().getAttribute("title");
				gl.assert_method(get_edited_element_text_afterclick, external_input_free_properties_disable_image);
			}
		}

}
