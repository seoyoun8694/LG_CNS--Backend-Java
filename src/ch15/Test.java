package ch15;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        ObjectMapper objectMapper =  new ObjectMapper();
        URL url = null;
        try {
            url = new URL("https://jsonplaceholder.typicode.com/todos");
            List list = objectMapper.readValue(url, List.class);
            for (int i = 0; i < list.size(); i++) {
                Map<String, Object> map = (Map<String, Object>) list.get(i);
                int id = (int) map.get("id");
                String title = (String) map.get("title");
                System.out.println(id + " / " + title);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
