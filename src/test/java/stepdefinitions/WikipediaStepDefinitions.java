package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.WikipediaPage;
import utilities.Driver;

public class WikipediaStepDefinitions {

   WikipediaPage wikipediaPage = new WikipediaPage();


    @Given("kullanici wikipedia {string} sayfasina gider")
    public void kullanici_wikipedia_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici wikipedia dropdownda dil {string} secer")
    public void kullanici_wikipedia_dropdownda_dil_secer(String string) {
        Select select = new Select(wikipediaPage.wikipediaDropdown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici farkli dillerde {string} arar")
    public void kullanici_farkli_dillerde_arar(String string) {
        wikipediaPage.wikipediaAramaKutusu.sendKeys(string+ Keys.ENTER);
    }

    @Given("kullanici sayfa basligini yazdirir")
    public void kullanici_sayfa_basligini_yazdirir() {
        System.out.println(Driver.getDriver().getTitle());
    }

    @Then("kullanici wikipedia sayfasini kapatir")
    public void kullanici_wikipedia_sayfasini_kapatir() {
        Driver.closeDriver();
    }



}
