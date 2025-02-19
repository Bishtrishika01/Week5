package com.handsonpracticeproblems.createjsonobject;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonObject {
    public static void main(String[] args){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name","Rishika");
        jsonObject.put("Age",21);

        JSONArray subject = new JSONArray();
        subject.put("Computer Networking");
        subject.put("Cloud Computing");
        subject.put("DBMS");

        jsonObject.put("Subjects",subject);

        System.out.println(jsonObject.toString(3));
    }
}
