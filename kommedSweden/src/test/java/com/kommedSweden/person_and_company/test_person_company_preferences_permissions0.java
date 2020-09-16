package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_preferences_permissions0;

public class test_person_company_preferences_permissions0 extends base{
	
	generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
	public void person_company_043() throws IOException, InterruptedException   {
		person_company_preferences_permissions0 pcp = new person_company_preferences_permissions0(driver);
		String external_input_permissions0_title = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_permissions0, "external_input_permissions0_title");
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_preferences());
		gl.click(pcp.person_company_preferences_permissions_0());
		String person_company_preferences_permissions0_title = pcp.person_company_preferences_permissions0_title().getText();
		gl.assert_method(person_company_preferences_permissions0_title, external_input_permissions0_title);
	}

}
