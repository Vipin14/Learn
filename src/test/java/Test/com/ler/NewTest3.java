package Test.com.ler;
import org.testng.annotations.Test;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		

public class NewTest3 {		
	    private WebDriver driver;
		@Test				
		public void testEasy() {	
			 	System.out.println("******************Vipin***************");
			 	Assert.assertEquals("Hello", "Hello");
		}	
		@Test
		public void beforeTest() {	
			System.out.println("******************Vipin***************");
		 	Assert.assertEquals("ave", "ave"); 
		}		
		@Test
		public void afterTest() {
			System.out.println("******************Vipin***************");
		 	Assert.assertEquals("Hello", "Hello");	
		}		
}	
