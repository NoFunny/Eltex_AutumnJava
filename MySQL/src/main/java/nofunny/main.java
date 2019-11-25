package nofunny;

import java.util.*;
import java.sql.*;
import java.io.*;




public class main {

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "ghjnjnbg228");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO student(id, fio, phone) VALUES (4, \"Alexander\", \"100500\");");
            ResultSet rs = stmt.executeQuery("SELECT * FROM student;");
            while(rs.next()) {
                String id = rs.getString("id");
                String fio = rs.getString("fio");
                String phone = rs.getString("phone");
                System.out.println(id);
                System.out.println(fio);
                System.out.println(phone);
            }
            conn.close();
            Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "ghjnjnbg228");
            Statement stmt1 = conn1.createStatement();
            stmt1.executeUpdate("DELETE FROM student WHERE id = 4 AND fio = \"Alexander\"");
            ResultSet rs1 = stmt1.executeQuery("SELECT * FROM student;");
            while(rs1.next()) {
                String id = rs1.getString("id");
                String fio = rs1.getString("fio");
                String phone = rs1.getString("phone");
                System.out.println(id);
                System.out.println(fio);
                System.out.println(phone);
            }
            conn1.close();
        }catch(java.sql.SQLException e){
            System.out.println(e);
        }
    }
}
