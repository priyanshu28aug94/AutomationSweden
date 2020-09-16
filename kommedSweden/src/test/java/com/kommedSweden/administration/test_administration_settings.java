package com.kommedSweden.administration;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;

import com.kommedSweden.base;
import com.kommedSweden.generic_library;


public class test_administration_settings extends base  {
generic_library gl = new generic_library(driver);
	
	@Test
	public void administration_1() throws InterruptedException, IOException {
		administration_settings as= new administration_settings(driver);
		//String ad_zipcode=generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_settings, "ad_zipcode");
		gl.action_mouseover(as.administration());
		gl.action_mouseover(as.ad_setting());
		gl.click(as.ad_postcode());
		gl.select_by_value(as.ad_postcode_country(),"93" );
		gl.select_by_value(as.ad_postcode_organization(), "0");
		Thread.sleep(2000);
		gl.click(as.ad_postcode_zipcode());
		//String ad_zipcode=generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_settings, "ad_zipcode");
	    gl.sendKeys(as.ad_postcode_zipcode(), "1234567");
	    gl.click(as.ad_city());
		//String ad_city=generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_settings, "city");
		gl.sendKeys(as.ad_city(),"KOLKATA" );
		gl.click(as.ad_create_postcode());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		gl.select_by_value(as.ad_postcode_country(),"93" );
		gl.select_by_value(as.ad_postcode_organization(), "0");
		Thread.sleep(2000);
		gl.click(as.ad_postcode_zipcode());
		//String ad_zipcode=generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_settings, "ad_zipcode");
	    gl.sendKeys(as.ad_postcode_zipcode(), "1234567");
	    gl.click(as.ad_city());
		//String ad_city=generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_settings, "city");
		gl.sendKeys(as.ad_city(),"KOLKATA" );
		gl.click(as.ad_postcode_search());
		String get_pincode=gl.get_text(as.search_postcode_pincode());
		String get_city=gl.get_text(as.search_postcode_city());
		gl.assert_method(get_pincode, "1234567");
		gl.assert_method(get_city, "KOLKATA");
		
		
					
}
}
