public class aaronExample {
    public static void main(String[] args) {
//quote 1 make all lowercase
        String quote1 = "There’s no crying in baseball!";
        System.out.println(quote1.toLowerCase());

        //quote 2 starts the print from the word "life"
        String quote2 = "My mama always said life was like a box of chocolates. You never know what you’re going to get.";
        int lifestart = quote2.indexOf("life");
        System.out.println(quote2.substring(20));

        //quote 3 start print at We
        String quote3 = "Badges? We ain’t got no badges!  We don’t need no badges!  I don’t have to show you any stinking badges!";
        int startwe = quote3.indexOf("We ain");
        int endbadges = quote3.indexOf("no badges");
        System.out.println(quote3.substring(startwe, endbadges));
    }
}
