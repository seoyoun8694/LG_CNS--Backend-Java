package ch06;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = { 21, 32, 13, 44, 25, 76, 97, 8, 89, 1 };
        int sum = 0;
        float avg = 0f;

        for (int num : arr) {
            sum += num;
        }
        avg = (float) sum / arr.length;

        System.out.println("합 : " + sum);
        System.out.println("평균 : " + avg);
    }
}