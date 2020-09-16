package com.kommedSweden.person_and_company;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_templates_email_templates;

public class test_person_company_templates_email_templates extends base {

    generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"})
	public void preson_company_063() throws IOException, InterruptedException   {
		person_company_templates_email_templates pcp = new person_company_templates_email_templates(driver);
		String external_input_email_templates_input_text = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_templates_email_templates, "external_input_email_templates_input_text");
		gl.action_mouseover(pcp.person_company());
		gl.action_mouseover(pcp.person_company_templates());
		gl.click(pcp.person_company_templates_email_templates());
		gl.sendKeys(pcp.person_company_templates_email_templates_textinput(), external_input_email_templates_input_text);
		gl.click(pcp.person_company_templates_email_templates_savebutton());
		String person_company_templates_email_templates_input_text=gl.get_last_element(pcp.person_company_templates_email_templates_typelist());
		gl.assert_method(person_company_templates_email_templates_input_text, external_input_email_templates_input_text);
	}
	
	  @Test(groups= {"sanity"})
		public void preson_company_064() throws IOException, InterruptedException   {
	    	person_company_templates_email_templates pcp = new person_company_templates_email_templates(driver);
	    	String external_input_email_templates_disable_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_templates_email_templates, "external_input_email_templates_disable_image");
	    	String external_input_email_templates_active_image = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_templates_email_templates, "external_input_email_templates_active_image");
			gl.action_mouseover(pcp.person_company());
			gl.action_mouseover(pcp.person_company_templates());
			gl.click(pcp.person_company_templates_email_templates());
			String get_edited_element_text_beforeclick = pcp.person_company_templates_email_templates_1stelement_image().getAttribute("title");
			if (get_edited_element_text_beforeclick.equals(external_input_email_templates_disable_image)) {
				gl.click(pcp.person_company_templates_email_templates_1stelement_image());
				String get_edited_element_text_afterclick = pcp.person_company_templates_email_templates_1stelement_image().getAttribute("title");
				gl.assert_method(get_edited_element_text_afterclick, external_input_email_templates_active_image);
			}else {
				gl.click(pcp.person_company_templates_email_templates_1stelement_image());
				String get_edited_element_text_afterclick = pcp.person_company_templates_email_templates_1stelement_image().getAttribute("title");
				gl.assert_method(get_edited_element_text_afterclick, external_input_email_templates_disable_image);
			}
		}
	    
	    @Test(groups= {"sanity"})
		public void preson_company_065() throws IOException, InterruptedException   {
			person_company_templates_email_templates pcp = new person_company_templates_email_templates(driver);
			String external_input_1stelement_HTML_textarea = generic_library.access_properties_file(properties_file_path_person_company.external_input_person_company_templates_email_templates, "external_input_1stelement_HTML_textarea");
			gl.action_mouseover(pcp.person_company());
			gl.action_mouseover(pcp.person_company_templates());
			gl.click(pcp.person_company_templates_email_templates());
			gl.click(pcp.person_company_templates_email_templates_1stelement());
			pcp.person_company_templates_email_templates_1stelement_HTML_textarea().clear();
			gl.sendKeys(pcp.person_company_templates_email_templates_1stelement_HTML_textarea(), external_input_1stelement_HTML_textarea);
			gl.click(pcp.person_company_templates_email_templates_1stelement_HTML_savebutton());
			String get_html_text=gl.get_text(pcp.person_company_templates_email_templates_1stelement_HTML_textarea());
			gl.assert_method(get_html_text, external_input_1stelement_HTML_textarea);
		}

}
