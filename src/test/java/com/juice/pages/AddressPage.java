package com.juice.pages;

import org.openqa.selenium.By;

import com.juice.utils.Base;

public class AddressPage extends Base {

	/* Web elements locators*/	
    By BtnFormAddress = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-address/div/app-address/mat-card/div/button/span[1]");
    By inputTxtPais = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[1]/div/div[1]/div[3]/input");
    By inputTxtNombre = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[2]/div/div[1]/div[3]/input");
    By inputTxtTelefono = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[3]/div/div[1]/div[3]/input");
    By inputTxtPostal = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[4]/div/div[1]/div[3]/input");
    By inputTxtDireccion = By.xpath("//*[@id=\"address\"]");
    By inputTxtDistrito = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[6]/div/div[1]/div[3]/input");
    By inputTxtCiudad = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[7]/div/div[1]/div[3]/input");
    By BtnSumbitAddress = By.id("submitButton");	

        
	/* Constructor*/
    public void fillOutForm(String pais, String nombre, String telefono, String postal, String direccion, String distrito, String ciudad) throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(BtnFormAddress).click();
    	driver.findElement(inputTxtPais).sendKeys(pais);
    	driver.findElement(inputTxtNombre).sendKeys(nombre);
    	driver.findElement(inputTxtTelefono).sendKeys(telefono);
    	driver.findElement(inputTxtPostal).sendKeys(postal);
    	driver.findElement(inputTxtDireccion).sendKeys(direccion);
    	driver.findElement(inputTxtDistrito).sendKeys(distrito);
    	driver.findElement(inputTxtCiudad).sendKeys(ciudad);
    }   
    
    /* Metodos */	
    public void clicOnAddress() {
    	driver.findElement(BtnSumbitAddress).click();
    	
    }
	

	
}
