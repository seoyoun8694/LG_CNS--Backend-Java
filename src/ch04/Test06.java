package ch04;

public class Test06 {
    public static void main(String[] args) {
        boolean inSontinue = true;
        int count = 0;

        while (inSontinue) {
            int num1 = (int) (Math.random() * 6 + 1);
            int num2 = (int) (Math.random() * 6 + 1);

            count++;
            System.out.printf("(%d, %d)\n", num1, num2);

            if (num1 + num2 == 10) {
                inSontinue = false;
            }
        }

        System.out.printf("주사위를 던진 횟수: " + count);
    }
}
