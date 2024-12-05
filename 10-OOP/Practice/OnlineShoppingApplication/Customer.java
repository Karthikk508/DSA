package Practice.OnlineShoppingApplication;

public class Customer {

    String name;
    String email;
    String mobileNumber;
    String password;
    String createdTime;
    String updatedTime;
    String role;


    Customer( String name,String email,String mobileNumber,String password,String role)
    {
        this.name = name;
        this.email = email;
        this.password = Password.encrypt(password);
        this.mobileNumber = mobileNumber;
        this.role = role;

    }

}
