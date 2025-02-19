//Problem Statement: IPL and Censor Analyzer
//Objective:
//Develop a Java application that reads IPL match data from JSON and CSV files, processes the data
// based on defined censorship rules, and writes the sanitized data back to new files.
//The application should support:
//JSON Input: IPL match data in JSON format.
//CSV Input: IPL match data in CSV format.
// 2️⃣ Censorship Rules
//The program should apply the following censorship:
//Mask Team Names: Replace part of the team name with "***".
//Example: "Mumbai Indians" → "Mumbai ***"
//Redact Player of the Match: Replace player names with "REDACTED".
// 3️⃣ Output Data Formats
//Generate censored JSON and CSV files after processing.

package com.iplandcensoranalyzer;

import java.io.File;

public class IplAndCensorAnalyzer {
    public static void main(String[] args) {
        //JSON File Path
        File jsonBefore =new File("src/main/java/com/iplandcensoranalyzer/ipldatabeforecensorship.json");
        File jsonAfter = new File("src/main/java/com/iplandcensoranalyzer/ipldataaftercensorship.json");
        //Method to update data in JSON Format
        JSONIPLDataModifier.jsonIPLDataModifier(jsonBefore,jsonAfter);

        File csvBefore = new File("src/main/java/com/iplandcensoranalyzer/ipldatabeforecensorship.csv");
        File csvAfter = new File("src/main/java/com/iplandcensoranalyzer/ipldataaftercensorship.csv");
        //Method to update data in CSV format
        CSVIPLDataModifier.csvIplDataModifier(csvBefore,csvAfter);
    }
}
