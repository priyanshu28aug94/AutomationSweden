package com.kommedSweden.administration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.kommed.property_file_path_of_modules.properties_file_path_administrations;
import com.kommedSweden.generic_library;

public class administration_things_to_do {
	public WebDriver driver;
	public administration_things_to_do(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement administration() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "administration")));
	}
	public WebElement administration_todo() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "administration_todo")));
	}
	public WebElement todo_web() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "todo_web")));
	}
	public WebElement search_persen() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "search_persen")));
	}
	public WebElement persen_firstname() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "persen_firstname")));
	}
	public WebElement persen_lastname() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "persen_lastname")));
	}
	public WebElement persen_search() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "persen_search")));
	}
	public WebElement persen_id() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "persen_id")));
	}
	public WebElement select_checkbox() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "select_checkbox")));
	}
	public WebElement create_persen() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "create_persen")));
	}
	public WebElement create_firstname() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "create_firstname")));
	}
	public WebElement create_lastname() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "create_lastname")));
	}
	public WebElement create_person_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "create_person_save")));
	}
	public WebElement todo_totalin() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "todo_totalin")));
	}
	public WebElement todo_file() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "todo_file")));
	}
	public WebElement todo_file_save() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "todo_file_save")));
	}
	public WebElement todo_radio() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "todo_radio")));
	}
	public WebElement ad_todo_web_text() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "ad_todo_web_text")));
	}
	public WebElement ad_todo_text() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "ad_todo_text")));
	}
	public WebElement ad_todo_totalin_text() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "ad_todo_totalin_text")));
	}
	public WebElement select_checkbox_person() throws IOException {
		return driver.findElement(By.xpath(generic_library.access_properties_file(properties_file_path_administrations.administration_todo, "select_checkbox_person")));
	}
}
