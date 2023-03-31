package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Room;
import utilities.ObjectMapper01;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class MedunnaStepDefinitions
{
    Response response;
    Room expectedData;
    Room actualData;
    @Given("user sends post request for room data")
    public void user_sends_post_request_for_room_data() {
        //Set the url
        spec.pathParams("first","api","second","rooms");

        //Set the expected data
        expectedData = new Room("Api'dan yeni oda",123, (int) (Math.random()*10000),"TWIN",true);

        //Send the request and get the response
        response = given(spec).body(expectedData).post("{first}/{second}");
        actualData= ObjectMapper01.convertToJson(response.asString(),Room.class);


        response.prettyPrint();
    }
    @Then("user gets the room data and assert")
    public void user_gets_the_room_data_and_assert() {
        Assert.assertEquals(201,response.statusCode());
        Assert.assertEquals(expectedData.getRoomNumber(),actualData.getRoomNumber());
        Assert.assertEquals(expectedData.getPrice(),actualData.getPrice());
    }
    /*


   */
}
