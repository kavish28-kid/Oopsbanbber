import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        return map;
    }

    public static void printBanner(String text, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = map.get(ch);
                line.append(pattern[i]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        String word = "OOPS";

        printBanner(word, patternMap);
    }
}