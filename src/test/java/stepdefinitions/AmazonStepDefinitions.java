package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage= new AmazonPage();

    @Given("kullanici amazon sayfaya gider")
    public void kullaniciAmazonSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Nutella";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }



    @Then("amazon arama kutusuna Java yazip aratir")
    public void amazonAramaKutusunaJavaYazipAratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Java";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }
    @Then("amazon arama kutusuna Samsung yazip aratir")
    public void amazon_arama_kutusuna_samsung_yazip_aratir() {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Samsung" + Keys.ENTER);

    }
    @Then("arama sonuclarinin Samsung icerdigini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Samsung";

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

    }
    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {

        }
    }

    @Then("amazon arama kutusuna {string} yazip aratir")
    public void amazonAramaKutusunaYazipAratir(String aranacakKelime) {
        amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);
    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String arananKelime) {
        amazonPage= new AmazonPage();
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();


        Assert.assertTrue(actualAramaSonucu.contains(arananKelime));
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {
        amazonPage= new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("url de {string} oldugunu test eder")
    public void urlDeOldugunuTestEder(String arananKelime) {
        amazonPage= new AmazonPage();
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();


        Assert.assertTrue(actualAramaSonucu.contains(arananKelime));
    }
    @And("acilan tum sayfalari kapatir")
    public void acilanTumSayfalariKapatir() {
        Driver.quitDriver();
    }


    @Given("kullanici amazon anasayfaya gider")
    public void kullaniciAmazonAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
}