package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayPage {

    public EbayPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "gh-ac")
    public WebElement ebayAramaKutusu;

    @FindBy (xpath = "//h1[@class='srp-controls__count-heading']")
    public WebElement ebaySonuc;




}
