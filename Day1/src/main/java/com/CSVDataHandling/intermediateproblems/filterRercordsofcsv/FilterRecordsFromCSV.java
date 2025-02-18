/*4️⃣ Filter Records from CSV
Read a CSV file and filter students who have scored more than 80 marks.
Print only the qualifying records.*/
package com.CSVDataHandling.intermediateproblems.filterRercordsofcsv;

import com.opencsv.CSVReader;
import java.io.*;


public class FilterRecordsFromCSV {
    public static void main(String[] ars){
        String filePath = "src/main/java/com/CSVDataHandling/intermediateproblems/filterRercordsofcsv/StudentDetails.csv";

        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] nextline;
            while((nextline = reader.readNext()) != null){
                if(Integer.parseInt(nextline[3])>80){
                    System.out.println("Rollno. : "+nextline[0]+", Name : "+nextline[1]+", Age : "+nextline[2]+", Marks : "+nextline[3]);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
