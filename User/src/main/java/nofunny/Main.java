package nofunny;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean i = true;
        Scanner in = new Scanner(System.in);
        Student obj = new Student("Петр", "Иванович", "Кириллкин", "8-954-333-43-31", 1);
        Teacher obj1 = new Teacher("Александр", "Кириллович", "Иванов", "8-954-333-43-31","IVT", "anal fisting");
        System.out.println("Actions:\n1)addTeacher\n2)addStudent\n3)getTeacher\n4)getStudent\n");
        while(i) {
            System.out.println("Enter Action");
            String action = in.nextLine();
            switch (action) {
                case "1":
                    System.out.println("Enter Interest");
                    String interest = in.nextLine();
                    System.out.println("Enter Department");
                    String dep = in.nextLine();
                    obj1.setDepartment(dep);
                    obj1.setInterests(interest);
                    break;
                case "2":
                    System.out.println("Id");
                    int id = in.nextInt();
                    obj.setId(id);
                    break;
                case "3":
                    System.out.println(obj1.toString());
                    break;
                case "4":
                    System.out.println(obj.toString());
                    break;
                default:
                    System.out.println("Repeat...");
                    ;
            }
        }

    }
}