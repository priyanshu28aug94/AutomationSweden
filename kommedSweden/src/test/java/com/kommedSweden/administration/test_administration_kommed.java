package com.kommedSweden.administration;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;

public class test_administration_kommed  extends base{
	generic_library gl = new generic_library(driver);

	@Test
	public void administration_21() throws InterruptedException, IOException {
		administration_kommed ak=new administration_kommed(driver);
		gl.action_mouseover(ak.administration());
		gl.action_mouseover(ak.kommed());
		gl.click(ak.contral_panel());
		gl.click_radiobutton(ak.show_sql_no());
		gl.click(ak.contral_panel_save());
		String actual=gl.get_text(ak.contral_panel_text());
		String  exp_contral_panel_text = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "exp_contral_panel_text");
	    gl.assert_method(actual, exp_contral_panel_text);			
}
	@Test
	public void administration_22() throws InterruptedException, IOException {
		administration_kommed ak=new administration_kommed(driver);
		gl.action_mouseover(ak.administration());
		gl.action_mouseover(ak.kommed());
		gl.click(ak.contral_panel());
		Thread.sleep(2000);
		gl.click_radiobutton(ak.show_sql_yes());
		gl.click(ak.contral_panel_save());
		Thread.sleep(2000);
		gl.click_radiobutton(ak.show_sql_no());
		gl.click(ak.contral_panel_save());
		Thread.sleep(2000);
		gl.browser_refresh();
		String actual=gl.get_text(ak.contral_panel_text());
		String  exp_contral_panel_text = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "exp_contral_panel_text");
	    gl.assert_method(actual, exp_contral_panel_text);			
}
	@Test
	public void administration_23() throws InterruptedException, IOException {
		administration_kommed ak=new administration_kommed(driver);
		gl.action_mouseover(ak.administration());
		gl.action_mouseover(ak.kommed());
		gl.click(ak.contral_panel());
		gl.click_radiobutton(ak.show_language_code());
		gl.click(ak.show_language_code_save());
		String actual=gl.get_text(ak.contral_panel_text());
		String  exp_contral_panel_text = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "exp_contral_panel_text");
	    gl.assert_method(actual, exp_contral_panel_text);			
}
	@Test
	public void administration_24() throws InterruptedException, IOException {
		administration_kommed ak=new administration_kommed(driver);
		gl.action_mouseover(ak.administration());
		gl.action_mouseover(ak.kommed());
		gl.click(ak.contral_panel());
		Thread.sleep(4000);
		gl.click(ak.certificate_1());
		Thread.sleep(2000);
		String certificate_1 = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "certificate_1");
		gl.uploadFile("Resources\\administration\\", "phpdocs.docx");
		System.out.println("come");
		Thread.sleep(1000);
		gl.click(ak.certificate_1_save());
		String actual=gl.get_text(ak.contral_panel_text());
		String  exp_contral_panel_text = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "exp_contral_panel_text");
	    gl.assert_method(actual, exp_contral_panel_text);			
		
}
	@Test
	public void administration_27() throws InterruptedException, IOException {
		administration_kommed ak=new administration_kommed(driver);
		gl.action_mouseover(ak.administration());
		gl.action_mouseover(ak.kommed());
		gl.click(ak.contral_panel());
		gl.click(ak.payment_mode());
		Thread.sleep(2000);
		String payment_mode = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "payment_mode");
		gl.sendKeys(ak.payment_mode(), payment_mode);
		Thread.sleep(2000);
		gl.click(ak.Payment_save());
		String actual=gl.get_text(ak.contral_panel_text());
		String  exp_contral_panel_text = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "exp_contral_panel_text");
	    gl.assert_method(actual, exp_contral_panel_text);	
}
	@Test
	public void administration_28() throws InterruptedException, IOException {
		administration_kommed ak=new administration_kommed(driver);
		gl.action_mouseover(ak.administration());
		gl.action_mouseover(ak.kommed());
		gl.click(ak.kommed_web());
		gl.click(ak.kommed_web_name());
		String kommed_web_name = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "kommed_web_name");
		gl.sendKeys(ak.kommed_web_name(), kommed_web_name);
	    gl.click(ak.kommed_web_ip());
		String kommed_web_ip = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "kommed_web_ip");
		gl.sendKeys(ak.kommed_web_ip(), kommed_web_ip);
		gl.click(ak.kommed_web_save());
		//database prob
		
				
}
	@Test
	public void administration_31() throws InterruptedException, IOException {
		administration_kommed ak=new administration_kommed(driver);
		gl.action_mouseover(ak.administration());
		gl.action_mouseover(ak.kommed());
		gl.click(ak.kommed_web());
		gl.click(ak.kommed_web_edit());
		gl.get_window_handle(1);
		gl.click(ak.kommed_newweb_name());
		String enter_new_web_name = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "enter_new_web_name");
		gl.sendKeys(ak.kommed_newweb_name(), enter_new_web_name);
		gl.click(ak.kommed_newweb_name_save());
		gl.get_window_handle(0);
		String actual=gl.get_text(ak.kommed_web_1st_statement());
		gl.assert_method(actual, enter_new_web_name);
			
} 
	@Test
	public void administration_30() throws InterruptedException, IOException {
		administration_kommed ak=new administration_kommed(driver);
		gl.action_mouseover(ak.administration());
		gl.action_mouseover(ak.kommed());
		gl.click(ak.kommed_web());
		String expect_webservices_active_image = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "expect_webservices_active_image");
		String expect_webservices_disable_image = generic_library.access_properties_file(properties_file_path_administrations.external_input_administration_kommed, "expect_webservices_disable_image");
		String get_edited_element_text_beforeclick=ak.kommed_web_1st_webservice_img().getAttribute("title");
		if (get_edited_element_text_beforeclick.equals(expect_webservices_disable_image)) {
			gl.click(ak.kommed_web_1st_webservice_img());
			String get_edited_element_text_afterclick = ak.kommed_web_1st_webservice_img().getAttribute("title");
			gl.assert_method(get_edited_element_text_afterclick, expect_webservices_active_image);
		}else {
			gl.click(ak.kommed_web_1st_webservice_img());
			String get_edited_element_text_afterclick = ak.kommed_web_1st_webservice_img().getAttribute("title");
			gl.assert_method(get_edited_element_text_afterclick, expect_webservices_disable_image);
		}
	}
}
