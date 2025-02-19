package com.practiceproblems.mergetwojsonobject;

import org.json.JSONObject;

public class MergeTwoJSONObject {
    public static void main(String[] args) {
        JSONObject student1=new JSONObject();
        student1.put("name","Rishika Bisht");
        student1.put("age",21);

        JSONObject student2=new JSONObject();
        student2.put("name","Pratham Raj");
        student2.put("age",22);

        JSONObject mergedStudent=new JSONObject(student1);
        mergedStudent.put("Student1",student1);
        mergedStudent.put("Student2",student2);
        System.out.println(mergedStudent.toString(3));


    }
}
