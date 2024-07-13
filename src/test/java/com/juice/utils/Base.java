package com.juice.utils;

import org.openqa.selenium.WebDriver;

/*
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
*/

public class Base {
	public static WebDriver driver;
	public static int TIME_OUT = 15;
	public String REG_URL= "https://juice-shop.herokuapp.com/#/register";
	public String LOG_URL= "https://juice-shop.herokuapp.com/#/login";
	public String ADS_URL= "https://juice-shop.herokuapp.com/#/address/saved";
	public String PAY_URL= "https://juice-shop.herokuapp.com/#/saved-payment-methods";
	public String PRO_URL= "https://juice-shop.herokuapp.com/#/search";
	public String DLV_URL= "https://juice-shop.herokuapp.com/#/address/select";
	public String HTR_URL= "https://juice-shop.herokuapp.com/#/order-history";	
	
	/*
	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeMethod
	public void startReport() {
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/extentreport/reporte.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}
	@AfterTest
	public void makeReport() {
		extent.flush();
	}*/
	
	
}
