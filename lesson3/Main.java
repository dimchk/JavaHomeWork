package lesson3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] argc) {
//        File file = new File("test.txt");
//        try {
//
//            file.createNewFile();
//            FileOutputStream outputStream = new FileOutputStream(file);
//            byte[] randomText = "Random text blablabla dsadsadsadsadsads".getBytes();
//            outputStream.write(randomText);
//            outputStream.close();
//            FileInputStream fis = new FileInputStream(file);
//            byte[] bytes = new byte[(int)(file.length())];
//            fis.read(bytes);
//            String textFromFile = new String(bytes);
//            String newString = textFromFile.substring(textFromFile.length() / 2 - 1, textFromFile.length() / 2 + 5);
//            System.out.println(textFromFile);
//            File newFile = new File("newTest.txt");
//            FileOutputStream newOutputStream = new FileOutputStream(newFile);
//            newOutputStream.write(newString.getBytes());
//            newOutputStream.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            RandomAccessFile raf = new RandomAccessFile("file.txt", "rw");
//            try {
//                raf.seek(3);
//                raf.write("test".getBytes());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//
//            try {
//                fis.read(bytes);
//                System.out.println(new String(bytes));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        Path path  = Paths.get("nio.txt");
        try {
            Files.createFile(path);
            //Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path moveTo = Paths.get("MyFileNioMove.txt");
        try {
            Files.move(path, moveTo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
