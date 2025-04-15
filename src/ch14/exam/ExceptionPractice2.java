package ch14.exam;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class ExceptionPractice2 {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("나이는 0보다 작을 수 없습니다.");
        } else {
            System.out.println("입력된 나이: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("예외 처리됨: " + e.getMessage());
            logError("InvalidAgeException: " + e.getMessage());
        } finally {
            System.out.println("예외 처리 완료 (finally 블록 실행)");
        }
    }

    public static void logError(String msg) {
        try (FileWriter fw = new FileWriter("error_log.txt", true);
             PrintWriter out = new PrintWriter(fw)) {
            out.println("[ExceptionPractice2] " + msg);
        } catch (IOException e) {
            System.out.println("로그 기록 실패: " + e.getMessage());
        }
    }
}