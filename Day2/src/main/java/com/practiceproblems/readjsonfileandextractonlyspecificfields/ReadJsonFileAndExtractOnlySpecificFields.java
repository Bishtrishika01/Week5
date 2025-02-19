package com.practiceproblems.readjsonfileandextractonlyspecificfields;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;


public class ReadJsonFileAndExtractOnlySpecificFields {
    public static void main(String[] args){
            File file = new File("src/main/java/com/practiceproblems/readjsonfileandextractonlyspecificfields/file.json");
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                JsonNode person=objectMapper.readTree(file);
                System.out.println(person.get("name").asText());
                System.out.println(person.get("email").asText());
            } catch (Exception e){
            e.printStackTrace();
             }
    }
}
