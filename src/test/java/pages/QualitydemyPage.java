package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {
    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(id="login-email")
    public WebElement kullaniciEmailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "(//div[@class='form-group'])[3]")
    public WebElement loginButonu;
    @FindBy(xpath = "//div[@class='cookieButton']")
    public WebElement cookieButonu;


    @FindBy(linkText = "My courses")
    public WebElement basariliGirisCoursesLinki;
}
