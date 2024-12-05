package Applications.BankApplications;

public class Details {

    static int id = 0;
    int cId ;
    String email;
    String password;

    Details(String email,String password)
    {
        this.cId = id++;
        this.email = email;
        this.password = password;
    }

}
