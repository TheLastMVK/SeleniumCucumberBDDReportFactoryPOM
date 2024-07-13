package com.juice.pages;

import org.openqa.selenium.By;

import com.juice.utils.Base;

public class RegisterPage extends Base {
	
	/* Web elements locators*/	
    By inputTxtEmail = By.id("emailControl");
    By inputTxtPassword = By.id("passwordControl");
    By inputTxtRepeat = By.id("repeatPasswordControl");
    By DwnBoxQuestion = By.xpath("(//span[contains(@class,'mat-select-min-line')])[1]");
    By inputOptionQuestion = By.xpath("/html/body/div[3]/div[2]/div/div/div/mat-option[5]/span");
    By inputTxtResponse = By.id("securityAnswerControl");
    By BtnSumbitRegister = By.id("registerButton");	
    
	/* Constructor*/
    public void fillOutForm(String email, String password, String repassword, String secretword) throws InterruptedException {
    	driver.findElement(inputTxtEmail).sendKeys(email);
    	driver.findElement(inputTxtPassword).sendKeys(password);
    	driver.findElement(inputTxtRepeat).sendKeys(repassword);
    	driver.findElement(inputTxtResponse).sendKeys(secretword);
    	Thread.sleep(1000);
    	driver.findElement(DwnBoxQuestion).click();
    	Thread.sleep(1000);
    	driver.findElement(inputOptionQuestion).click();
    	driver.findElement(inputTxtResponse).click();
    } 
    
    public void clicOnRegister() {
    	driver.findElement(BtnSumbitRegister).click();    	
    }
	/* Metodos */	

}
