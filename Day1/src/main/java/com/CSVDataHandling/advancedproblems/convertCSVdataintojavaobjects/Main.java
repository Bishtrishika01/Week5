/*9️⃣ Convert CSV Data into Java Objects
Read a CSV file and convert each row into a Student Java object.
Store the objects in a List<Student> and print them.*/
package com.CSVDataHandling.advancedproblems.convertCSVdataintojavaobjects;

public class Main {
    public static void main(String[] args) {
        String filename="src/main/java/com/CSVDataHandling/advancedproblems/convertCSVdataintojavaobjects/StudentDetails.csv";
        System.out.println(ConvertCSVDataIntoJavaObjects.convertCSVDataIntoJavaObjects(filename));
    }
}
