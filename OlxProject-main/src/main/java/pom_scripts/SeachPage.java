package pom_scripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeachPage extends BasePage {
	
	public SeachPage(WebDriver driver) {
		super(driver);
	}

	 @FindBy(xpath="//span[text()='Use current location']")
	   WebElement CurrentLocation;
	    public void Click_CurrentLocation() {    	
	    	clickAction(CurrentLocation);
	    }
	    
	    
	    public void waitStmnt() throws InterruptedException {
	    	Thread.sleep(2000);
	    }
	    
	    
	    @FindBy(xpath="//input[@placeholder='Search city, area or locality']")
	    WebElement LocationTF;
	    public void Click_LocationTF() {
	    	clickAction(LocationTF);
	    }
	    
	    
	    @FindBy(xpath="//input[@placeholder='Search city, area or locality']")
	    WebElement LocationTF1;
	    public void enterValueInlocationTF(String Location) {
	    	enter_value(LocationTF1, Location);
	    }
	    
	    @FindBy(xpath="//div[@class='_3_Rdm'][3]//div[@class='_1lcFr']")
	    WebElement Loc;
	    public void Click_Loc() {
	    	clickAction(Loc);
	    }
	    
	    
	    @FindBy(xpath="//input[@placeholder='Find Cars, Mobile Phones and more...']")
	    WebElement SearchTF;
	    public void enterValueInSearchTF(String Validdata) {
	    	enter_value(SearchTF, Validdata);
	    }
	    
	    
	    @FindBy(xpath="//div[@data-aut-id='btnSearch']")
	    WebElement SearchBtn;
	    public void Click_SearchBttn() {
	    	clickAction(SearchBtn);
	       }
	    
	    @FindBy(xpath="(//div [@class='_1ZtQp'])//span[text()='English']")
	    WebElement SelectLang;
	    public void Click_SelectLang() {
	    	clickAction(SelectLang);
	       }
	    
	    
	    @FindBy(xpath="(//span[text()='English'])[2]")
	    WebElement SelectEng;
	    public void Click_SelectLang1() {
	    	clickAction(SelectEng);
	       }
	    
	    
	    
	    @FindBy(xpath="(//div[@class='_dybr']//ul)//li[2]")
	    WebElement SelectHindi;
	    public void Click_SelectLang2() {
	    	clickAction(SelectHindi);
	       }
	    
	    
	    @FindBy(xpath="//span[@data-aut-id='item-location']")
	    List<WebElement> links;
	    public void Verify_Data(String Location) throws InterruptedException {
	    	
	   	 
	   	 for (WebElement webElement : links) {
	   	       if(webElement.getText().contains(Location))
	   	       {
	   	    	   webElement.click();
	   	    	   Thread.sleep(2000);
	   	    	   break;
	   	        }
	    }
	    }
}
