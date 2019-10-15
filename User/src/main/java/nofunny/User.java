package nofunny;

public class User {

    private String firstName, middleName, lastName, phone;

    public User(String firstName, String middleName, String lastName, String phone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + '\n' + "middleName: " + middleName + '\n' + "lastName: " + lastName + '\n' + "phone: " + phone;
    }
}