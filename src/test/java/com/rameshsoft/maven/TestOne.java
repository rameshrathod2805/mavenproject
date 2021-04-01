package com.rameshsoft.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOne {
	@Test
	public void demo() throws InterruptedException {
		System.out.println("test");
		
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.gmail.com");
		Thread.sleep(2000);
		dr.close();
	}
}