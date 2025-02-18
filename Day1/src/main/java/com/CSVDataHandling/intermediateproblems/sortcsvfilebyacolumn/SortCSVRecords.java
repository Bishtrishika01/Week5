/*7️⃣ Sort CSV Records by a Column
Read a CSV file and sort the records by Salary in descending order.
Print the top 5 highest-paid employees.*/
package com.CSVDataHandling.intermediateproblems.sortcsvfilebyacolumn;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SortCSVRecords {
    public static void main(String[] args){
        String filePath = "src/main/java/com/CSVDataHandling/intermediateproblems/sortcsvfilebyacolumn/EmployeeDetails.csv";
        List<String[]> list = new ArrayList<>();
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] header = reader.readNext();
            list.add(header);

            List<String[]> employeeData = new ArrayList<>();
            String[] nextLine;
            while((nextLine=reader.readNext()) != null){
                employeeData.add(nextLine);
            }
            employeeData.sort((a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

            System.out.println("Top 5 Highest-Paid Employees:");
            for (int i = 0; i < Math.min(5, employeeData.size()); i++) {
                System.out.println(String.join(", ", employeeData.get(i)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
