package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_create_user_email_report;

public class test_person_company_create_user_email_report extends base {

	generic_library gl = new generic_library(driver);
		
		@Test(groups= {"sanity"})
		public void person_company_066() throws IOException, InterruptedException   {
			person_company_create_user_email_report pcp = new person_company_create_user_email_report(driver);
			String external_input_email_report_title = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_create_user_email_report, "external_input_email_report_title");
			gl.action_mouseover(pcp.person_company());
			gl.action_mouseover(pcp.person_company_create_user_xpath());
			gl.click(pcp.person_company_create_user_email_reports());
			String person_company_create_user_email_report_title = pcp.person_company_create_user_email_report_title().getText();
			gl.assert_method(person_company_create_user_email_report_title, external_input_email_report_title);
		}

}
