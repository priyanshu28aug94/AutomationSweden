package com.kommedSweden.person_and_company;

import java.io.IOException;


import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_person_company;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.persons_company.person_company_new;
import com.kommedSweden.persons_company.person_company_search;

public class test_person_company_search extends base {
	generic_library gl = new generic_library(driver);
	
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_1() throws IOException, InterruptedException   {
		person_company_search pcn = new person_company_search(driver);
		gl.action_mouseover(pcn.person_company());		
		gl.click(pcn.person_search());
		
		String title_text = gl.get_text(pcn.person_search_pagetitle());
		String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_search_title");
		gl.assert_method(title_text, expected);
	}
	
	
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_2() throws IOException, InterruptedException   {
		person_company_search pcn = new person_company_search(driver);
		gl.action_mouseover(pcn.person_company());
		gl.click(pcn.person_search());
		gl.click(pcn.person_company_member());
		gl.click(pcn.person_company_member_search());
		String title_text = gl.get_text(pcn.person_company_member_search_title());
		String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_member_search_title");
		gl.assert_method(title_text, expected);
	}
	
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_3() throws IOException, InterruptedException   {
		person_company_search pcn = new person_company_search(driver);
		gl.action_mouseover(pcn.person_company());	
		gl.click(pcn.person_search());
		gl.click(pcn.person_company_member());
		gl.click(pcn.person_company_member_search_ammount());
		gl.get_window_handle(1);
		String title_text = gl.get_text(pcn.person_company_member_search_ammount_title());
		String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_fundraising_search_title");
		gl.assert_method(title_text, expected);
		gl.get_window_handle(0);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_4() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.person_company());	
			gl.click(pcn.person_search());
			gl.click(pcn.person_company_fundraising());
			gl.click(pcn.person_company_fundraising_search_amount());
			gl.get_window_handle(1);
			String title_text = gl.get_text(pcn.person_company_fundraising_search_amount_title());
			String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_fundraising_search_title");
			gl.assert_method(title_text,expected);
			gl.get_window_handle(0);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_5() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.person_company());
			gl.click(pcn.person_search());
			gl.click(pcn.person_company_subscription());
			gl.click(pcn.person_company_subscription_search());
			String title_text = gl.get_text(pcn.person_company_subscription_search_title());
			String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_member_search_title");
			gl.assert_method(title_text, expected);
	}
		@Test(groups= {"sanity"}, enabled = true)
		public void person_company_6() throws IOException, InterruptedException   {
				person_company_search pcn = new person_company_search(driver);
				gl.action_mouseover(pcn.person_company());
				gl.click(pcn.person_search());
				gl.click(pcn.person_company_groups());
				gl.click(pcn.person_company_subscription_search());
				String title_text = gl.get_text(pcn.person_company_subscription_search_title());
				String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_member_search_title");
				gl.assert_method(title_text, expected);
		}
		@Test(groups= {"sanity"}, enabled = true)
		public void person_company_7() throws IOException, InterruptedException   {
				person_company_search pcn = new person_company_search(driver);
				gl.action_mouseover(pcn.person_company());
				gl.click(pcn.person_search());
				gl.click(pcn.person_company_commitment());
				gl.click(pcn.person_company_subscription_search());
				String title_text = gl.get_text(pcn.person_company_subscription_search_title());
				String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_member_search_title");
				gl.assert_method(title_text, expected);
		}
		@Test(groups= {"sanity"}, enabled = true)
		public void person_company_8() throws IOException, InterruptedException   {
				person_company_search pcn = new person_company_search(driver);
				gl.action_mouseover(pcn.person_company());
				gl.click(pcn.person_search());
				gl.click(pcn.person_company_sales());
				gl.click(pcn.person_company_subscription_search());
				String title_text = gl.get_text(pcn.person_company_subscription_search_title());
				String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_member_search_title");
				gl.assert_method(title_text, expected);
		}
		@Test(groups= {"sanity"}, enabled = true)
		public void person_company_9() throws IOException, InterruptedException   {
				person_company_search pcn = new person_company_search(driver);
				gl.action_mouseover(pcn.person_company());
				gl.click(pcn.person_search());
				gl.click(pcn.person_company_ledger());
				gl.click(pcn.person_company_subscription_search());
				String title_text = gl.get_text(pcn.person_company_subscription_search_title());
				String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_member_search_title");
				gl.assert_method(title_text, expected);
		}
		@Test(groups= {"sanity"}, enabled = true)
		public void person_company_10() throws IOException, InterruptedException   {
				person_company_search pcn = new person_company_search(driver);
				gl.action_mouseover(pcn.person_company());
				gl.click(pcn.person_search());
				gl.click(pcn.person_company_account());
				gl.click(pcn.person_company_subscription_search());
				String title_text = gl.get_text(pcn.person_company_subscription_search_title());
				String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_member_search_title");
				gl.assert_method(title_text, expected);
		}
		@Test(groups= {"sanity"}, enabled = true)
		public void person_company_11() throws IOException, InterruptedException   {
				person_company_search pcn = new person_company_search(driver);
				gl.action_mouseover(pcn.person_company());
				gl.click(pcn.person_search());
				gl.click(pcn.person_company_event());
				gl.click(pcn.person_company_subscription_search());
				String title_text = gl.get_text(pcn.person_company_event_title());
				String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_member_search_title");
				gl.assert_method(title_text, expected);
		}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_12() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			String id = gl.get_text(pcn.person_company_new_id());
			String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
			String lastname =  generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
			String suffix = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "person_company_new_expected_var");
			String expected = suffix+" " +firstname+" "+lastname+" ("+id+")";
			String actual = gl.get_text(pcn.person_search_pagetitle());
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_13() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			String id = gl.get_text(pcn.person_company_new_id());
			gl.click(pcn.view_donor_info());
			String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
			String lastname =  generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
			String suffix = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_donor_information");
			String expected = suffix+" " +firstname+" "+lastname+" ("+id+")";
			String actual = gl.get_text(pcn.person_search_pagetitle());
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_14() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			String id = gl.get_text(pcn.person_company_new_id());
			gl.click(pcn.view_history());
			String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
			String lastname =  generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
			String suffix = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_history_information");
			String expected = suffix+" " +firstname+" "+lastname+" ("+id+")";
			String actual = gl.get_text(pcn.person_search_pagetitle());
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_15() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			String id = gl.get_text(pcn.person_company_new_id());
			gl.click(pcn.view_ledger());
			String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
			String lastname =  generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
			String suffix = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_ledger_information");
			String expected = suffix+" " +firstname+" "+lastname+" ("+id+")";
			String actual = gl.get_text(pcn.person_search_pagetitle());
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_16() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			String id = gl.get_text(pcn.person_company_new_id());
			gl.click(pcn.notes_docs());
			String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
			String lastname =  generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
			String suffix = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_notes_information");
			String expected = suffix+" " +firstname+" "+lastname+" ("+id+")";
			String actual = gl.get_text(pcn.person_search_pagetitle());
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_17() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			gl.click(pcn.reg_payments());
			gl.sendKeys(pcn.reg_payment_date(), generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "reg_payment_date_input"));
			gl.sendKeys(pcn.reg_payment_amount(), generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "reg_payment_amount_input"));
			gl.click_radiobutton(pcn.reg_payment_radio());
			gl.click(pcn.member_submit_btn());
			String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "reg_payment_message");
			String actual = gl.get_text(pcn.reg_payment_title());
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_18() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			gl.click(pcn.view_member());
			gl.select_by_value(pcn.memeber_org(), generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "view_member_value"));
			gl.click(pcn.member_submit_btn());
			String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "view_member_url");
			String actual = gl.get_url();
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_19() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			gl.click(pcn.subscription());
			gl.click(pcn.member_submit_btn());
			String expected = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "subscription_url");
			String actual = gl.get_url();
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_20() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			String id = gl.get_text(pcn.person_company_new_id());
			gl.click(pcn.commitment());
//			gl.click(pcn.commitment_new());
			gl.click(pcn.member_submit_btn());
			String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
			String lastname =  generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
			String suffix = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "person_company_new_expected_var");
			String expected = suffix+" " +firstname+" "+lastname+" ("+id+")";
			String actual = gl.get_text(pcn.person_company_new_pagetitle());
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_21() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			String id = gl.get_text(pcn.person_company_new_id());
			gl.click(pcn.sales());
			String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
			String lastname =  generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
			String suffix = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "person_company_new_expected_var");
			String expected = suffix+" " +firstname+" "+lastname+" ("+id+")";
			String actual = gl.get_text(pcn.person_company_new_pagetitle());
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_22() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			String id = gl.get_text(pcn.person_company_new_id());
			gl.click(pcn.groups());
			gl.select_by_value(pcn.memeber_org(), generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_group_search_value"));
			gl.click(pcn.member_submit_btn());
			String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
			String lastname =  generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
			String suffix = generic_library.access_properties_file(properties_file_path_person_company.external_input_search, "person_company_group_title");
			String expected = suffix+" " +firstname+" "+lastname+" ("+id+")";
			String actual = gl.get_text(pcn.person_company_new_pagetitle());
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_23() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			String id = gl.get_text(pcn.person_company_new_id());
			gl.click(pcn.account());
			String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
			String lastname =  generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
			String suffix = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "person_company_new_expected_var");
			String expected = suffix+" " +firstname+" "+lastname+" ("+id+")";
			String actual = gl.get_text(pcn.person_search_pagetitle());
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_25() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			String id = gl.get_text(pcn.person_company_new_id());
			gl.click(pcn.event());
			String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
			String lastname =  generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
			String suffix = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "person_company_new_expected_var");
			String expected = suffix+" " +firstname+" "+lastname+" ("+id+")";
			String actual = gl.get_text(pcn.person_search_pagetitle());
			gl.assert_method(actual, expected);
	}
	@Test(groups= {"sanity"}, enabled = true)
	public void person_company_26() throws IOException, InterruptedException   {
			person_company_search pcn = new person_company_search(driver);
			gl.action_mouseover(pcn.kommed_logo());
			gl.action_mouseover(pcn.kommed_last_records());
			gl.click(pcn.kommed_last_user());
			String id = gl.get_text(pcn.person_company_new_id());
			gl.click(pcn.settings());
			String firstname = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "firstname");
			String lastname =  generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "lastname");
			String suffix = generic_library.access_properties_file(properties_file_path_person_company.external_input_new, "person_company_new_expected_var");
			String expected = suffix+" " +firstname+" "+lastname+" ("+id+")";
			String actual = gl.get_text(pcn.person_search_pagetitle());
			gl.assert_method(actual, expected);
	}	
		
}