package nofunny;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final static String path = "user.json";
    static Scanner in = new Scanner(System.in);

    private static void writeToJson(Object user) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("user.json"), user);
        System.out.println("Write to Json successful!");
    }

    private static Objectw readFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Objectw usr1 = mapper.readValue(new File("user.json"), (Objectw.class));
//        System.out.println(usr1.toString());
        return usr1;
    }

    public static void main(String[] args) throws IOException {
        int flag;
        boolean loop = true;
        boolean check = true;
        Integer ID;
        String FIO;
        Integer AGE;
        List<String>lessons = new LinkedList<String>();
        lessons.add("Maths");
        lessons.add("Physics");
        lessons.add("Informatics");
        do {
            System.out.println("Input id:");
            ID = in.nextInt();
            in.nextLine();
            System.out.println("Input fio:");
            FIO = in.nextLine();
            System.out.println("Input age:");
            AGE = in.nextInt();
            Objectw user = new Objectw(ID, FIO, AGE, lessons);
            do {
                System.out.println("Enter action\n1-Write To JSON\n2-Read From Json: ");
                flag = in.nextInt();
//                in.close();
                switch (flag) {
                    case 1:
                        writeToJson(user);
                        break;
                    case 2:
                        Objectw usr = readFromJson();
                        Integer id = usr.getId();
                        String fio = usr.getFio();
                        Integer age = usr.getAge();
                        List<String> Less = usr.getLessons();
//                    System.out.println(fio);
                        System.out.println("Id:" + id + "\n" + "Fio: " + fio + "\n" + "Age: " + age + "\n" + "Lessons: " + Less);
                        break;
                    default:
                        check = false;
                        break;
                }
            } while (check);
            if(FIO.equals("exit"))
                loop = false;
        }while(loop);
    }
}
