package OnlineShoppingApp;

class User {

    static int id = 1;
    int customerId;
    String name;
    String email;
    long mobileNo;
    String password;
    int created_time ;
    int updated_time;

    User(int id,String name,String email,long mobileNo,String password,int created_time ,int updated_time)
    {
        this.customerId = id++;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.password = password;
        this.created_time = created_time;
        this.updated_time = updated_time;

    }

}
