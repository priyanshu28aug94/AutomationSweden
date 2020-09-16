package com.kommedSweden.big_search;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_big_search;
import com.kommedSweden.generic_library;

public class big_search {
public WebDriver driver;
	
	public  big_search(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement big_search_searchbox() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_big_search.big_search, "big_search_searchbox")));
	}

}
