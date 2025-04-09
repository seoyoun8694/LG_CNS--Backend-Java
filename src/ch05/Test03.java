package ch05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/소나기.txt"));
            StringBuilder text = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");
            }
            reader.close();

            String[] sentences = text.toString().split("[.?!]\\s*");

            for (String sentence : sentences) {
                sentence = sentence.trim();
                if (sentence.startsWith("칡")) {
                    System.out.println(sentence);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
