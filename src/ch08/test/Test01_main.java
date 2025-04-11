package ch08.test;

import java.util.Arrays;

public class Test01_main {
    String[] images;
    String shopName;
    String shopDesc;
    String tel;
    String address;
    int hit;

    public void setData() {
        this.images = new String[] { "a.jpg", "b.jpg" };
        this.shopName = "국제밀면";
        this.shopDesc = "부산 3대 밀면 전문점";
        this.tel = "051-501-5507";
        this.address = "부산광역시 연제구 거제1동";
        this.hit = 5451;
    }

    public void printInfo() {
        System.out.println("이미지 경로: " + Arrays.toString(images));
        System.out.println("매장명: " + shopName);
        System.out.println("설명: " + shopDesc);
        System.out.println("전화번호: " + tel);
        System.out.println("주소: " + address);
        System.out.println("조회수: " + hit);
    }
}
