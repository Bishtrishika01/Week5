package com.CSVDataHandling.advancedproblems.detectduplicatesinacsvfile;

import static com.CSVDataHandling.advancedproblems.detectduplicatesinacsvfile.DetectingDuplicatesInACSVFile.detectDuplicates;

public class DetectDuplicatesInACSVFile {
    public static void main(String[] args) {
        //FilePath
        String filePath = "src/main/java/com/CSVDataHandling/advancedproblems/detectduplicatesinacsvfile/file.csv";
        //Calling method
        detectDuplicates(filePath);
    }
}
