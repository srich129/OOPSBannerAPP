public class OOPSBannerAppUC6 {

    public static void main(String[] args) {

        // Build banner using static methods
        String[] banner = combine(O(), P(), S());

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method to generate 'O'
    public static String[] O() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static method to generate 'P'
    public static String[] P() {
        return new String[] {
            "***** ",
            "*    *",
            "***** ",
            "*     ",
            "*     "
        };
    }

    // Static method to generate 'S'
    public static String[] S() {
        return new String[] {
            " *****",
            "*     ",
            " *****",
            "     *",
            "***** "
        };
    }

    // Helper method to combine multiple letters into banner lines
    public static String[] combine(String[]... letters) {
        int height = letters[0].length;
        String[] result = new String[height];
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (String[] letter : letters) {
                line.append(letter[i]).append("  "); // add spacing between letters
            }
            result[i] = line.toString();
        }
        return result;
    }
}
