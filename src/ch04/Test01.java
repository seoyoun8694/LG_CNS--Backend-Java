package ch04;

//import java.util.Calendar;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
//        System.out.printf("현재 연도는 %s년\n", year);
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 평년입니다.");
        }
    }
}
