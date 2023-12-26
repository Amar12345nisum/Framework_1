package api.payload;

import java.util.Date;

public class User {



    /*{
      {
  "id": 0,
  "idBook": 0,
  "firstName": "string",
  "lastName": "string"
}

    }*/
    private int id;
    private  int idbook;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String Firstname;
    private String Lastname;



    public int getIdbook() {
        return idbook;
    }

    public void setIdbook(int idbook) {
        this.idbook = idbook;
    }



    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }



}
