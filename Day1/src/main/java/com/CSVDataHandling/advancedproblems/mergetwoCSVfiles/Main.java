/*🔟 Merge Two CSV Files
You have two CSV files:
students1.csv (contains ID, Name, Age)
students2.csv (contains ID, Marks, Grade)
Merge both files based on ID and create a new file containing all details.*/
package com.CSVDataHandling.advancedproblems.mergetwoCSVfiles;

public class Main {
    public static void main(String[] args) {
        String file1 = "src/main/java/com/CSVDataHandling/advancedproblems/mergetwoCSVfiles/students1.csv";
        String file2 = "src/main/java/com/CSVDataHandling/advancedproblems/mergetwoCSVfiles/students2.csv";
        String outputFile = "src/main/java/com/CSVDataHandling/advancedproblems/mergetwoCSVfiles/merged_students.csv";
        MergeTwoCSVFiles.mergeTwoCSVFiles(file1, file2, outputFile);
    }

}
