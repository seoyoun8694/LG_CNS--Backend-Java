package ch07;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class Json {
    public static void main(String[] args) throws IOException {
        String[] names = {"김길동", "홍길동", "최"};
        ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(names);
        // System.out.println(json);

        String address = "http://ggoreb.com/api/lotto.jsp";
        URL url = new URL(address);
        Map map = om.readValue(url, Map.class);
        System.out.println(map);
    }
}