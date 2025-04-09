package ch06;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

        for (int i = 0; i < nums.length - 1; i++) {
            int position = (int)(Math.random() * nums.length);
            char temp = nums[i];
            nums[i] = nums[position];
            nums[position] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
