package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_preferences_persontype;

public class test_person_company_preferences_persontype extends base {
	
	generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
		public void person_company_042() throws IOException, InterruptedException   {
			person_company_preferences_persontype pcp = new person_company_preferences_persontype(driver);
			String external_input_persontype_title = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_persontype, "external_input_persontype_title");
			gl.action_mouseover(pcp.person_company());
			gl.action_mouseover(pcp.person_company_preferences());
			gl.click(pcp.person_company_preferences_persontype());
			String person_company_perference_persontype_title_text = pcp.person_company_preferences_persontype_title().getText();
			gl.assert_method(person_company_perference_persontype_title_text, external_input_persontype_title);
		}

}
