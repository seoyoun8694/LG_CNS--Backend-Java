package ch15;

import java.util.Iterator;
import java.util.TreeSet;

public class Test02 {
    public static void main(String[] args) {
        TreeSet<Integer> lotto = new TreeSet<>();
        lotto.add(2);
        lotto.add(7);
        lotto.add(11);

        while (lotto.size() < 6)  {
            int num = (int)(Math.random() * 45 + 1);
            lotto.add(num);
        }

        Iterator<Integer> iter = lotto.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
