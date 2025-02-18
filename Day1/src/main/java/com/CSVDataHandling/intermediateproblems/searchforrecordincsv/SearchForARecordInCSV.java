/*5️⃣ Search for a Record in CSV
Read an employees.csv file and search for an employee by name.
Print their department and salary.*/

package com.CSVDataHandling.intermediateproblems.searchforrecordincsv;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchForARecordInCSV {
    public static void main(String[] args){
        String filePath = "src/main/java/com/CSVDataHandling/intermediateproblems/searchforrecordincsv/EmployeeDetails.csv";
        String search = "Rishika";

        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] nextLine;
            while((nextLine = reader.readNext()) != null){
                if(nextLine[1].equalsIgnoreCase(search)){
                    System.out.println("ID : " + nextLine[0]+", Name : "+nextLine[1]+", Department : "+nextLine[2]+", Salery : "+nextLine[3]);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
