package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiburadaPage {

    public HepsiburadaPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy (xpath = "//input[@type='text']")
    public WebElement hepsiburadaAramaKutusu;

    @FindBy (xpath = "//div[@class='category-suggestion-title']")
    public WebElement hepsiburadaSonuc;

}
