package ch04;

import java.io.File;

public class Test07 {
    public static void main(String[] args) {
        File file = new File("./src/ch04");
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();
            String nameOnly = fileName.contains(".") ? fileName.substring(0, fileName.lastIndexOf('.')) : fileName;

            if (nameOnly.length() > 10) {
                continue;
            }

            System.out.println(fileName);
        }
    }
}
