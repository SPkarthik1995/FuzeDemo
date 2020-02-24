package com.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver;
	
	public static WebDriver launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "J:\\Learnings\\workspace\\exercise_1\\FuzeLogin\\driver\\chromedriver.exe");
	    return driver= new ChromeDriver();
	}
	public void loadUrl(String url) {
         driver.get(url);
	}
	public void maxi() {
       driver.manage().window().maximize();
	}
	
	public void type(WebElement e,String name) {
		e.sendKeys(name);
	}

	public void btnClick(WebElement c) {
	    c.click();
    }

	public static void SelectValue(WebElement w,String s)
	{
		Select se=new Select(w);
		se.selectByValue(s);
	}
	public static void SelectIndex(WebElement w,int n)
	{
		Select se=new Select(w);
		se.selectByIndex(n);
	}
	public static void SelectText(WebElement w,String s)
	{
		Select se=new Select(w);
		se.selectByVisibleText(s);
	}


}
