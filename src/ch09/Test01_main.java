package ch09;

public class Test01_main {
    public static void main(String[] args) {
        Test01 t1 = new Test01();
        t1.setBottom(100.0f);
        t1.setHeight(200.0f);
        float tArea1 = t1.getArea();
        System.out.println(tArea1);

        Test01 t2 = new Test01(20f, 50f);
        float tArea2 = t2.getArea();
        System.out.println(tArea2);
    }
}
