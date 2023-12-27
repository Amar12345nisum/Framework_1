package test;

import api.endpoints.Userendpoints;
import api.payload.User;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
//import org.junit.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Usertest{
    Faker faker;
    User userpayload;

    @BeforeClass
    public void setupdata(){
        {
            faker = new Faker();
            userpayload = new User();
            userpayload.setId(faker.idNumber().hashCode());
            userpayload.setIdbook(faker.idNumber().hashCode());
            userpayload.setFirstname(faker.name().username());
            userpayload.setLastname(faker.name().username());

        }


    }

    @Test(priority = 1)
    public void testpostuser(){
        Response response = Userendpoints.createuser(userpayload);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);

    }
    @Test(priority = 2)
    public void testgetusn(){
       Response response = Userendpoints.getalluser();//this.userpayload.getid()
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
        }

    @Test(priority = 3)
    public void testup(){
        Response response = Userendpoints.update(this.userpayload.getId(),userpayload);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);

    }
    @Test(priority = 4)
    public void testdel(){
        Response response = Userendpoints.deluser(this.userpayload.getId());
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
    }
    @Test(priority = 5)
    public void testgetid(){
        Response response = Userendpoints.get_bkid(this.userpayload.getId());
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test()
    public void getsingledata ()
    {
        Response response= given().pathParams("id",12).when().get("https://fakerestapi.azurewebsites.net/api/v1/Authors/{id}");
        response.then().log().all();

    }

}
