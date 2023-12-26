import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Tyu {

    @Test
    public void swgget(){
        baseURI = "https://fakerestapi.azurewebsites.net";
        given().header("Content-Type","applocation/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(baseURI)
                .when()
                .get("/api/v1/Activities")
                .then()
                .statusCode(200).log().body();
    }
}
