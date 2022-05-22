package com.demo.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	public TestBase() {
		
		prop=new Properties();
		try {
			
			FileInputStream ip=new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\Demo\\src\\main\\java\\com\\demo\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();		}
	}
	
	


 public static void initialisation() {
	 
	 String browserName=prop.getProperty("browser");
	 if(browserName.equals("chrome")) {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Documents\\ChormeDriver\\chromedriver.exe");
		 driver=new ChromeDriver();
	 }
	 else if (browserName.equals("firefox")) {
		 System.setProperty("\"webdriver.gecko.driver","C:\\Users\\PC\\Documents\\ChormeDriver\\chromedriver.exe");
		 driver=new FirefoxDriver();


	}
	 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.get(prop.getProperty("url"));
	 
	 
 }
}