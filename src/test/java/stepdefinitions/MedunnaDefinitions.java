package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunnaDefinitions
{
    MedunnaLoginPage medunnaLoginPage=new MedunnaLoginPage();

    @When("Register alanına tıklar")
    public void register_alanına_tıklar() {
        medunnaLoginPage.GirisSecme.click();
        medunnaLoginPage.RegisterSecme.click();
    }

    @When("Kullanıcı bilgilerini girer")
    public void kullanıcı_bilgilerini_girer() {
        medunnaLoginPage.ssnInput.sendKeys("354-22-5544", Keys.TAB, "umit",Keys.TAB,
                "ali",Keys.TAB,"umitg",Keys.TAB,"umit.gulsun01.0134@gmail.com",Keys.TAB,
                "Pl1234567.",Keys.TAB,"Pl1234567.",Keys.TAB,Keys.ENTER);
    }


    @And("Signin alanına tıklar")
    public void signinAlanınaTıklar()
    {
        medunnaLoginPage.GirisSecme.click();
        medunnaLoginPage.signIn.click();
    }

    @And("Sign in bilgilerini girer")
    public void signInBilgileriniGirer()
    {
        medunnaLoginPage.username.sendKeys("batch_yuzuc",Keys.TAB,"Batch.103",Keys.TAB,
                Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
    }

    @And("Admimistration alanına tıklar")
    public void admimistrationAlanınaTıklar()
    {
        medunnaLoginPage.administration.click();
    }

    @And("User Manage alanına tıklar")
    public void userManageAlanınaTıklar()
    {
        medunnaLoginPage.User_management.click();
    }

    @And("Acılan sayfada date alanına tıklayıp sıralar")
    public void acılanSayfadaDateAlanınaTıklayıpSıralar()
    {
        medunnaLoginPage.Created_date.click();
    }

    @And("Login olunan satır active yapılır")
    public void loginOlunanSatırActiveYapılır() throws InterruptedException
    {
        medunnaLoginPage.edit.click();
        Thread.sleep(5000);
        Driver.clickWithJS(medunnaLoginPage.actived);
        Select sec=new Select(medunnaLoginPage.selectDrop);
        sec.selectByIndex(0);
        Driver.clickWithJS(medunnaLoginPage.save);
    }

    @When("kullanici sayfasina gider")
    public void kullaniciSayfasinaGider()
    {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("giris alanına ve sign out linkine tıklar")
    public void girisAlanınaVeSignOutLinkineTıklar()
    {
        medunnaLoginPage.batchGir.click();
        medunnaLoginPage.signOut.click();

    }

    @And("giris alanına ve sign in linkine tıklar")
    public void girisAlanınaVeSignInLinkineTıklar()
    {
        medunnaLoginPage.GirisSecme.click();
        medunnaLoginPage.signIn.click();
    }

    @And("{string} ve {string} ile giris yapar")
    public void veIleGirisYapar(String arg0, String arg1)
    {
        medunnaLoginPage.username.sendKeys(arg0);
        medunnaLoginPage.password.sendKeys(arg1);
    }

    @Then("sign in linkine tıklar")
    public void signInLinkingTabular()
    {
        Driver.clickWithJS(medunnaLoginPage.signInGir);
        System.out.println("kullanıcı olusturuldu");
    }


}
