package ch08.test;

public class Test03 {
    int a;
    public static void method1() {
        System.out.println("method1 실행 시작");
        Test03 obj = new Test03();
        for (int i = 0; i < 5; i++) {
            obj.method2();
        }
        System.out.println("method1 실행 종료");
    }

    public void method2() {
        a++;
        System.out.printf("method2 : %s\n", a);
    }

    public static void main(String[] args) {
        method1();
    }
}
