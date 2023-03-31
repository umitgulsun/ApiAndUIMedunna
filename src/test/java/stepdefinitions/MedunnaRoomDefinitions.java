package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MedunnaLoginPage;
import utilities.Driver;

import java.time.Duration;

public class MedunnaRoomDefinitions
{
    MedunnaLoginPage medunnaLoginPage=new MedunnaLoginPage();
    public static int roomNumberRandom= Faker.instance().number().numberBetween(1000,100000);

    @When("item ögesine tiklar")
    public void item_ögesine_tiklar() {
        medunnaLoginPage.items.click();
    }

    @When("Room linkine tiklar")
    public void room_linkine_tiklar() {
        medunnaLoginPage.room.click();
    }

    @And("Room olustura tiklar")
    public void roomOlusturaTiklar()
    {
        medunnaLoginPage.roomCreate.click();
    }

    @And("Room input a roomnumber girer")
    public void roomInputARoomnumberGirer() throws InterruptedException
    {
        medunnaLoginPage.roomNumberinput.sendKeys(roomNumberRandom+"", Keys.TAB,
                "SUITE",Keys.TAB,Keys.SPACE,Keys.TAB,"1500",Keys.TAB,"Hosgeldin Ramazan");
        Driver.clickWithJS(medunnaLoginPage.saveRoom);
        Thread.sleep(10000);
        Driver.clickWithJS(medunnaLoginPage.sirala);
    }
}
