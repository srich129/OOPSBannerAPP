/*
 * OOPS Banner App - UC8
 *
 * Use Case: Use Map for Character Patterns and Render via Function
 *
 * Drawback of UC7:
 * In UC7 we created character pattern objects manually and searched them
 * using linear search. This made the code complex and inefficient.
 *
 * UC8 Improvement:
 * Use HashMap to store characters and their banner patterns.
 * This allows fast lookup and better maintainability.
 *
 * Concept Used:
 * Java Map Collection (HashMap)
 */

import java.util.HashMap;
import java.util.Map;

public class BannerAppUC8 {

    // Map to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Method to load character patterns into the map
    public static void loadPatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Method to render the banner word
    public static void renderBanner(String word) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < word.length(); j++) {

                char ch = word.charAt(j);

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + " ");
                }
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        loadPatterns();

        String bannerWord = "OOPS";

        renderBanner(bannerWord);
    }
}
