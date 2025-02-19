package com.practiceproblems.convertjavaobjecttojsonformat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

class Car{
    private String brand;
    private String model;
    private int year;

    Car(String brand,String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
}
public class ConvertJavaObjectToJsonFormat {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2023);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("src/main/java/com/practiceproblems/convertjavaobjecttojsonformat/output.json"), car);
            System.out.println("JSON File created successfully!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}