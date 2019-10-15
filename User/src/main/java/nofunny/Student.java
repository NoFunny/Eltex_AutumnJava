package nofunny;

public class Student extends User {
    private int id;

    public Student(String firstName, String middleName, String lastName, String phone, int id) {
        super(firstName,middleName,lastName,phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "id:" + id;
    }
}