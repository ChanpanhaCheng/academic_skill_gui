package user;

// import java.util.HashMap;


public class Admin extends User {
    final static String EMAIL_FORMAT = "@adm.kdc.edu";
    static int numberOfAdmin = 0;
    public String id = "A";

    public Admin(String firstName, String lastName, String address, String phoneNumber) {
        super(firstName, lastName,"NA","NA", address, phoneNumber, EMAIL_FORMAT,"2025-03-19");
        id +=(String.valueOf(++numberOfAdmin));
        User.listUser.put(this.id, this);
    }
    public Admin(String id,String firstName, String lastName, String address, String phoneNumber,String email,String password,String dob) {
        super(firstName, lastName,"NA","NA", address, phoneNumber, email, password,dob);
        this.id = id;
        User.listUser.put(this.id, this);
    }

    public Admin(String email, String password) {
        super(email, password);
    }

    @Override
    public String toString() {
        return super.toString() +"ID : " + id +  "  Role : " +"\n";
    }

}
