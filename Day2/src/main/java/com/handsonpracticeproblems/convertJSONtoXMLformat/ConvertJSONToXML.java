package com.handsonpracticeproblems.convertJSONtoXMLformat;


public class ConvertJSONToXML {
    public static void main(String[] args) {
        String json = "{\"name\":\"Rishika Bisht\", \"age\":21, \"city\":\"Bhopal\"}";

        try {
            org.json.JSONObject jsonObject = new org.json.JSONObject(json);
            String xml = org.json.XML.toString(jsonObject);
            System.out.println("XML Output:");
            System.out.println(xml);
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
