package ch11;

public class Test01 {
    public static void main(String[] args) {
        Ramen ramen1 = new SpicyRamen("불 라면");
        System.out.println(ramen1.getTaste());

        Ramen ramen2 = new SaltyRamen("소금 라면");
        System.out.println(ramen2.getTaste());
    }
}

class Ramen {
    String taste;
    String name;

    public String getTaste() {
        return "라면맛";
    }
}

class SpicyRamen extends Ramen {
    public SpicyRamen(String name) {
        this.name = name;
    }

    @Override
    public String getTaste() {
        return name + "은(는) 매운맛";
    }
}

class SaltyRamen extends Ramen {
    public SaltyRamen(String name) {
        this.name = name;
    }

    @Override
    public String getTaste() {
        return name + "은(는) 짠맛";
    }
}
