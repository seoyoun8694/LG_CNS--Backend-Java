package ch05;

public class Test01 {
    public static void main(String[] args) {
        String text = "spwwz";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char decrypt = (char)(c - 11);
            System.out.print(decrypt);
        }
    }
}