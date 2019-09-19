package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\windowhan\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++)
		{
			WebElement clmn = row.get(i);
		List<WebElement> dt=clmn.findElements(By.tagName("td"));
			for(int j=0;j<dt.size();j++)
			{
			WebElement	dat=dt.get(j);
			String text = dat.getText();
			if(text.equals("China"))
			{
			dt.get(4);
			System.out.println(text);
			
		
			}
			
		}
		}
	}
}
		
	
		
		
	


