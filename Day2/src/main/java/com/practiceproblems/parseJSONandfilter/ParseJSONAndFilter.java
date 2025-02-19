package com.practiceproblems.parseJSONandfilter;


import com.practiceproblems.parseJSONandfilter.Student;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class ParseJSONAndFilter {
    public static void main(String[] args) {
        try {
            List<Student> students = new ArrayList<>();
            Student s1 = new Student("Rishika", 21, new String[]{"IT", "cloud computing"});
            Student s2 = new Student("Pratham", 26, new String[]{"physics", "chemistry"});
            Student s3 = new Student("Suraj", 23, new String[]{"maths", "biology"});
            students.add(s1);
            students.add(s2);
            students.add(s3);

            JSONArray jsonArray = new JSONArray(students);

            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode rootNode = objectMapper.readTree(jsonArray.toString());
            ArrayNode filteredArray = objectMapper.createArrayNode();

            for (JsonNode jsonNode1 : rootNode) {
                if (jsonNode1.get("age").asInt()>25){
                    filteredArray.add(jsonNode1);
                }
            }
            System.out.println(filteredArray);

        }catch (Exception e) {
            System.out.println("Exception occured");
        }

    }
}
