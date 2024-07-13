package com.juice.stepDefinitionsTest;
import java.lang.Thread;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.juice.factory.LoginFactory;
import com.juice.factory.PaymentFactory;
import com.juice.pages.AddressPage;
import com.juice.pages.RegisterPage;
import com.juice.pages.PurchasePage;
import com.juice.utils.Base;
import com.juice.utils.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepsGeneralUser extends Base{
	
	
	protected LoginFactory loginFactory = new LoginFactory(driver);
	protected PaymentFactory paymentFactory = new PaymentFactory(driver);
	protected AddressPage addressPage= new AddressPage();	
	protected RegisterPage registerPage = new RegisterPage();
	protected PurchasePage purchasePage = new PurchasePage();
	
	
	protected Hooks hooks;
		
	
	public StepsGeneralUser(Hooks hooks) {
		this.hooks = hooks;
	}
	
	/*************SCENARIO 1***************/
	@Given("page of register is all ready")
	public void page_of_register_is_all_ready() {
		driver.get(REG_URL);
	}

	@When("user enters information of account {string} and {string} and {string} and {string}")
	
	public void user_enters_information_of_account_and_and_and(String email, String password, String repassword, String secretword) throws InterruptedException {
		new Actions(driver)
        .keyDown(Keys.ESCAPE)
        .keyUp(Keys.ESCAPE)
        .perform();
		
	    registerPage.fillOutForm(email, password, repassword, secretword);
	    registerPage.clicOnRegister();
	}

	@Then("user can see his login page")
	public void user_can_see_his_login_page() {
		
		String expected_title = "Login";
		String real_title = loginFactory.LblTitleLogin.getText();
	   
		new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginButton")));		
		Assert.assertEquals(real_title, expected_title, "Resultado");	
		System.out.println(real_title);
	}
		

	/*************SCENARIO 2***************/
	 
	@Given("page of login is all ready")
	public void page_of_login_is_all_ready() {
		driver.get(LOG_URL);
	}

	@When("user enters credentials {string} and {string}")
	public void user_enters_credentials_and(String email, String password) {
		
		new Actions(driver)
        .keyDown(Keys.ESCAPE)
        .keyUp(Keys.ESCAPE)
        .perform();
		
		loginFactory.fillOutForm(email, password);
		loginFactory.clicOnLogin();
		
	}
	  
	@Then("user can see a message")
	public void user_can_see_a_message() {
						
		new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[1]/div[1]")));		
	
		String expected_seccion = "All Products";
	    String real_seccion =  driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[1]/div[1]")).getText();
	    	    
		Assert.assertEquals(real_seccion, expected_seccion, "Resultado");	
		System.out.println(real_seccion);	
		
	}
		
	/*************SCENARIO 3***************/
	        
	@Given("page of create address is all ready")
	public void page_of_create_address_is_all_ready() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
		driver.get(ADS_URL);		
	}

	@When("user enters information from address {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enters_information_from_address(String pais, String nombre, String telefono, String postal, String direccion, String distrito, String ciudad ) throws InterruptedException {
		
		new Actions(driver)
        .keyDown(Keys.ESCAPE)
        .keyUp(Keys.ESCAPE)
        .perform();
		
		addressPage.fillOutForm(pais, nombre, telefono, postal, direccion, distrito, ciudad);
		addressPage.clicOnAddress();		
	}
		       
	@Then("user can see his new address")
	public void user_can_see_his_new_address() {
		
		new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-address/div/app-address/mat-card/mat-table/mat-row/mat-cell[2]")));		
	
		String expected_address = "Peru";
	    String real_address =  driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-address/div/app-address/mat-card/mat-table/mat-row/mat-cell[3]")).getText();
	    	    
		Assert.assertEquals(real_address, expected_address, "Resultado");	
		System.out.println(real_address);	
	}		
		
	/*************SCENARIO 4***************/

	@Given("page of method payment is all ready")
	public void page_of_method_payment_is_all_ready() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
		driver.get(PAY_URL);	
			
	}
  	      
	@When("user enters information from method payment {string} and {string}")
	public void user_enters_information_from_first_payment_and(String nombre, String number) throws InterruptedException {
		
		Thread.sleep(2000);
		paymentFactory.btnNewPay.click();
		
		if(paymentFactory.inputTxtNombre.isDisplayed()){			
		paymentFactory.fillOutForm(nombre, number);
		paymentFactory.clicOnPay();
		}else {
		paymentFactory.btnNewPay.click();
		paymentFactory.fillOutForm(nombre, number);
		paymentFactory.clicOnPay();
		}					
	}
	
	@Then("user can see his method payment")
	public void user_can_see_his_method_payment() {
		
		new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div[1]/mat-table/mat-row/mat-cell[1]")));		
	
		String expected_card = "************3456";
	    String real_card =  driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div[1]/mat-table/mat-row/mat-cell[1]")).getText();
	    	    
		Assert.assertEquals(real_card, expected_card, "Resultado");	
		System.out.println(real_card);	
	}	
	
	
	/*************SCENARIO 5***************/
		
	@Given("page of product search is all ready")
	public void page_of_product_search_is_all_ready() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
		driver.get(PRO_URL);	
	}
	
	@When("user select the tree products to pay {string} and {string} and {string}")
	public void user_select_the_tree_products_to_pay_and_and(String string, String string2, String string3) throws InterruptedException {
		purchasePage.searchApple();
		purchasePage.searchBanana();
		purchasePage.searchShirt();
	}	
	
	@When("user select second address with delivery type")
	public void user_select_second_address_with_delivery_type() {
		driver.get(DLV_URL);
		
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-select/div/app-address/mat-card/mat-table/mat-row[2]/mat-cell[1]/mat-radio-button/label/span[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-select/div/app-address/mat-card/button")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card/div[3]/mat-table/mat-row[3]/mat-cell[1]/mat-radio-button/label/span[1]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card/div[4]/button[2]")).click();	
	}
	
	@When("user select first method payment with order")
	public void user_select_first_method_payment_with_order() {
		
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-payment/mat-card/div/app-payment-method/div/div[1]/mat-table/mat-row[1]/mat-cell[1]/mat-radio-button/label/span[1]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-payment/mat-card/div/div[2]/button[2]")).click();
		driver.findElement(By.id("checkoutButton")).click();
	}
	
	@Then("user can see his purchase")
	public void user_can_see_his_purchase() {

		new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-order-completion/mat-card/div[2]/div/button/span[1]/mat-icon")));		
	
		String expected_confirm = "Thank you for your purchase!";
	    String real_confirm =  driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-order-completion/mat-card/div[1]/div/mat-card[1]/div/h1")).getText();
	    	    
		Assert.assertEquals(real_confirm, expected_confirm, "Resultado");	
		System.out.println(real_confirm);	
	}
	
	@After
	public void takeScreen5(Scenario scenario5){
		if(scenario5.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario5.attach(screenshot, "image/png", scenario5.getName());
			}
	}
	/*************SCENARIO 6 ***************/	
	
	@When("user select the random products to pay {string} and {string}")
	public void user_select_the_random_products_to_pay_and(String string, String string2) throws InterruptedException {
		purchasePage.selectProductRamdon();		
		purchasePage.selectProductRamdon();
	}
		
	/*************SCENARIO 7***************/	
	
	@Given("page of order history is all ready")
	public void page_of_order_history_is_all_ready() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
		driver.get(HTR_URL);
	}
	
	@When("user takes a screenshot of their purchases")
	public void user_takes_a_screenshot_of_their_purchases() {			
		
	}	
	
	@Then("user confirm their purchases")
	public void user_confirm_their_purchases() {
		

	}
	


}
