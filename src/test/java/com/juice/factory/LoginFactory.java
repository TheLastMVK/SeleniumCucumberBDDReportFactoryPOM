package com.juice.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juice.utils.Base;

public class LoginFactory extends Base {

	/* Web elements locators*/	
	@FindBy(id = "email")
	public WebElement inputTxtEmail;
	
	@FindBy(id="password")
	public WebElement inputTxtPassword;
	
	@FindBy(id="loginButton")
	public WebElement BtnSumbitLogin;
	
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card/h1")
	public WebElement LblTitleLogin;
	
	
    /* Constructor*/
	   public LoginFactory(WebDriver driver) {
		 PageFactory.initElements(driver, this); 	
	  }
	   	
	/* Metodos */		
    public void fillOutForm(String email, String password) {    	
    	inputTxtEmail.sendKeys(email);
    	inputTxtPassword.sendKeys(password);
    }  
    
    public void clicOnLogin() {
    	BtnSumbitLogin.click();
    	inputTxtEmail.clear();
    	inputTxtPassword.clear();    	
    }
    
 
    
}
