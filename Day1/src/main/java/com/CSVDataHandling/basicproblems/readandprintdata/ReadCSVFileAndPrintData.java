/*1️⃣ Read a CSV File and Print Data
Read a CSV file containing student details (ID, Name, Age, Marks).
Print each record in a structured format.*/
package com.CSVDataHandling.basicproblems.readandprintdata;
import com.opencsv.CSVReader;
import java.io.*;

public class ReadCSVFileAndPrintData{
    public static void main(String[] args) {
        String filePath = "src/main/java/com/CSVDataHandling/basicproblems/readandprintdata/StudentDetails.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                System.out.println(columns[0] + "   " + columns[1]+"   " + columns[2]+"   " + columns[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

