package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.SeachPage;



public class Olx_TC_01 extends Base_Test{
	
	@Test(dataProvider = "testData")
	public void test(String Validdata) throws InterruptedException  {        
       SeachPage Sp = new SeachPage(driver);       
        Sp.Click_LocationTF();		
		Thread.sleep(1000);	    
		Sp.Click_CurrentLocation();		 
		Sp.enterValueInSearchTF(Validdata);	
		Sp.waitStmnt();
		
		Sp.Click_SearchBttn();
		
		Sp.Click_SelectLang();
		Thread.sleep(1000);
		Sp.Click_SelectLang1();		
		
		Sp.Click_SelectLang();
        Thread.sleep(1000);
        Sp.Click_SelectLang2();
        
        
	}
	
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Olx_TC_01");
		return testdata;
	}

}
