package ch15;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2); numbers.add(3); numbers.add(3);
        numbers.add(2); numbers.add(2); numbers.add(4);
        numbers.add(1); numbers.add(8); numbers.add(7);

        System.out.println("삭제 전 데이터 : " + numbers);

        Iterator<Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            int num = iter.next();
            if (num % 2 == 0) {
                iter.remove();
            }
        }

        System.out.println("삭제 후 데이터 : " + numbers);
    }
}
