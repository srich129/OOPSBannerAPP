public class OOPSBannerAppUC4 {

    public static void displayBanner() {

        String[] banner = {
                " *****  ",
                " *   *  ",
                " *****  "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        displayBanner();
    }
}
