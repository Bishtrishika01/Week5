/*6️⃣ Modify a CSV File (Update a Value)
Read a CSV file and increase the salary of employees from the "IT" department by 10%.
Save the updated records back to a new CSV file.*/
package com.CSVDataHandling.intermediateproblems.modifyacsvfile;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ModifyOrUpdateCSVFile {
    public static void main(String[] args){
        String inputFile = "src/main/java/com/CSVDataHandling/intermediateproblems/modifyacsvfile/InputFile.csv";
        String outputFile = "src/main/java/com/CSVDataHandling/intermediateproblems/modifyacsvfile/OutputFile.csv";

        List<String[]> list = new ArrayList<>();
        try(CSVReader reader = new CSVReader(new FileReader(inputFile));
        CSVWriter writer = new CSVWriter(new FileWriter(outputFile))){

            String[] nextLine;
            while((nextLine = reader.readNext()) != null){
                if(nextLine[2].equalsIgnoreCase("IT")){
                    nextLine[3] = String.valueOf(Double.parseDouble(nextLine[3])*1.10);
                }
                list.add(nextLine);
            }
            writer.writeAll(list);
            System.out.println("Update done!");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
