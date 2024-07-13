package com.juice.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentFactory {

	/* Web elements locators*/	
	@FindBy(xpath = "/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/mat-expansion-panel-header/span[1]")
	public WebElement btnNewPay;
	
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[1]/div/div[1]/div[3]/input")
	public WebElement inputTxtNombre;
	
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[2]/div/div[1]/div[3]/input")
	public WebElement inputTxtNumero;
	
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[3]/div/div[1]/div[3]/select")
	public WebElement dwnBoxMonth;	
	
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[3]/div/div[1]/div[3]/select/option[5]")
	public WebElement inputItemMonth;
	
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[4]/div/div[1]/div[3]/select")
	public WebElement dwnBoxYear;
	
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[4]/div/div[1]/div[3]/select/option[2]")
	public WebElement inputItemYear;	
	
	@FindBy(id="submitButton")
	public WebElement btnRegPay;		
	
    /* Constructor*/
	   public PaymentFactory(WebDriver driver) {
		 PageFactory.initElements(driver, this); 	
	  }
	   	
	/* Metodos */		
    public void fillOutForm(String nombre, String number) {    	
       	inputTxtNombre.sendKeys(nombre);
    	inputTxtNumero.sendKeys(number);
    	dwnBoxMonth.click();
    	inputItemMonth.click();
    	dwnBoxYear.click();
    	inputItemYear.click();
    }
    
    public void clicOnPay() {
    	btnRegPay.click();  	
    }
    
}
