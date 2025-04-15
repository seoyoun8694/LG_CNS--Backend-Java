package ch14.exam;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionPractice3 {

    public static void readFile() throws IOException {
        throw new IOException("파일을 읽을 수 없습니다.");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("파일 예외 처리: " + e.getMessage());
            logError("IOException: " + e.getMessage());
        } finally {
            System.out.println("예외 처리 완료 (finally 블록 실행)");
        }
    }

    public static void logError(String msg) {
        try (FileWriter fw = new FileWriter("error_log.txt", true);
             PrintWriter out = new PrintWriter(fw)) {
            out.println("[ExceptionPractice3] " + msg);
        } catch (IOException e) {
            System.out.println("로그 기록 실패: " + e.getMessage());
        }
    }
}
