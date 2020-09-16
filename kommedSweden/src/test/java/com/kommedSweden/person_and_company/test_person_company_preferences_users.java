package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_preferences_users;

public class test_person_company_preferences_users extends base {
	
	generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
		public void person_company_045() throws IOException, InterruptedException   {
			person_company_preferences_users pcp = new person_company_preferences_users(driver);
			String external_input_users_1st_Id_title = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_preferences_users, "external_input_users_1st_Id_title");
			gl.action_mouseover(pcp.person_company());
			gl.action_mouseover(pcp.person_company_preferences());
			gl.click(pcp.person_company_preferences_user());
			String person_company_preferences_users_1st_Id = pcp.person_company_preferences_users_1st_Id().getText();
			gl.click(pcp.person_company_preferences_users_1st_Id());
			String person_company_preferences_users_1st_Id_title = pcp.person_company_preferences_users_1st_Id_title().getText();
			gl.assert_method(person_company_preferences_users_1st_Id_title, external_input_users_1st_Id_title+person_company_preferences_users_1st_Id+")");
		}

}
