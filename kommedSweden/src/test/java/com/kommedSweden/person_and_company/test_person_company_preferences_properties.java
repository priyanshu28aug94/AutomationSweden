package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_preferences_properties;
import com.kommedSweden.persons_company.person_company_preferences_relationship;

public class test_person_company_preferences_properties extends base {
	
	generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
	public void person_company_032() throws IOException, InterruptedException   {
	person_company_preferences_properties pcp = new person_company_preferences_properties(driver);
	String external_input_properties_input_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_properties_input_text");
	String input_text_with_dateandtime= external_input_properties_input_text+gl.gettingDateAndTime();
	gl.action_mouseover(pcp.person_company());
	gl.action_mouseover(pcp.person_company_preferences());
	gl.click(pcp.person_company_preferences_properties_xpath());
	gl.sendKeys(pcp.person_company_preferences_properties_textinput(), input_text_with_dateandtime);
	gl.click(pcp.person_company_preferences_properties_save_button());
	String person_company_perferences_relationship_input_text=gl.FindTheRequiredStringFromAList(pcp.person_company_preferences_properties_typelist(),input_text_with_dateandtime);
	gl.assert_method(person_company_perferences_relationship_input_text, input_text_with_dateandtime);
	}
	
	@Test(groups= {"sanity"})
	public void person_company_033() throws IOException, InterruptedException   {
	person_company_preferences_properties pcp = new person_company_preferences_properties(driver);
	String external_input_properties_commitment_type_dropdown = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_properties_commitment_type_dropdown");
	String external_input_properties_input_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_email_report_title");
	String input_text_with_dateandtime= external_input_properties_input_text+gl.gettingDateAndTime();
	gl.action_mouseover(pcp.person_company());
	gl.action_mouseover(pcp.person_company_preferences());
	gl.click(pcp.person_company_preferences_properties_xpath());
	gl.sendKeys(pcp.person_company_preferences_properties_textinput(), input_text_with_dateandtime);
	gl.select_by_value(pcp.person_company_preferences_properties_type_dropdown(), external_input_properties_commitment_type_dropdown);
	gl.click(pcp.person_company_preferences_properties_save_button());
	String person_company_perferences_relationship_input_text=gl.FindTheRequiredStringFromAList(pcp.person_company_preferences_properties_typelist(),input_text_with_dateandtime);
	gl.assert_method(person_company_perferences_relationship_input_text, input_text_with_dateandtime);
		}
	
	@Test(groups= {"sanity"})
	public void person_company_034() throws IOException, InterruptedException   {
	person_company_preferences_properties pcp = new person_company_preferences_properties(driver);
	String external_input_properties_Gvoavtal_type_dropdown = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_properties_Gvoavtal_type_dropdown");
	String external_input_properties_input_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_email_report_title");
	String input_text_with_dateandtime= external_input_properties_input_text+gl.gettingDateAndTime();
	gl.action_mouseover(pcp.person_company());
	gl.action_mouseover(pcp.person_company_preferences());
	gl.click(pcp.person_company_preferences_properties_xpath());
	gl.sendKeys(pcp.person_company_preferences_properties_textinput(), input_text_with_dateandtime);
	gl.select_by_value(pcp.person_company_preferences_properties_type_dropdown(), external_input_properties_Gvoavtal_type_dropdown);
	gl.click(pcp.person_company_preferences_properties_save_button());
	String person_company_perferences_relationship_input_text=gl.FindTheRequiredStringFromAList(pcp.person_company_preferences_properties_typelist(),input_text_with_dateandtime);
	gl.assert_method(person_company_perferences_relationship_input_text, input_text_with_dateandtime);
		}
	
	@Test(groups= {"sanity"})
	public void preson_company_035() throws IOException, InterruptedException   {
	person_company_preferences_properties pcp = new person_company_preferences_properties(driver);
	gl.action_mouseover(pcp.person_company());
	gl.action_mouseover(pcp.person_company_preferences());
	gl.click(pcp.person_company_preferences_properties_xpath());
	String get_1st_element_name_beforeclick = gl.get_text(pcp.person_company_preferences_properties_1stelement());
	gl.click(pcp.person_company_preferences_properties_1stelement_down_green_arrow());
	String get_2nd_element_name_afterclick = gl.get_text(pcp.person_company_preferences_properties_2ndelement());
	gl.assert_method(get_1st_element_name_beforeclick, get_2nd_element_name_afterclick);
	gl.click(pcp.person_company_preferences_properties_2ndelement_up_green_arrow());
	String get_1st_element_name_afterclick = gl.get_text(pcp.person_company_preferences_properties_1stelement());
	gl.assert_method(get_2nd_element_name_afterclick, get_1st_element_name_afterclick);
				}
	
	@Test(groups= {"sanity"})
	public void preson_company_036() throws IOException, InterruptedException   {
	person_company_preferences_properties pcp = new person_company_preferences_properties(driver);
	String external_input_1stelement_edit_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_1stelement_edit_text");
	gl.action_mouseover(pcp.person_company());
	gl.action_mouseover(pcp.person_company_preferences());
	gl.click(pcp.person_company_preferences_properties_xpath());
	gl.click(pcp.person_company_preferences_properties_1stelement_editbutton());
	gl.get_window_handle(1);
	gl.sendKeys(pcp.person_company_preferences_properties_edit_textinput(), external_input_1stelement_edit_text);
	gl.click(pcp.person_company_preferences_properties_edit_savebutton());
	gl.get_window_handle(0);
	String get_edited_element_text = gl.get_text(pcp.person_company_preferences_properties_1stelement());
	gl.assert_method(get_edited_element_text, external_input_1stelement_edit_text);
			}
	
	@Test(groups= {"sanity"})
	public void preson_company_037() throws IOException, InterruptedException   {
	person_company_preferences_properties pcp = new person_company_preferences_properties(driver);
	String external_input_properties_disable_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_properties_disable_image");
	String external_input_properties_active_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_properties_active_image");
	gl.action_mouseover(pcp.person_company());
	gl.action_mouseover(pcp.person_company_preferences());
	gl.click(pcp.person_company_preferences_properties_xpath());
	String get_edited_element_text_beforeclick = pcp.person_company_preferences_properties_1stelement_image().getAttribute("title");
	if (get_edited_element_text_beforeclick.equals(external_input_properties_disable_image)) {
		gl.click(pcp.person_company_preferences_properties_1stelement_image());
		String get_edited_element_text_afterclick = pcp.person_company_preferences_properties_1stelement_image().getAttribute("title");
		gl.assert_method(get_edited_element_text_afterclick, external_input_properties_active_image);
	    }else {
		gl.click(pcp.person_company_preferences_properties_1stelement_image());
		String get_edited_element_text_afterclick = pcp.person_company_preferences_properties_1stelement_image().getAttribute("title");
		gl.assert_method(get_edited_element_text_afterclick, external_input_properties_disable_image);
	}
}
	 
	@Test(groups= {"sanity"})
	public void preson_company_038() throws IOException, InterruptedException   {
	person_company_preferences_properties pcp = new person_company_preferences_properties(driver);
	String external_input_1stelement_selectable_values_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_1stelement_selectable_values_text");
	String input_text_with_dateandtime= external_input_1stelement_selectable_values_text+gl.gettingDateAndTime();
	gl.action_mouseover(pcp.person_company());
	gl.action_mouseover(pcp.person_company_preferences());
	gl.click(pcp.person_company_preferences_properties_xpath());
	gl.click(pcp.person_company_preferences_properties_1stelement());
	gl.sendKeys(pcp.person_company_preferences_properties_1stelement_selectable_values_textbox(), input_text_with_dateandtime);
	gl.click(pcp.person_company_preferences_properties_1stelement_selectable_values_savebutton());
	String person_company_perferences_relationship_input_text=gl.FindTheRequiredStringFromAList(pcp.person_company_preferences_properties_selectable_values_typelist(),input_text_with_dateandtime);
	gl.assert_method(person_company_perferences_relationship_input_text, input_text_with_dateandtime);
		}
		
	@Test(groups= {"sanity"})
	public void preson_company_039() throws IOException, InterruptedException   {
	person_company_preferences_properties pcp = new person_company_preferences_properties(driver);
	String external_input_1stelement_selectable_values_edit_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_1stelement_selectable_values_edit_text");
	gl.action_mouseover(pcp.person_company());
	gl.action_mouseover(pcp.person_company_preferences());
	gl.click(pcp.person_company_preferences_properties_xpath());
	gl.click(pcp.person_company_preferences_properties_1stelement());
	gl.click(pcp.person_company_preferences_properties_selectable_values_1stelement_editbutton());
	gl.get_window_handle(1);
	gl.sendKeys(pcp.person_company_preferences_properties_edit_textinput(), external_input_1stelement_selectable_values_edit_text);
	gl.click(pcp.person_company_preferences_properties_edit_savebutton());
	gl.get_window_handle(0);
	String get_edited_element_text = gl.get_text(pcp.person_company_preferences_properties_selectable_values_1stelement());
	gl.assert_method(get_edited_element_text, external_input_1stelement_selectable_values_edit_text);
	}
		
	@Test(groups= {"sanity"})
	public void preson_company_040() throws IOException, InterruptedException   {
	person_company_preferences_properties pcp = new person_company_preferences_properties(driver);
	gl.action_mouseover(pcp.person_company());
	gl.action_mouseover(pcp.person_company_preferences());
	gl.click(pcp.person_company_preferences_properties_xpath());
	gl.click(pcp.person_company_preferences_properties_1stelement());
	Thread.sleep(1000);
	String get_1st_element_name_beforeclick = gl.get_text(pcp.person_company_preferences_properties_1stelement_selectable_values_1stelement());
	gl.click(pcp.person_company_preferences_properties_1stelement_selectable_values_down_green_arrow());
	gl.click(pcp.person_company_preferences_properties_1stelement());
	String get_2nd_element_name_afterclick = gl.get_text(pcp.person_company_preferences_properties_1stelement_selectable_values_2ndelement());
	gl.assert_method(get_1st_element_name_beforeclick, get_2nd_element_name_afterclick);
	gl.click(pcp.person_company_preferences_properties_2ndelement_selectable_values_up_green_arrow());
	gl.click(pcp.person_company_preferences_properties_1stelement());
	String get_1st_element_name_afterclick = gl.get_text(pcp.person_company_preferences_properties_1stelement_selectable_values_1stelement());
	gl.assert_method(get_2nd_element_name_afterclick, get_1st_element_name_afterclick);
	}

	@Test(groups= {"sanity"})
	public void preson_company_041() throws IOException, InterruptedException   {
	person_company_preferences_properties pcp = new person_company_preferences_properties(driver);
	String external_input_properties_selectable_value_disable_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_properties_selectable_value_disable_image");
	String external_input_properties_selectable_value_active_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_properties, "external_input_properties_selectable_value_active_image");
	gl.action_mouseover(pcp.person_company());
	gl.action_mouseover(pcp.person_company_preferences());
	gl.click(pcp.person_company_preferences_properties_xpath());
	gl.click(pcp.person_company_preferences_properties_1stelement());
	Thread.sleep(1000);
	String get_edited_element_text_beforeclick = pcp.person_company_preferences_properties_selectable_values_1stelement_image().getAttribute("title");
	if (get_edited_element_text_beforeclick.equals(external_input_properties_selectable_value_disable_image)) {
		gl.click(pcp.person_company_preferences_properties_selectable_values_1stelement_image());
		String get_edited_element_text_afterclick = pcp.person_company_preferences_properties_selectable_values_1stelement_image().getAttribute("title");
		gl.assert_method(get_edited_element_text_afterclick, external_input_properties_selectable_value_active_image);
		    }else {
			gl.click(pcp.person_company_preferences_properties_selectable_values_1stelement_image());
			String get_edited_element_text_afterclick = pcp.person_company_preferences_properties_selectable_values_1stelement_image().getAttribute("title");
			gl.assert_method(get_edited_element_text_afterclick, external_input_properties_selectable_value_disable_image);
			}
		}
	}
