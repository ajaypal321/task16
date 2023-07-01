package com.task.sixteen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuestionTWO {

	public static void main(String[] args) {
		//set the path a the chromediver
				System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");
				//System.setProperty("webdriver.http.factory", "jdk-http-client");
				
		// instance of chromedriver 
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.demoblaze.com/");
				
				//maximize the browser window
				driver.manage().window().maximize();
				 
				if (driver.getTitle().equals("STORE")) {
				System .out.println("we have landed th correct website");
				
				}else{
					System.out.println("we have not landed the correct website");
				}
				// close 
				driver.close();
				

	}

}
// RESULT
//we have landed th correct website