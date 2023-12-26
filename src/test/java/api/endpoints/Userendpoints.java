package api.endpoints;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Userendpoints {


    public static Response createuser(User payload)
    {

        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Routes.post_url);
        return response;
    }
    public static Response getuser(int Id){
        Response response = given().pathParam("id",Id).contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .get(Routes.get_url);
        return response;
    }
    public static Response update(int Id,User payload){
        Response response =given().pathParams("id",Id)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .put(Routes.put_url);
        return response;
    }
    public static Response deluser(int Id) {
        Response response = given().pathParam("id", Id).contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .delete(Routes.del_url);
        System.out.println(response.getBody());

        return response;
    }
    public static Response get_bkid(int Id){
        Response response = given().pathParam("id", Id).contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .get(Routes.get_bkid);
        return response;

    }
    public static Response getalluser(){
        Response response = given().contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .get(Routes.get_all_url);
        return response;
    }




}
