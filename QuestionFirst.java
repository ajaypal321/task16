package com.task.sixteen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuestionFirst {
	public static void main(String[] args) {

		        // Set the path to the geckodriver executable
		        System.setProperty("webdriver.gecko.driver", "D://Driver//geckodriver.exe");

		        // Create an instance of FirefoxDriver
		        WebDriver driver = new FirefoxDriver();

		        // Maximize the browser window
		        driver.manage().window().maximize();

		        // Navigate to Google
		        driver.get("http://google.com");

		        // Print the URL of the current page
		        System.out.println("Current URL: " + driver.getCurrentUrl());

		        // Reload the page
		        driver.navigate().refresh();

		        // Close the browser
		        driver.quit();
		    }
		
	}


