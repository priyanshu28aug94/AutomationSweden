package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_create_user_client_list;

public class test_person_company_create_user_client_list extends base {

	generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
	public void person_company_067() throws IOException, InterruptedException   {
		person_company_create_user_client_list pcc = new person_company_create_user_client_list(driver);
		gl.action_mouseover(pcc.person_company());
		gl.action_mouseover(pcc.person_company_create_user_xpath());
		gl.click(pcc.person_company_create_user_client_list());
		String external_input_my_customers_title = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_create_user_client_list, "external_input_my_customers_title");
		String get_title = gl.get_text(pcc.person_company_create_user_client_list_my_customers_title());
		gl.assert_method(get_title, external_input_my_customers_title);
		gl.browser_navigate_backword();
	}
	
	    @Test(groups= {"sanity"})
		public void person_company_068() throws IOException, InterruptedException   {
			person_company_create_user_client_list pcc = new person_company_create_user_client_list(driver);
			gl.action_mouseover(pcc.person_company());
			gl.action_mouseover(pcc.person_company_create_user_xpath());
			gl.click(pcc.person_company_create_user_client_list());
			String get_1st_user_id = gl.get_text(pcc.person_company_create_user_client_list_1st_user());
			gl.click(pcc.person_company_create_user_client_list_1st_user());
			String get_kundsida_user_id = gl.get_text(pcc.person_company_create_user_client_list_kundsida_ID());
			gl.assert_method(get_kundsida_user_id, get_1st_user_id);
			gl.browser_navigate_backword();
			gl.browser_navigate_backword();
		}
	
	@Test(groups= {"sanity"})
	public void person_company_069() throws IOException, InterruptedException   {
		person_company_create_user_client_list pcc = new person_company_create_user_client_list(driver);
		gl.action_mouseover(pcc.person_company());
		gl.action_mouseover(pcc.person_company_create_user_xpath());
		gl.click(pcc.person_company_create_user_client_list());
		gl.click(pcc.person_company_create_user_client_list_mina_kunder());
		String external_input_my_customers_title = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_create_user_client_list, "external_input_my_customers_title");
		String get_title = gl.get_text(pcc.person_company_create_user_client_list_my_customers_title());
		gl.assert_method(get_title, external_input_my_customers_title);
		gl.browser_navigate_backword();
		gl.browser_navigate_backword();
		}

}
