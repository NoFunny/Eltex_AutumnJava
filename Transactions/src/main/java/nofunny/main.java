package nofunny;

import java.util.*;
import java.sql.*;
import java.io.*;




public class main {

    public static String query(int id, String fio, long phone) {
        String command = "INSERT INTO student(id,fio,phone) VALUES ("+ id +","+"\""+fio+"\""+","+"\""+phone+"\""+");";
        System.out.println(command);
        return command;
    }

    public static void main(String[] args) {
        try{
            int[] id = new int[5];
            String[] fio = new String[5];
            long[] phone = new long[5];
            Random rn = new Random();
            StringBuilder stringbuild = new StringBuilder();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "ghjnjnbg228");
            Statement stmt = conn.createStatement();
            long time1 = System.nanoTime();
            conn.setAutoCommit(false);
            for(int i = 0; i < 5; i++) {
                id[i] = (int) Math.round(Math.random() * 100);
                for(int j = 0; j < 10; j++) {
                    char code = (char) (rn.nextInt(57)+ 70);
                    stringbuild.append(Character.toString(code));
                }
                fio[i] = stringbuild.toString();
                phone[i] = (int) Math.round((Math.random() *1000000) +500000);
                stmt.executeUpdate(query(id[i], fio[i], phone[i]));
                stringbuild.delete(0,stringbuild.length());
                ResultSet rs = stmt.executeQuery("SELECT * FROM student;");
                while (rs.next()) {
                    String userid = rs.getString("id");
                    String username = rs.getString("fio");
                    String numb = rs.getString("phone");

                    System.out.println("id : " + userid);
                    System.out.println("fio : " + username);
                    System.out.println("phone : " + numb);
                }
            }
            conn.commit();
            long time2 = System.nanoTime();
            System.out.print("Elapsed time: ");
            System.out.println(time2-time1);
            conn.close();
        }catch(java.sql.SQLException e){
            System.out.println(e);
        }
    }
}
