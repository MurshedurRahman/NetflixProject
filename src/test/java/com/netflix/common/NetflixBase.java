package com.netflix.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetflixBase {
	 public WebDriver driver;
	 

		public void launchBrowser() {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://netflix.com");
			driver.manage().window().maximize();
			

		}

		public void closeBrowser() {
			
			driver.close();

		}



}
