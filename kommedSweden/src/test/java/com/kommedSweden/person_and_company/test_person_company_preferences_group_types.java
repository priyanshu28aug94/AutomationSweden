package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_preferences_group_types;

public class test_person_company_preferences_group_types extends base {
	
generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
	public void person_company_051() throws IOException, InterruptedException   {
		person_company_preferences_group_types pcp = new person_company_preferences_group_types(driver);
		String external_input_group_types_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_group_types, "external_input_group_types_text");
		String input_text_with_dateandtime= external_input_group_types_text+gl.gettingDateAndTime();
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_preferences());
		gl.click(pcp.person_company_preferences_group_types_xpath());
		gl.sendKeys(pcp.person_company_preferences_group_types_textinput(), input_text_with_dateandtime);
		gl.click(pcp.person_company_preferences_group_types_savebutton());
		String person_company_perferences_group_types_input_text=gl.FindTheRequiredStringFromAList(pcp.person_company_preferences_group_types_typelist(),input_text_with_dateandtime);
		gl.assert_method(person_company_perferences_group_types_input_text, input_text_with_dateandtime);
	}
	
	@Test(groups= {"sanity"})
	public void person_company_052() throws IOException, InterruptedException   {
		person_company_preferences_group_types pcp = new person_company_preferences_group_types(driver);
		String external_input_group_types_edit_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_group_types, "external_input_group_types_edit_text");
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_preferences());
		gl.click(pcp.person_company_preferences_group_types_xpath());
		gl.click(pcp.person_company_preferences_group_types_1stelement_editbutton());
		gl.get_window_handle(1);
		gl.sendKeys(pcp.person_company_preferences_group_types_edit_textinput(), external_input_group_types_edit_text);
		gl.click(pcp.person_company_preferences_group_types_edit_savebutton());
		gl.get_window_handle(0);
		String get_edited_element_text = gl.get_text(pcp.person_company_preferences_group_types_1stelement());
		gl.assert_method(get_edited_element_text, external_input_group_types_edit_text);
	}
	
	   @Test(groups= {"sanity"})
		public void person_company_053() throws IOException, InterruptedException   {
			person_company_preferences_group_types pcp = new person_company_preferences_group_types(driver);
			String external_input_group_types_disable_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_group_types, "external_input_group_types_disable_image");
			String external_input_group_types_active_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_group_types, "external_input_group_types_active_image");
			gl.action_mouseover(pcp.person_company());
			gl.action_mouseover(pcp.person_company_preferences());
			gl.click(pcp.person_company_preferences_group_types_xpath());
			String get_edited_element_text_beforeclick = pcp.person_company_preferences_group_types_1stelement_image().getAttribute("title");
			if (get_edited_element_text_beforeclick.equals(external_input_group_types_disable_image)) {
				gl.click(pcp.person_company_preferences_group_types_1stelement_image());
				String get_edited_element_text_afterclick = pcp.person_company_preferences_group_types_1stelement_image().getAttribute("title");
				gl.assert_method(get_edited_element_text_afterclick, external_input_group_types_active_image);
			}else {
				gl.click(pcp.person_company_preferences_group_types_1stelement_image());
				String get_edited_element_text_afterclick = pcp.person_company_preferences_group_types_1stelement_image().getAttribute("title");
				gl.assert_method(get_edited_element_text_afterclick, external_input_group_types_disable_image);
			}
		}


}
