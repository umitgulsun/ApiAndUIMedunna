package stepdefinitions.apistepdefinitions;

import base_urls.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Room;

import java.util.List;

//import static base_urls.MedunnaBaseUrl.spec;
import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class RoomGetStepdefs
{
    Room actualData;
    List<String> descriptionListe;
    @Given("user sends get request for room data")
    public void userSendsGetRequestForRoomData()
    {

        spec.pathParams("first","api","second","rooms").
                queryParam("sort","createdDate,desc");
        Response response= given(spec).get("{first}/{second}");
        //response.prettyPrint();
        JsonPath jsonPath=response.jsonPath();
        descriptionListe=jsonPath.getList("description");
        System.out.println(descriptionListe);
        System.out.println("hosbulduk");
    }

    @Then("room data and assert")
    public void roomDataAndAssert()
    {
        Assert.assertTrue(descriptionListe.contains("Hosgeldin Ramazan"));
    }
}
