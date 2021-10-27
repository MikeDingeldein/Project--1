package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://webdrivers/chromedriver.exe");
		// remember the .exe 
			//and to put file in the folder

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080");


		// Locate the 2 input elements and button for adding numbers
		//ctrl +j to open webpage code and find ids. 
		WebElement addInput1 = driver.findElement(By.id("add1")); // Set id to match id in HTML index file
		WebElement addInput2 = driver.findElement(By.id("add2"));
		WebElement addButton = driver.findElement(By.id("addButton"));

		
		//send some numbers
		addInput1.sendKeys("24.8");
		addInput2.sendKeys("158.6");
		addButton.click();

		driver.switchTo().frame("addResult"); 
		// Switch into the inside of the iframe

		WebElement addOutput = driver.findElement(By.tagName("pre")); 
		// find the pre tag that the addition result is
		// embedded into inside of the iframe
		// can "pre" id be changed? seems strange.
		System.out.println(addOutput.getText()); 
		// print out the text of the output element

		driver.switchTo().defaultContent(); 
		// Switch back outside of the iframe
		// You must switch in and out of the iframes
		// driver.switchTo().parentFrame()

		// Locate the 2 input elements and button for subtracting numbers
		WebElement subInput1 = driver.findElement(By.id("sub1")); // Set id to match id in HTML index file
		WebElement subInput2 = driver.findElement(By.id("sub2"));
		WebElement subButton = driver.findElement(By.id("subButton"));

		subInput1.sendKeys("24.8");
		subInput2.sendKeys("158.6");
		subButton.click();

		driver.switchTo().frame("subResult"); 
		// Switch into the inside of the iframe

		WebElement subOutput = driver.findElement(By.tagName("pre")); 
		// find the pre tag that the addition result is embedded into inside of the iframe
		
		System.out.println(subOutput.getText()); 
		// print out the text of the output element

		driver.switchTo().defaultContent(); 
		// Switch back outside of the iframe

		// Locate the 2 input elements and button for multiplying numbers
		WebElement multInput1 = driver.findElement(By.id("mult1")); // Set id to match id in HTML index file
		WebElement multInput2 = driver.findElement(By.id("mult2"));
		WebElement multButton = driver.findElement(By.id("multButton"));

		multInput1.sendKeys("24.8");
		multInput2.sendKeys("158.6");
		multButton.click();

		driver.switchTo().frame("multResult"); 
		// Switch into the inside of the iframe

		WebElement multOutput = driver.findElement(By.tagName("pre")); 
		// find the pre tag that the addition result is
		// embedded into inside of the iframe
		
		System.out.println(multOutput.getText()); 
		// print out the text of the output element

		driver.switchTo().defaultContent(); 
		// Switch back outside of the iframe

		// Locate the 2 input elements and button for dividing numbers
		WebElement divInput1 = driver.findElement(By.id("div1")); // Set id to match id in HTML index file
		WebElement divInput2 = driver.findElement(By.id("div2"));
		WebElement divButton = driver.findElement(By.id("divButton"));

		divInput1.sendKeys("24.8");
		divInput2.sendKeys("158.6");
		divButton.click();

		driver.switchTo().frame("divResult"); 
		// Switch into the inside of the iframe

		WebElement divOutput = driver.findElement(By.tagName("pre")); 
		// find the pre tag that the addition result is
		// embedded into inside of the iframe
		
		System.out.println(divOutput.getText()); 
		// print out the text of the output element

		driver.switchTo().defaultContent();
		// Switch back outside of the iframe

		// to pause
		Thread.sleep(10000);

		// quit method

		driver.quit();

	}

}
