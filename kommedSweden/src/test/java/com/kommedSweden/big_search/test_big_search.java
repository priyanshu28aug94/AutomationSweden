package com.kommedSweden.big_search;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_big_search;
import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_search;

public class test_big_search extends base {
generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"}, enabled = true)
	public void big_search_01() throws IOException, InterruptedException   {
		big_search bs = new big_search(driver);
		String id = generic_library.access_properties_file(properties_file_path_big_search.external_input_big_search, "big_search_any_id");
		gl.click(bs.big_search_searchbox());
		gl.sendKeys(bs.big_search_searchbox(), id);
	}
	
	@Test(groups= {"sanity"}, enabled = true)
	public void big_search_03() throws IOException, InterruptedException   {
		big_search bs = new big_search(driver);
		String name = generic_library.access_properties_file(properties_file_path_big_search.external_input_big_search, "big_search_any_name");
		gl.click(bs.big_search_searchbox());
		gl.sendKeys(bs.big_search_searchbox(), name);
	}

}
