import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    // Function to initialize character patterns
    public static Map<Character, String[]> loadPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    // Function to render banner word
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int row = 0; row < height; row++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(Character.toUpperCase(ch));

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                } else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = loadPatterns();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}