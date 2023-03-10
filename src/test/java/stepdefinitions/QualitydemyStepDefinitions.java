package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class QualitydemyStepDefinitions {

    QualitydemyPage qualitydemyPage= new QualitydemyPage();

    @Then("ilk sayfa login linkine click yapar")
    public void ilk_sayfa_login_linkine_click_yapar() {
        qualitydemyPage.ilkLoginLinki.click();
    }

    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String istenenUsername) {
        qualitydemyPage= new QualitydemyPage();

        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty(istenenUsername));

    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String istenenPassword) {
        qualitydemyPage= new QualitydemyPage();

        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(istenenPassword));
    }

    @Then("login butonuna basar")
    public void login_butonuna_basar() {

        qualitydemyPage.loginButonu.click();
    }
    @Then("cookie butonuna click yapar")
    public void cookieButonunaClickYapar() {
        qualitydemyPage.cookieButonu.click();
    }
    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {

        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
    }
    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }

    @And("kullanici kutusuna manuel olarak {string} yazar")
    public void kullaniciKutusunaManuelOlarakYazar(String username) {

        qualitydemyPage.kullaniciEmailKutusu.sendKeys(username);
    }

    @And("password kutusuna manuel olarak {string} yazar")
    public void passwordKutusunaManuelOlarakYazar(String password) {
        qualitydemyPage.passwordKutusu.sendKeys(password);
    }

    @And("login butonu uzerine gelir")
    public void loginButonuUzerineGelir() {

    }

}
