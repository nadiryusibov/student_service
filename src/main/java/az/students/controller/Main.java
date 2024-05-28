package az.students.controller;

import az.students.constants.DatabaseConstants;
import az.students.dbConnection.DatabaseConnection;
import az.students.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection con = DatabaseConnection.connect();
        try {
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from students");

            while (rs.next()) {

                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("surname"));
                System.out.println("--------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Student student = new Student(1L,"Nadir","Yusibov",17,"pindd","sdssds",
//                "12dd");
//        System.out.println(student);
//        System.out.println("continue");

    }
}
