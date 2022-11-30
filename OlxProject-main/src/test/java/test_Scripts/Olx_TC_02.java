package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.SeachPage;

public class Olx_TC_02 extends Base_Test {

	@Test(dataProvider = "testData")
	public void test(String Location, String Validdata ) throws InterruptedException {

		SeachPage Sp1 = new SeachPage(driver);
		
		 Sp1.Click_LocationTF(); 
		 Thread.sleep(1000);
		 
		Sp1.enterValueInlocationTF(Location);
		Thread.sleep(1000);
		Sp1.Click_Loc();
		Sp1.enterValueInSearchTF(Validdata);
		Sp1.waitStmnt();
		Sp1.Click_SearchBttn();
		Thread.sleep(1000);
		Sp1.Click_SelectLang();
		Thread.sleep(1000);
		Sp1.Click_SelectLang1();

		Sp1.Click_SelectLang();
		Thread.sleep(1000);
		Sp1.Click_SelectLang2();	

	}

	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException {
		Object[][] testdata = ReadExcel.getMultipleData("Olx_TC_02");
		return testdata;
	}

}
