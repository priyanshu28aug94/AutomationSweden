package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_new;

public class test_person_company_new  extends base {
	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_27() throws IOException, InterruptedException   {
		person_company_new pcn = new person_company_new(driver);
//		System.out.println("hello");
		gl.action_mouseover(pcn.person_company());		
		gl.click(pcn.person_company_new());
		
		String title_text = gl.get_text(pcn.person_company_new_titletext());
		String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "person_company_new_title_var");
		gl.assert_method(title_text, expected);
	}
	
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_28() throws IOException, InterruptedException   {
		person_company_new pcn = new person_company_new(driver);
		//		System.out.println("hello");
		gl.action_mouseover(pcn.person_company());		
		gl.click(pcn.person_company_new());
		String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
		String lastname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
		gl.sendKeys(pcn.person_company_new_firstname(), firstname);
		gl.sendKeys(pcn.person_company_new_lastname(), lastname);
		gl.click(pcn.person_company_new_save());
		
		String person_id = gl.get_text(pcn.person_company_new_id());
		String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "person_company_new_expected_var");
		
		gl.assert_method(gl.get_text(pcn.person_company_new_pagetitle()),  expected+" "+firstname+" "+lastname+" ("+person_id+")");
		
		
		
		
	}
	

	
	
}