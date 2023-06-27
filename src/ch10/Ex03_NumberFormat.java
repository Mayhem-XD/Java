package ch10;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03_NumberFormat {
    public static void main(String[] args) {
        String str = "100원";
        String pattern = "\\d+";

//        int value = Integer.parseInt(str.replace("원",""));
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        if (m.find()) {
            String matchedText = m.group();
            int value = Integer.parseInt(matchedText);
            System.out.println(value);
        }
    }
}
