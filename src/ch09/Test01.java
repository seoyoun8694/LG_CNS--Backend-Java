package ch09;

public class Test01 {
    float bottom;
    float height;

    public Test01() {
    }

    public Test01(float bottom, float height) {
        this.bottom = bottom;
        this.height = height;
    }

    public float getArea() {
        return bottom * height * 0.5f;
    }

    public void setBottom(float bottom) {
        this.bottom = bottom;
    }

    public void setHeight(float height) {
        this.height = height;
    }

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