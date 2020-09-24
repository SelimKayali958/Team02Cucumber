package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class EbayAramaStepDefinitions {

    EbayPage ebayPage = new EbayPage();

    @Given("kullanici ebay gider")
    public void kullanici_ebay_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("ebayUrl"));
    }

    @Given("kullanici  tester kitabi arar")
    public void kullanici_tester_kitabi_arar() {
      ebayPage.ebayAramaKutusu.sendKeys(ConfigurationReader.getProperty("aranacakUrun")+ Keys.ENTER);
    }

    @Given("kullanici kitap sonucunu yazdirir")
    public void kullanici_kitap_sonucunu_yazdirir() {
        System.out.println(ebayPage.ebaySonuc.getText());
    }

    @Then("kullanici driver kapatir")
    public void kullanici_driver_kapatir() {
        Driver.closeDriver();
    }


    @Given("kullanici ebay sonucu yazdirir")
    public void kullanici_ebay_sonucu_yazdirir() {
        System.out.println(ebayPage.ebaySonuc.getText());
    }


    @Given("kullanici {string} aramasi yapari")
    public void kullanici_aramasi_yapari(String string) {
        ebayPage.ebayAramaKutusu.sendKeys(string+Keys.ENTER);
    }









}
