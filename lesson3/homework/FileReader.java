package lesson3.homework;

import lesson4.threads.StringProducer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileReader {
    public static void main(String[] args) {
        Path dirPath = Paths.get("files");
        try {
            createFiles(dirPath);
            boolean endGame = false;
            while (!endGame) {
                Scanner in = new Scanner(System.in);
                System.out.println("*Write 'ls' to get list off all available files in current dir*");
                System.out.println("*Write 'print *filename*' to print file*");
                System.out.println("*Write 'write *filename* *text*' to write into file*");
                System.out.println("*Write 'exit' to end the program*");
                System.out.print("CurrentDir:" + dirPath.toAbsolutePath().toString() + " ");
                String command = in.nextLine();
                switch (command) {
                    case ("exit"):
                        endGame = true;
                        continue;
                    case ("ls"):
                        printFileStructure(dirPath);
                        continue;
                }
                if (command.matches("^(print ).*\\.txt")) {
                    String[] parts = command.split(" ");
                    Path textFile = Paths.get(dirPath.toString()+ "/" + parts[1]);
                    if (Files.exists((textFile))){
                       FileInputStream inputStream = new FileInputStream(textFile.toFile());
                        byte[] bytes = new byte[(int)(textFile.toFile().length())];
                        inputStream.read(bytes);
                        System.out.println(new String(bytes));
                        continue;
                    }
                    else {
                        System.out.println("File doesn't exist\n");
                        continue;
                    }
                }
                if (command.matches("^(write ).*\\.txt ([\\s\\S])+")) {
                    String[] parts = command.split(" ");
                    Path textFile = Paths.get(dirPath.toString()+ "/" + parts[1]);
                    if (Files.exists((textFile))){
                        FileOutputStream outputStream = new FileOutputStream(textFile.toFile());

                        StringBuilder text = new StringBuilder();
                        for (int i = 2; i < parts.length; i++) {
                            text.append(parts[i].toString()).append(" ");
                        }
                        outputStream.write(text.toString().getBytes());
                        continue;
                    }
                    else {
                        System.out.println("File doesn't exist\n");
                        continue;
                    }
                }
                System.out.println("Undefined command \n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFiles(Path dirPath) throws IOException {
        if (!Files.exists(dirPath)) {
            Files.createDirectory(dirPath);
        }
        for (int i = 0; i < 6; i++) {
            Path file = Paths.get(dirPath.toString() + "/example-" + i + ".txt");
            if (!Files.exists((file))) {
                Files.createFile(file);
                FileOutputStream outputStream = new FileOutputStream(file.toString());
                outputStream.write(("Example string string-" + i).getBytes());
            }
        }
    }

    public static void printFileStructure(Path dirPath) {
        File folder = new File(dirPath.toString());
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(" -- " + file.getName());
            }
        }
    }
}
