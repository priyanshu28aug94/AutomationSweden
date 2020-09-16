package com.kommedSweden.member;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kommed.property_file_path_of_modules.properties_file_path_member;
import com.kommedSweden.base;
import com.kommedSweden.generic_library;
import com.kommedSweden.member.member_settings_membercategories;


public class test_member_settings_membercategories extends base {
	generic_library gl = new generic_library(driver);
	@Test(groups= {"sanity"})
	public void member_27() throws IOException, InterruptedException   {
		member_settings_membercategories msm = new member_settings_membercategories(driver);
		System.out.println("hello");
		gl.action_mouseover(msm.member());
		gl.action_mouseover(msm.settings());
		gl.click(msm.categories());
	    gl.click(msm.new_category());
	    String new_cate = generic_library.access_properties_file(properties_file_path_member.external_input_member_settings_membercategories, "new_cate");
	    String new_cate_withtime=new_cate+gl.gettingDateAndTime();
	    gl.sendKeys(msm.new_category(), new_cate);
	    Thread.sleep(2000);
	    gl.click_checkbox(msm.select_checkbox());
	    gl.click(msm.category_save());
	    String actual=gl.FindTheRequiredStringFromAList(msm.mem_categories_list(), new_cate_withtime);
	    gl.assert_method(actual, new_cate_withtime);
	    
}
}