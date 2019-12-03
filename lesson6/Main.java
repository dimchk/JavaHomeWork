package lesson6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
//        FuncInt inter = (someStr) -> {
////            System.out.println(someStr + " changed ");
////        };
////        inter.doSmth("Test");
//        new Thread(() -> System.out.println("Hello")).start();
//        MyThread myThread  = new MyThread(() -> System.out.println("Hello"));
        Properties prop = new Properties();
        prop.load(new FileInputStream(new File("config.properties")));
        System.out.println(prop.getProperty("something"));
    }
}
