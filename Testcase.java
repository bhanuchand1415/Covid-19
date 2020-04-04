package com.bHaNuChand.Collection;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Testcase {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\Kbhanuchand eclipse2\\workspace2\\JavaProject\\chromedriver\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement srch=driver.findElement(By.name("q"));
		srch.sendKeys("selenium by ramesh");
		srch.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[text()='Selenium : Selenium WebDriver By Ramesh Anapati']")).click();
		java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
		int totalLinks =links.size();
		System.out.println("total links are "+totalLinks);
		int isdisplayed=0;
		int isEnabled= 0;
		Iterator itr =links.iterator();
		while (itr.hasNext()) {
			WebElement webElement=(WebElement) itr.next();
			if (webElement.isDisplayed()&& webElement.isEnabled()) {
				isdisplayed++;
			}
			else {
				isEnabled++;}}
		System.out.println(""+isdisplayed);
		System.out.println(""+isEnabled);

		int addLinks=isdisplayed+isEnabled;
		System.out.println("addlinks  "+addLinks);
		if (totalLinks==(addLinks)) {
			System.out.println("matching");

		} else {
			System.out.println("not matching");


		} 
	}
}
