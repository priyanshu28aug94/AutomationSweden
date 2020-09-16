package com.kommedSweden;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;


public class generic_library {
	WebDriver driver;

	public generic_library(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static File folder; //add

	public static String download_file_path = createAFolderForDownload(); // add

	//wakeup browser through chrome browser.
	public static void browser_wakeup_code(String pass_driver_path) {
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.chrome.driver", path+pass_driver_path);
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();//add
		chromePrefs.put("download.default_directory",download_file_path);//add
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		base.driver=new ChromeDriver(options);
		//base.driver = new ChromeDriver();
	}

	//method is to get value from property files
	public static String access_properties_file(String file_path, String key) throws IOException {
		String path = System.getProperty("user.dir");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(path+file_path);

		prop.load(fis);
		return prop.getProperty(key);
	}

	//used to perform mousehower action 
	public void action_mouseover(WebElement element) throws InterruptedException {
		Actions actObj = new Actions(base.driver);
		actObj.moveToElement(element).perform();
		Thread.sleep(2000);
	}

	//used to perform click operation
	public void click(WebElement element) {
		element.click();
	}

	//used to perform sendkey operation
	public void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	//assert actual result with expected result
	public void assert_method(String actual, String expected) {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}

	//get text from element
	public String get_text(WebElement element) {
		return element.getText();
	}

	//get url of page
	public String get_url() throws InterruptedException {
		Thread.sleep(2000);
		String url =  base.driver.getCurrentUrl();
		return url;	
	}

	//get element by index
	public void select_by_index(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	//get element by value
	public void select_by_value(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	//get element by visible text
	public void select_by_visible_text(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	//get window handling 
	public void get_window_handle(int index) throws InterruptedException {
		Set<String> windowHandles = base.driver.getWindowHandles();
		ArrayList<String> windowStrings = new ArrayList<>(windowHandles);
		base.driver.switchTo().window(windowStrings.get(index));
		Thread.sleep(2000);
	}

	//get text of last element from list
	public String get_last_element(By element) {
		List<WebElement> lists = base.driver.findElements(element);
		WebElement LastElement = Iterables.getLast(lists);
		String getLastElement = LastElement.getText();
		return getLastElement;
	}

	//click on checkbox 
	public void click_checkbox(WebElement element) {
		element.click();
	}

	//click on radio button
	public void click_radiobutton(WebElement element) {
		element.click();
	}

	//verify mouse over dropdown using visible text
	public void verify_mouse_hover_dropdown_text(By element, String mouse_over_dropdown_value) {
		SoftAssert sa = new SoftAssert();
		List<WebElement> alloption = base.driver.findElements(element);
		for(WebElement select_li: alloption) {
			System.out.println(select_li.getText());
			if(select_li.getText().equalsIgnoreCase(mouse_over_dropdown_value)) {
				sa.assertEquals(select_li.getText(), mouse_over_dropdown_value);
				break;
			}
		}
		sa.assertAll();
	}

	//implicitly wait used in starting of script to get element
	public void implicit_wait() {
		base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//page load timeout
	public void page_load_timeout() {
		base.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	//browser navigate backword
	public void browser_navigate_backword() {
		base.driver.navigate().back();
	}

	//browser navigate forward
	public void browser_navigate_forward() {
		base.driver.navigate().forward();
	}

	//browser navigate refresh
	public void browser_refresh() {
		base.driver.navigate().refresh();
	}

	//getting Current date and time
	public String gettingDateAndTime() {
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		return df.format(dateobj);
	}

	//upload file method with two argument
	public static void setClipboardData(String fileLocation, String filename) {
		StringSelection stringSelection = new StringSelection(setupYourPath(fileLocation).getAbsolutePath()+"\\"+filename);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	//Call this function while setup your path 
	public static File setupYourPath(String fileLocation)
	{
		File datadir=new File(fileLocation);
		try
		{
			if(!datadir.exists())
			{
				datadir.mkdir();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return datadir;
	}

	//upload file method with two argument 
	public void uploadFile(String fileLocation, String filename) {
		SoftAssert sa = new SoftAssert();
		try {
			// Setting clipboard with file location
			setClipboardData(fileLocation, filename);
			RobotClass();
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		sa.assertAll();
	}

	//upload file method with two argument
	public void RobotClass() throws Exception {
		// native key strokes for CTRL, V and ENTER keys
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
	}

	// Getting list of element and compare with Hard-coded value from
	public String FindTheRequiredStringFromAList(By by, String search) {
		int count = 0;
		SoftAssert sa = new SoftAssert();
		List<WebElement> elements = base.driver.findElements(by);
		for (WebElement webElement : elements) {
			String string = webElement.getText();
			if (string.equals(search)) {
				sa.assertEquals(string, search, string);
				System.out.println(string);
				sa.assertAll();
				count++;
				break;
			}
		}
		return search;
	}

	//trim string after dot.
	public String trim_string_using_dot(String value) {
		String str = value;
		String[] res = str.split("[.]");
		String part1 = res[0].trim();
		return part1;
	}

	//click on last element
	public void ClickOnLastElementFromList(By Element) {
		List<WebElement> webElements = base.driver.findElements(Element);
		WebElement GetLastElement = Iterables.getLast(webElements);
		GetLastElement.click();
	}

	//trim string after space.
	public String trim_string_using_space(String value) {
		String str = value;
		String[] res = str.split("[ ]");
		String part1 = res[0].trim();
		return part1;
	}

	//switch iframe using webelement
	//use xpath in this way - //iframe[@title='titleName']
	public void switch_frame_using_webelement(By element) {
		WebElement frame_element = base.driver.findElement(element);
		base.driver.switchTo().frame(frame_element);
	}

	//back to main window after taking action on iframe
	public void back_to_mainwindow_after_iframe() {
		base.driver.switchTo().defaultContent();
	}

	// create folder automatically and pass absolute folder path
	public static String createAFolderForDownload() {
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		System.out.println(folder.getAbsolutePath());
		String downloadFilepath = folder.getAbsolutePath();
		return downloadFilepath;
	}

	// delete created folder from project
	public void delete_folder(String folderpath) {
		System.out.println("folder path:" + folderpath);
		for (File file : folder.listFiles()) {
			file.delete();
		}
		folder.delete();
	}

	//this method is used to verify extension of download file
	// how to use code in our script - is_file_downloaded_ext(gl.downloadFilepath, "csv")
	//how to assert download file - gl.assert_true_method(gl.is_file_downloaded_ext(gl.download_file_path, "csv"), "checking file download is successfully");
	public boolean is_file_downloaded_ext(String dirPath, String ext) throws InterruptedException{
		boolean flag=false;
		File dir = new File(dirPath);
		Thread.sleep(2000);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			flag = false;
			System.out.println("file is not downloading in folder");
		}
		for (int i = 0; i < files.length; i++) {
			int a = files.length;
			//System.out.println(a);
			if(files[i].getName().contains(ext)) {
				//String s = file
				System.out.println("file is downloaded successfully");
				flag=true;
			}
		}
		return flag;
	}

	//assert actual result with expected result
	public void assert_true_method(boolean condition) {
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(condition);
		sa.assertAll();
	}
}
