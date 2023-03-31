package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MedunnaLoginPage
{
    public MedunnaLoginPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "[class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement GirisSecme;

    @FindBy(xpath = "(//*[text()='Register'])[1]")
    public WebElement RegisterSecme;

    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement administration;

    @FindBy(xpath = "//*[text()='Sign out']")
    public WebElement signOut;


    @FindBy(xpath = "//*[text()='User management']")
    public WebElement User_management;

    @FindBy(xpath = "//*[text()='Created date']")
    public WebElement Created_date;

    @FindBy(name = "ssn")
    public WebElement ssnInput;

    @FindBy(name = "roomNumber")
    public WebElement roomNumberinput;

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath="//*[text()='Sign in']")
    public WebElement signIn;
    @FindBy(xpath="(//*[text()='Sign in'])[3]")
    public WebElement signInGir;

    @FindBy(id="activated")
    public WebElement actived;

    @FindBy(id="jh-create-entity")
    public WebElement roomCreate;
    @FindBy(id="save-entity")
    public WebElement saveRoom;

    @FindBy(id="authorities")
    public WebElement selectDrop;

    @FindBy(xpath="//*[text()='Save']")
    public WebElement save;
    @FindBy(xpath="//*[text()='Created Date']")
    public WebElement sirala;

    @FindBy(xpath="//*[text()='Items&Titles']")

    public WebElement items;

    @FindBy(xpath="//*[text()='Room']")
    public WebElement room;

    @FindBy(xpath="//*[text()='Batch YüzÜç']")
    public WebElement batchGir;


    @FindBy(xpath="//*[@id='umitg']//td")
    public List<WebElement> LogBilgileriListe;

    @FindBy(xpath="//*[@id='umitg']//td//*[text()='Edit']")
    public WebElement edit;



}
