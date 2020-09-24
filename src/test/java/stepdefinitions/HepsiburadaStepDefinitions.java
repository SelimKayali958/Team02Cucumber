package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.HepsiburadaPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HepsiburadaStepDefinitions {

    HepsiburadaPage hepsiburadaPage = new HepsiburadaPage();


    @Given("kullanici hepsiburada sayfasina gider")
    public void kullanici_hepsiburada_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hepsiburadaUrl"));
    }

    @Given("kullanici {string} yapar")
    public void kullanici_yapar(String string) {
       hepsiburadaPage.hepsiburadaAramaKutusu.sendKeys(string+ Keys.ENTER);
    }


    @Given("kullanici urunlerin sonucunu yazdirir")
    public void kullanici_urunlerin_sonucunu_yazdirir() {
        System.out.println(hepsiburadaPage.hepsiburadaSonuc.getText());
    }

    @Then("kullanici sayfalari kapatir")
    public void kullanici_sayfalari_kapatir() {
        Driver.closeDriver();
    }



}
