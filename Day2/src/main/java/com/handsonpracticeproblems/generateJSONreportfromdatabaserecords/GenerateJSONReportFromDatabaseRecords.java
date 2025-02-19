package com.handsonpracticeproblems.generateJSONreportfromdatabaserecords;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.*;

public class GenerateJSONReportFromDatabaseRecords {
    public static void main(String[] args) {
        //Try block
        try {
            // Database records as a list
            List<Student> students = Arrays.asList(
                    new Student("Rishika", 25, "xyz@example.com"),
                    new Student("Alice", 22, "abc@example.com"),
                    new Student("Bob", 28, "pqr@example.com")
            );

            // Converting list to JSON and write to file
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("src/main/java/com/handsonpracticeproblems/generateJSONreportfromdatabaserecords/students_report.json"), students);

            System.out.println("JSON report generated successfully!");
        }
        //Catch block
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
