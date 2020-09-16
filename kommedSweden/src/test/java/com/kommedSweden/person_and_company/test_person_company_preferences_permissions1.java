package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_preferences_permissions1;

public class test_person_company_preferences_permissions1 extends base {
	
	generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
		public void person_company_044() throws IOException, InterruptedException   {
			person_company_preferences_permissions1 pcp = new person_company_preferences_permissions1(driver);
			String external_input_permissions1_title = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_permissions1, "external_input_permissions1_title");
			gl.action_mouseover(pcp.person_company());
			gl.action_mouseover(pcp.person_company_preferences());
			gl.click(pcp.person_company_preferences_permissions_1());
			String person_company_preferences_permissions1_title = pcp.person_company_preferences_permissions1_title().getText();
			gl.assert_method(person_company_preferences_permissions1_title, external_input_permissions1_title);
		}

}
