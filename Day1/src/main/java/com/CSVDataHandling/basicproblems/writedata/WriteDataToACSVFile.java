/*2️⃣ Write Data to a CSV File
Create a CSV file with employee details (ID, Name, Department, Salary).
Write at least 5 records to the file.*/
package com.CSVDataHandling.basicproblems.writedata;

import java.io.*;

public class WriteDataToACSVFile {
    public static void main(String[] args){
        String filePath = "src/main/java/com/CSVDataHandling/basicproblems/writedata/output.csv";
        try(FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("ID "+"    Name   "+"     Department   "+"Salary\n");
            bw.write("104  "+"Alice William"+"   Finance  "+" 62000\n");
            bw.write("105  "+"Bob Johnson"+"     Sales  "+"    58000\n");
            System.out.println("CSV file written successfully!");

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
