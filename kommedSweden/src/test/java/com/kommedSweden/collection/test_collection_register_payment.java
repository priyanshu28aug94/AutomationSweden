package com.kommedSweden.collection;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_collections;
import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;


public class test_collection_register_payment extends base {
	generic_library gl = new generic_library(driver);
   @Test(groups= {"sanity"})
	public void collection_1() throws IOException, InterruptedException   {
		collection_register_payment pcn = new collection_register_payment(driver);
//		System.out.println("hello");
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_register_payment());
		
		String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "expected_title");
		
		String title_text = gl.get_text(pcn.collection_register_payment_titletext());
		gl.assert_method(title_text, expected_title);
	}
	
	@Test(groups= {"sanity"})
	public void collection_2() throws IOException, InterruptedException   {
		collection_register_payment pcn = new collection_register_payment(driver);
		//		System.out.println("hello");
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_register_payment());
		String id = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "id");
		String date = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "date");
		String amount= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "amount");
		String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "expected_title");
		String dropdown21 = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "dropdown21");
		String dropdown22 = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "dropdown22");
		gl.sendKeys(pcn.collection_register_payment_id(), id);
		gl.sendKeys(pcn.collection_register_payment_date(), date);
		gl.sendKeys(pcn.collection_register_payment_amount(), amount);
		gl.select_by_value(pcn.collection_register_payment_payment(),dropdown21);
		gl.select_by_value(pcn.collection_register_payment_campaign(),dropdown22);
		gl.click(pcn.collection_register_payment_submit());
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		String title_text = gl.get_text(pcn.collection_register_payment_titletext());
		gl.assert_method(title_text, expected_title);
	
	}
	
	@Test(groups= {"sanity"})
	public void collection_4() throws IOException, InterruptedException   {
		collection_register_payment pcn = new collection_register_payment(driver);
		//		System.out.println("hello");
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_register_payment());
		String id = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "id");
		String date = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "date");
		String amount= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "amount");
		String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "expected_title");
		String dropdown41 = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "dropdown41");
		String dropdown42 = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "dropdown42");
		gl.sendKeys(pcn.collection_register_payment_id(), id);
		gl.sendKeys(pcn.collection_register_payment_date(), date);
		gl.sendKeys(pcn.collection_register_payment_amount(), amount);
		gl.select_by_value(pcn.collection_register_payment_payment(),dropdown41);
		gl.select_by_value(pcn.collection_register_payment_purpose(),dropdown42);
		gl.click(pcn.collection_register_payment_submit());
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		String title_text = gl.get_text(pcn.collection_register_payment_titletext());
		gl.assert_method(title_text, expected_title);
	
	}
	
	@Test(groups= {"sanity"})
	public void collection_3() throws IOException, InterruptedException   {
		collection_register_payment pcn = new collection_register_payment(driver);
		//		System.out.println("hello");
		gl.action_mouseover(pcn.collection());		
		gl.click(pcn.collection_register_payment());
		String id = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "id");
		String date = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "date");
		String amount= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "amount");
		String dropdown31 = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "dropdown31");
		String dropdown32 = generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "dropdown32");
		String expected_title= generic_library.access_properties_file(properties_file_path_collections.external_input_collection_register_payment, "expected_title");
		gl.sendKeys(pcn.collection_register_payment_id(), id);
		gl.sendKeys(pcn.collection_register_payment_date(), date);
		gl.sendKeys(pcn.collection_register_payment_amount(), amount);
		gl.select_by_value(pcn.collection_register_payment_payment(),dropdown31);
		gl.select_by_value(pcn.collection_register_payment_agreement(),dropdown32);
		gl.click(pcn.collection_register_payment_agreement());
		gl.click(pcn.collection_register_payment_submit());
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		String title_text = gl.get_text(pcn.collection_register_payment_titletext());
		gl.assert_method(title_text, expected_title);
	
	}

}
