package org.cts.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nakuri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\windowhan\\driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.amazon.in");
         WebElement src = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
         src.sendKeys("iphone xs");
         WebElement srch = driver.findElement(By.xpath("(//input[@class=\"nav-input\"])[1]"));
         srch.click();
         String pwid = driver.getWindowHandle();
         System.out.println(pwid);
         WebElement clk = driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-fixed-height\"])[1]"));
         clk.click();
         Set<String> cwid = driver.getWindowHandles();
         System.out.println(cwid);
                 for (String all : cwid) {
        	 if(!pwid.equals(all))
        		
        	 {
        		driver.switchTo().window(all); 
        	 }
			
		}
                 Thread.sleep(4000);
      WebElement kart = driver.findElement(By.xpath("(//input[@class=\"a-button-input\"])[3]"));
      kart.click();
         Thread.sleep(2000);
         driver.switchTo().window(pwid);
         Thread.sleep(2000);
         driver.navigate().back();
         WebElement trim = driver.findElement(By.xpath("(//div[@class=\"a-image-container a-dynamic-image-container\"])[1]"));
	trim.click();
	 Set<String> trmr = driver.getWindowHandles();
	 System.out.println(trmr);
	 for (String st : trmr) {
      
	  if(!trim.equals(st)) {
		  driver.switchTo().window(st);
	  }
		 
	}
	 	
	WebElement trimclik = driver.findElement(By.xpath("(//input[@class=\"a-button-input\"])[1]"));
	trimclik.click();
	Thread.sleep(2000);
	List <String> li = new ArrayList<String>();
	li.addAll(trmr);
String ss = li.get(1);	
	
	
		driver.switchTo().window(ss);
	}
}

