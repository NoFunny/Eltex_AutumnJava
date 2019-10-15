package nofunny;



public class Teacher extends User {
    private String department;
    private String interests;

    public Teacher(String firstName, String middleName, String lastName, String phone, String department,String interests) {
        super(firstName,middleName,lastName,phone);

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "department: " + department + '\n' + "interests:" + interests;
    }
}