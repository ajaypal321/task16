package com.task.sixteen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionThird {

	public static void main(String[] args) {
		//set the path a the chromediver
		System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		
// instance of chromedriver 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		//maximize the browser window
		driver.manage().window().maximize();
		// Find the search input field and enter the search query
		WebElement searchInput= driver.findElement(By.name("search"));
		 searchInput.sendKeys("Artificial Intelligence");
		  // Submit the search form
	        searchInput.submit();
	     // Click on the "History" section link in the search results
	        WebElement historyLink = driver.findElement(By.xpath("(//a[@href='/wiki/History_of_artificial_intelligence'][normalize-space()='History'])[1]"));
	        historyLink.click();
	        
	        // Print the title of the section
	        WebElement sectionTitle = driver.findElement(By.id("firstHeading"));
	        System.out.println("Section Title: " + sectionTitle.getText());

	
		// close 
		driver.close();
		

	}

}
//result
////Section Title: History of artificial intelligence
