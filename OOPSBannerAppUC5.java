public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "*","*","*","*","*","*","*","*","*","*"),
                String.join("", "*"," "," ","WELCOME"," "," ","*"),
                String.join("", "*"," ","TO"," ","OOPS"," ","*"),
                String.join("", "*"," ","BANNER"," ","APP"," ","*"),
                String.join("", "*"," ","UC5"," ","ARRAY"," ","*"),
                String.join("", "*"," ","INIT"," ","DEMO"," ","*"),
                String.join("", "*","*","*","*","*","*","*","*","*","*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
