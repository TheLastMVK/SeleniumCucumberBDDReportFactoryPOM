package com.juice.pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.juice.utils.Base;

public class PurchasePage extends Base {
	

	/* Web elements locators*/	
    By inputTxtBusqueda = By.id("mat-input-0");  
    By BtnLupaBusqueda = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/mat-search-bar/span/mat-icon[2]");
    By BtnSelectItem1= By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button");
    By BtnSelectItem2= By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile/div/mat-card/div[3]/button");
    By LblTitleProduct= By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[1]/div[1]");
                                 
    
    
	/* Constructor*/
    

    /* Metodos */       
    public void searchApple() throws InterruptedException {
    	Thread.sleep(2000);  	
    	driver.findElement(BtnLupaBusqueda).click();
    	driver.findElement(inputTxtBusqueda).sendKeys("apple");
    	driver.findElement(inputTxtBusqueda).sendKeys(Keys.ENTER);
    	driver.findElement(inputTxtBusqueda).clear();
		driver.findElement(BtnSelectItem1).click();  	
    }
    
    public void searchBanana() throws InterruptedException {
    	Thread.sleep(2000);  	
    	driver.findElement(BtnLupaBusqueda).click();
    	driver.findElement(inputTxtBusqueda).sendKeys("banana");
    	driver.findElement(inputTxtBusqueda).sendKeys(Keys.ENTER);
    	driver.findElement(inputTxtBusqueda).clear();
		driver.findElement(BtnSelectItem1).click();  	
    }   
    
    public void searchShirt() throws InterruptedException {
    	Thread.sleep(2000);  	
    	driver.findElement(BtnLupaBusqueda).click();
    	driver.findElement(inputTxtBusqueda).sendKeys("shirt");
    	driver.findElement(inputTxtBusqueda).sendKeys(Keys.ENTER);
    	driver.findElement(inputTxtBusqueda).clear();
		driver.findElement(BtnSelectItem1).click();  	
    }
 
    
    public void selectTipItem1() throws InterruptedException {
    	driver.findElement(inputTxtBusqueda).sendKeys(Keys.ENTER);
    	driver.findElement(inputTxtBusqueda).clear();
    	Thread.sleep(500);
		driver.findElement(BtnSelectItem1).click();  	
    }
    
    public void selectTipItem2() throws InterruptedException {
    	driver.findElement(inputTxtBusqueda).sendKeys(Keys.ENTER);
    	driver.findElement(inputTxtBusqueda).clear();
    	Thread.sleep(500);
		driver.findElement(BtnSelectItem2).click();  	
    }
    
    
    public void selectProductRamdon() throws InterruptedException {
    	
		Random random = new Random();		
		Integer product = random.nextInt(35)+1;
		
		Thread.sleep(500);
		driver.findElement(BtnLupaBusqueda).click();
		
		if(product.equals(1)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Apple Juice");
			selectTipItem1();			
		}
		if(product.equals(2)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Apple Pomace");
			selectTipItem1();
		}
		if(product.equals(3)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Banana Juice");
			selectTipItem1();
		}
		if(product.equals(4)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Best Juice Shop Salesman");
			selectTipItem2();
		}		 
		if(product.equals(5)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Carrot Juice");
			selectTipItem1();
		}	
		if(product.equals(6)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Eggfruit Juice");
			selectTipItem1();
		}	
		if(product.equals(7)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Fruit Press");
			selectTipItem1();
		}
		if(product.equals(8)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Green Smoothie");
			selectTipItem1();
		}
		if(product.equals(9)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Iron-Ons");
			selectTipItem1();
		}
		if(product.equals(10)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Lemon Juice");
			selectTipItem1();
		}
		if(product.equals(11)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Melon Bike");
			selectTipItem2();
		}
		if(product.equals(12)){	
			driver.findElement(inputTxtBusqueda).sendKeys("King of the Hill");
			selectTipItem2();
		}		
		if(product.equals(13)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop CTF Girlie-Shirt");
			selectTipItem1();
		}
		if(product.equals(14)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Card");
			selectTipItem2();
		}
		if(product.equals(15)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Coaster");
			selectTipItem2();
		}
		if(product.equals(16)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Holographic");
			selectTipItem2();
		}
		if(product.equals(17)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Hoodie");
			selectTipItem1();
		}
		if(product.equals(18)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Iron-Ons");
			selectTipItem1();
		}
		if(product.equals(19)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Logo");
			selectTipItem1();
		}	
		if(product.equals(20)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Magnets");
			selectTipItem1();
		}	
		if(product.equals(21)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Mug");
			selectTipItem1();
		}	
		if(product.equals(22)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Sticker Page");
			selectTipItem1();
		}	
		if(product.equals(23)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Sticker Single");
			selectTipItem1();
		}
		if(product.equals(24)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop T-Shirt");
			selectTipItem1();
		}
		if(product.equals(25)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop Temporary Tattoos");
			selectTipItem1();
		}		
		if(product.equals(26)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Juice Shop-CTF Velcro Patch");
			selectTipItem2();
		}	
		if(product.equals(27)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP SSL Advanced Forensic Tool");
			selectTipItem1();
		}	
		if(product.equals(28)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Snakes and Ladders - Mobile Apps");
			selectTipItem2();
		}		
		if(product.equals(29)){	
			driver.findElement(inputTxtBusqueda).sendKeys("OWASP Snakes and Ladders - Web Applications");
			selectTipItem1();
		}		
		if(product.equals(30)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Orange Juice");
			selectTipItem1();
		}	
		if(product.equals(31)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Pwning OWASP Juice Shop");
			selectTipItem1();
		}	
		if(product.equals(32)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Quince Juice");
			selectTipItem1();
		}	
		if(product.equals(33)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Raspberry Juice");
			selectTipItem1();
		}	
		if(product.equals(34)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Strawberry Juice");
			selectTipItem1();
		}
		if(product.equals(35)){	
			driver.findElement(inputTxtBusqueda).sendKeys("Woodruff Syrup");
			selectTipItem1();
		}	
    }	
	
}
