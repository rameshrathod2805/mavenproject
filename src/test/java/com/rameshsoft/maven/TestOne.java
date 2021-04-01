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
		System.out.println("test one is modified");
		System.out.println("modify one again");
		System.out.println("p2 is modify");		
		System.out.println("p1 modified");

		Thread.sleep(2000);
		dr.close();
	}
}
