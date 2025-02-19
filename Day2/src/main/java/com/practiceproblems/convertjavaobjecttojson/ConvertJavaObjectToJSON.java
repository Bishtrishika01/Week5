package com.practiceproblems.convertjavaobjecttojson;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class ConvertJavaObjectToJSON {
    public static void main(String[] args) {
        try {
            List<Student> students = new ArrayList<>();
            Student s1 = new Student("Rishika", 21, new String[]{"maths", "ioT", "cloud computing"});
            Student s2 = new Student("Suraj", 22, new String[]{"physics", "chemistry", "biology"});
            Student s3 = new Student("Vivek", 23, new String[]{"maths", "biology", "physics"});
            students.add(s1);
            students.add(s2);
            students.add(s3);
            JSONArray jsonArray=new JSONArray(students);
            System.out.println(jsonArray);
        }catch (Exception e) {
            System.out.println("Exception occured");
        }
    }
}
