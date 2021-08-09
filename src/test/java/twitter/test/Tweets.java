package twitter.test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import twitter.pojo.TweetsPojo;

import static io.restassured.RestAssured.given;

public class Tweets {

    String bearerToken = "AAAAAAAAAAAAAAAAAAAAAE6ySQEAAAAA3ToLJ%2BFgkWdJENM%2BiaNXXq8X698%3D99ciWGcMZLdUpPbg1OdnlyoQDg78otmO9uDctpmSakZDnIbV2G";
    String myTwitterId = "108889445";
    String baseURI = "https://api.twitter.com";

    @Test
    public void getExample() {
        Response response =
                given()
                        .auth()
                        .oauth2(bearerToken)
                        .contentType("application/json")
                        .get(baseURI + "/2/users/" + myTwitterId + "/tweets");
        //we are Verifing statusCode should be 200
        Assert.assertEquals(200, response.getStatusCode(), "Status code is not same as excepted");


        //we created pojo clases now we can get any field from payload
        // in below Assertion we get resolt count from meta data array and we did verification
        TweetsPojo tweetsPojo = response.body().as(TweetsPojo.class);
        Assert.assertEquals(10, tweetsPojo.getMeta().getResult_count());


    }
}
