package lesson3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio {
    public static void main(String[] argc) {
        Path dirPath = Paths.get("nio");
        try {
            Files.createDirectory(dirPath);
            String[] files = new String[10];
            for (int i = 0; i < 10; i++) {
                Path filePath = Paths.get("file-" + i + ".txt");
                FileOutputStream outputStream = new FileOutputStream(dirPath.toString() + "/" + filePath.toString());
                files[i] = dirPath.toString() + "/" + filePath.toString();

                outputStream.write(("File number" + i).getBytes());
            }
            for (int i = 0; i < files.length; i++) {
                if (i % 2 == 0) {
                    Path filePath = Paths.get(files[i]);
                    Files.delete(filePath);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
