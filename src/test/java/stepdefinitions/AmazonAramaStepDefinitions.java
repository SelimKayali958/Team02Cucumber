package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonAramaStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
    }

    @Given("kullanici dropdown da Books secer")
    public void kullanici_dropdown_da_Books_secer() throws InterruptedException {
        Select select = new Select(amazonPage.amazonDropdown);
        select.selectByVisibleText("Books");
        Thread.sleep(3000);
    }

    @Given("kullanici qa automation aramasi yapar")
    public void kullanici_qa_automation_aramasi_yapar() {
        amazonPage.amazonAramaKutusu.sendKeys("qa automation"+ Keys.ENTER);

    }

    @Given("kullanici cikan sonucu yazdirir")
    public void kullanici_cikan_sonucu_yazdirir() {
       WebElement sonuc = Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonuc.getText());
    }

    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }




}
