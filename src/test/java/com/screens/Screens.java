package com.screens;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;


public class Screens extends BaseClass {
	public Screens() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="main-item no-padding")
	private List<WebElement> demo;
	public List<WebElement> getDemo() {
		return demo;
	}
	
	}
