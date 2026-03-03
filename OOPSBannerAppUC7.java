public class OOPSBannerAppUC7 {

    // Static Inner Class to encapsulate Character and its Pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Method to build banner horizontally
    public static void displayBanner(String word, CharacterPatternMap[] maps) {

        int height = maps[0].getPattern().length;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                for (CharacterPatternMap map : maps) {
                    if (map.getCharacter() == ch) {
                        line.append(map.getPattern()[row]).append("  ");
                    }
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = {

            new CharacterPatternMap('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }),

            new CharacterPatternMap('P', new String[]{
                    "**** ",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ****",
                    "*    ",
                    " *** ",
                    "    *",
                    "**** "
            })
        };

        displayBanner("OOPS", maps);
    }
}