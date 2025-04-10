package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CH05_Lotto {
    public static void main(String[] args) throws Exception {
        String address = "https://www.dhlottery.co.kr/gameResult.do?method=byWin";

        URL url = new URL(address);
        InputStream in = url.openStream();
        InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(isr);

        String text = "";
        while (true) {
            String data = reader.readLine();
            if (data == null) break;
            text += data + "\n";
        }

        int index = text.indexOf("class=\"num win\"");
        int end = text.indexOf("</div>", index);
        String winText = text.substring(index, end);

        Pattern spanPattern = Pattern.compile("<span[^>]*>(\\d{1,2})</span>");
        Matcher matcher = spanPattern.matcher(winText);

        System.out.print("1등 번호: ");
        int count = 0;
        while (matcher.find()) {
            System.out.print(matcher.group(1) + " ");
            count++;
            if (count == 6) break;
        }

        int bonusIndex = text.indexOf("class=\"num bonus\"");
        int bonusEnd = text.indexOf("</div>", bonusIndex);
        String bonusText = text.substring(bonusIndex, bonusEnd);

        Matcher bonusMatcher = spanPattern.matcher(bonusText);
        if (bonusMatcher.find()) {
            System.out.println("\n보너스 번호: " + bonusMatcher.group(1));
        }
    }
}