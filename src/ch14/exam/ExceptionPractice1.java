package ch14.exam;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class ExceptionPractice1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e.getMessage());
            System.out.println("예외 클래스: " + e.getClass().getName());

            StackTraceElement[] stack = e.getStackTrace();
            if (stack.length > 0) {
                System.out.println("예외 위치: " + stack[0].getFileName() + "의 " +
                        stack[0].getMethodName() + "() - " + stack[0].getLineNumber() + "번째 줄");
            }

            logError(e);
        } finally {
            System.out.println("예외 처리 완료 (finally 블록 실행)");
        }

        System.out.println("프로그램 정상 종료");
    }

    public static void logError(Exception e) {
        try (FileWriter fw = new FileWriter("error_log.txt", true);
             PrintWriter out = new PrintWriter(fw)) {
            out.println("=== 예외 로그 ===");
            out.println("예외 클래스: " + e.getClass().getName());
            out.println("예외 메시지: " + e.getMessage());

            for (StackTraceElement ste : e.getStackTrace()) {
                out.println("  at " + ste.toString());
            }

            out.println("===================");
        } catch (IOException ex) {
            System.out.println("로그 기록 실패: " + ex.getMessage());
        }
    }
}
