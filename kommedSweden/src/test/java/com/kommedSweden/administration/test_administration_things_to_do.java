package com.kommedSweden.administration;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class test_administration_things_to_do extends base {
generic_library gl = new generic_library(driver);
	
	@Test
	public void administration_11() throws InterruptedException, IOException {
		administration_things_to_do attd= new administration_things_to_do(driver);
		gl.action_mouseover(attd.administration());
		gl.click(attd.administration_todo());
		gl.click(attd.todo_web());
		String actual=gl.get_url();
		String todo_web = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "todo_web");
		gl.assert_method(actual, todo_web);
		gl.click(attd.search_persen());
		gl.get_window_handle(1);
		gl.get_window_handle(0);
		String actual1=gl.get_text(attd.ad_todo_web_text());
		String exp_ad_todo_text = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "exp_ad_todo_text");
		gl.assert_method(actual1, exp_ad_todo_text);
				
}
	@Test
	public void administration_12() throws InterruptedException, IOException {
		administration_things_to_do attd= new administration_things_to_do(driver);
		gl.action_mouseover(attd.administration());
		gl.click(attd.administration_todo());
		gl.click(attd.todo_web());
		String actual=gl.get_url();
		String todo_web = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "todo_web");
		gl.assert_method(actual, todo_web);
		gl.click(attd.search_persen());
		gl.get_window_handle(1);
		gl.click(attd.persen_id());
		//gl.sendKeys(attd.persen_id(), "10003");
		gl.click(attd.persen_firstname());
		String first_name = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "first_name");
		gl.sendKeys(attd.persen_firstname(), first_name);
		gl.click(attd.persen_lastname());
		String last_name = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "last_name");
		gl.sendKeys(attd.persen_lastname(), last_name);
		gl.click(attd.persen_search());
		Thread.sleep(3000);
		gl.get_window_handle(0);
		String actual2=gl.get_text(attd.ad_todo_web_text());
		String exp_ad_todo_text = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "exp_ad_todo_text");
		gl.assert_method(actual2, exp_ad_todo_text);
	}
	@Test
	public void administration_13() throws InterruptedException, IOException {
		administration_things_to_do attd= new administration_things_to_do(driver);
		gl.action_mouseover(attd.administration());
		gl.click(attd.administration_todo());
		gl.click(attd.todo_web());
		String actual=gl.get_url();
		String todo_web = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "todo_web");
		gl.assert_method(actual, todo_web);
		gl.click(attd.search_persen());
		gl.get_window_handle(1);
		gl.click(attd.persen_id());
		Thread.sleep(2000);
		String id = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "id");
		gl.sendKeys(attd.persen_id(), id);
	    gl.click(attd.persen_search());
	    Thread.sleep(2000);
	    gl.click_radiobutton(attd.select_checkbox_person());
		Thread.sleep(2000);
		gl.get_window_handle(0);
		String actual2=gl.get_text(attd.ad_todo_web_text());
		String exp_ad_todo_text = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "exp_ad_todo_text");
		gl.assert_method(actual2, exp_ad_todo_text);
	}
		
		@Test
		public void administration_14() throws InterruptedException, IOException {
			administration_things_to_do attd= new administration_things_to_do(driver);
			gl.action_mouseover(attd.administration());
			gl.click(attd.administration_todo());
			gl.click(attd.todo_web());
			String actual=gl.get_url();
			String todo_web = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "todo_web");
			gl.assert_method(actual, todo_web);
			gl.click(attd.search_persen());
			gl.get_window_handle(1);
			gl.click(attd.create_persen());
			gl.click(attd.create_firstname());
			String new_first_name = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "new_first_name");
			gl.sendKeys(attd.create_firstname(), new_first_name);
			gl.click(attd.create_lastname());
			String new_last_name = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "new_last_name");
			gl.sendKeys(attd.create_lastname(), new_last_name);
			gl.click(attd.create_person_save());
			gl.get_window_handle(0);
			String actual3=gl.get_text(attd.ad_todo_web_text());
			String exp_ad_todo_text = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "exp_ad_todo_text");
			gl.assert_method(actual3, exp_ad_todo_text);
				
}
		@Test
		public void administration_16() throws InterruptedException, IOException {
			administration_things_to_do attd= new administration_things_to_do(driver);
			gl.action_mouseover(attd.administration());
			gl.click(attd.administration_todo());
			gl.click(attd.todo_totalin());
			String actual=gl.get_url();
			String todo_totalin = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "todo_totalin");
			gl.assert_method(actual, todo_totalin);
			Thread.sleep(2000);
			gl.click(attd.todo_file());
			String todo_totalin_file = generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "todo_totalin_file");
			gl.uploadFile("Resources\\administration\\", "phpdocs.docx");
			gl.click(attd.todo_file_save());
			gl.click_radiobutton(attd.todo_radio());
			String actual1=gl.get_text(attd.ad_todo_totalin_text());
			String exp_ad_todo_totalin_text= generic_library.access_properties_file(properties_file_path_administrations.external_input_administratio_todo, "exp_ad_todo_totalin_text");
		    gl.assert_method(actual1, exp_ad_todo_totalin_text);
}
		
}
