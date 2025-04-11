package ch08.test;

public class Test02_main {
    String content;
    float latitude;
    float longitude;

    @Override
    public String toString() {
        return  "마커 설명: " + content + "\n"
                + "위도: " + latitude + "\n"
                + "경도: " + longitude;
    }
}
