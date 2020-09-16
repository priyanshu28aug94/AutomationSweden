package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_preferences_child_sponsorship;


public class test_person_preferences_child_sponsorship extends base {
	
generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
		public void person_company_049() throws IOException, InterruptedException   {
		person_company_preferences_child_sponsorship pcp = new person_company_preferences_child_sponsorship(driver);
		String external_input_child_sponsorship_title = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_child_sponsorship, "external_input_child_sponsorship_title");
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_preferences());
		gl.click(pcp.person_company_preferences_child_sponsorship_xpath());
		gl.click(pcp.person_company_preferences_child_sponsorship_search_button());
		String person_company_perference_child_sponsorship_title_text = pcp.person_company_preferences_child_sponsorship_title_text().getText();
		gl.assert_method(person_company_perference_child_sponsorship_title_text, external_input_child_sponsorship_title);
		}
	
	@Test(groups= {"sanity"})
	public void person_company_050() throws IOException, InterruptedException   {
	person_company_preferences_child_sponsorship pcp = new person_company_preferences_child_sponsorship(driver);
	String external_input_child_sponsorship_title_new_godchild = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_child_sponsorship, "external_input_child_sponsorship_title_new_godchild");
	gl.action_mouseover(pcp.person_company());
	gl.action_mouseover(pcp.person_company_preferences());
	gl.click(pcp.person_company_preferences_child_sponsorship_xpath());
	gl.click(pcp.person_company_preferences_child_sponsorship_new_child_menu());
	String person_company_perference_child_sponsorship_title_text = pcp.person_company_preferences_child_sponsorship_title_text().getText();
	gl.assert_method(person_company_perference_child_sponsorship_title_text, external_input_child_sponsorship_title_new_godchild);
	}

}
