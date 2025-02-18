/*3️⃣ Read and Count Rows in a CSV File
Read a CSV file and count the number of records (excluding the header row).*/
package com.CSVDataHandling.basicproblems.readandcountrow;

import java.io.*;

public class ReadAndCountRowsInACSVFile {
    public static void main(String[] args){
        String filePath = "src/main/java/com/CSVDataHandling/basicproblems/readandcountrow/StudentDetails.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            int  rowCount = 0;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null){
                if(isFirstLine){
                    isFirstLine = false;
                    continue;
                }
                rowCount++;
            }
            System.out.println("Numbers of row excluding the header row : "+rowCount);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
