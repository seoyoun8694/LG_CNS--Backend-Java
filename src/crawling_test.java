import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class crawling_test {
    public static void main(String[] args) {
        try {
            String url = "https://culture.seoul.go.kr/culture/culture/cultureEvent/view.do?cultcode=152670&menuNo=200011";

            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0")
                    .get();

            Elements paragraphs = doc.select("div.culture-content p");

            for (int i = 0; i < paragraphs.size() - 1; i++) {
                Element p = paragraphs.get(i);
                String text = p.text().replace("\u00A0", "").trim();
                if (!text.isEmpty()) {
                    System.out.println(text);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}