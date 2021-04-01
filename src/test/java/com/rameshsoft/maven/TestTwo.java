package com.rameshsoft.maven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTwo {

	@Test
	public  void demo2() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rameshsoft.com");
		System.out.println("navigated  to rameshsoft");
		Thread.sleep(2000);
		driver.close();
		
		
		/*String a = "  java selenium  ";
		String b = a.trim();
		System.out.println(b);
		
		char[] ch = b.toCharArray();
		for(Object obj : ch) {
			System.out.println(obj);
		}
		
		
		
		String[] s = b.split(" ");
		
		for(Object sp : s) {
			System.out.println(sp);
		}*/
		
		
		/*FileInputStream fip  = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\mavenprojrectapp\\src\\test\\java\\com\\rameshsoft\\maven\\Or_file.properties");
		Properties properties =new Properties();
		properties.load(fip);
		
		String val = properties.getProperty("url");
		
		Set keys = properties.keySet();
		
		for(Object obj : keys) {
			String key = (String) obj;
			String value = properties.getProperty(key);
			System.out.println(key+"******"+value);
			
		}*/
		
		/*FileInputStream fip = new FileInputStream("");
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet = workbook.getSheet("");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		if (cell.getCellType()==CellType.STRING) {
			
		}*/
		
		
		/*File file = new File("C:\\Users\\user\\eclipse-workspace\\mavenprojrectapp\\src\\test\\java\\com\\rameshsoft\\maven\\text.txt");
		boolean status = file.createNewFile();
		if (status) {
			System.out.println("file got created");
		}
		else {
			System.out.println("returning excisting file");
		}
		
		FileReader fr= new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(br.ready()) {
			String d = br.readLine();
			System.out.println(d);
		}*/
		
				
				
				
	
		/*FileWriter fr = new FileWriter(file);
		BufferedWriter br = new BufferedWriter(fr);
		
		br.write("rathod");
		br.newLine();
		br.write("year");
		br.flush();
		br.close();*/
	}
	
}
