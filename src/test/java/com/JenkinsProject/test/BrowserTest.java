package com.JenkinsProject.test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	
	@Test
	public void CLead() {
		//System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver 85.0.4183.87\\chromedriver.exe");
		
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver=new ChromeDriver();
		System.out.println("===============    Launch the browser  ===============       ");
		
		
		//Launch the browser 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
						
		System.out.println("======== You are on Google Home page ===========");
		
		driver.close();
		
		System.out.println("======== Browse closed  ===========");
		

	}

}
