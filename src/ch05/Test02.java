package ch05;

public class Test02 {
    public static void main(String[] args) {
        String text = "동해물과 백두산이 마르고 닳도록 하나님이 보우하사 우리나라 만세";
        String[] texts = text.split(" ");
        String temp = "";
        for (String t : texts) {
            temp += t + " ";
            System.out.println(temp.trim());
        }
    }
}
