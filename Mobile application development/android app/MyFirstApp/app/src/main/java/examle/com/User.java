package examle.com;

public class User {

    //declaration
    private String name;
    private String address;
    private String email;

    //constructor
    public User() {
        name = "";
        address = "";
        email = ";
    }

    //constructor with parameters
    public User (String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    //constructor, sets parameter as users name value
    public User (String name) {
        this.name = name;
    }

    // get name method
    public String getName() {
        return name;
    }

    // set name method, takes the users input, sets the value of name to input
    public void setName(String name) {
        this.name = name;
    }

    // get address method
    public String getAddress() {

        return address;
    }

    // set address method
    public void setAddress(String address) {
        this.address = address;
    }

    //get email method
    public String getEmail(String email) {

        this.email = email;
    }
    // set email method
    public void setEmail(String email) {
        this.email = email;
    }
}
