package ch14;

import java.io.*;

public class Test01 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        String text = "";

        try {
            reader = new BufferedReader(new FileReader("data/소나기.txt"));

            while (true) {
                String data = reader.readLine();
                if (data == null) break;
                text += data + "\n";
            }

            System.out.println(text);

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 오류가 발생했습니다.");
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("파일 닫기 중 오류 발생");
            }
        }
    }
}