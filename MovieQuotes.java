public class MovieQuotes {
    public static void main(String[] args) {
        // Initialize the original movie quotes
        String quote1 = "There's no crying in baseball!";
        String quote2 = "My mama always said life was like a box of chocolates. You never know what you're going to get.";
        String quote3 = "Badges? We ain't got no badges!  We don't need no badges!  I don't have to show you any stinking badges!";

        System.out.println("Original Movie Quotes Manipulation Program");
        System.out.println("==========================================\n");

        // Quote 1: Convert to lowercase
        String newQuote1 = quote1.toLowerCase();
        System.out.println("Quote 1 (lowercase):");
        System.out.println(newQuote1);
        System.out.println();

        // Quote 2: Start from the word "life" and print the rest
        int startIndex = quote2.indexOf("life");
        String newQuote2 = quote2.substring(startIndex);
        System.out.println("Quote 2 (starting from 'life'):");
        System.out.println(newQuote2);
        System.out.println();

        // Quote 3: Extract only "We ain't got no badges! "
        int startIndex3 = quote3.indexOf("We ain't got no badges!");
        int endIndex3 = startIndex3 + "We ain't got no badges! ".length();
        String newQuote3 = quote3.substring(startIndex3, endIndex3);
        System.out.println("Quote 3 (extracted portion):");
        System.out.println(newQuote3);
    }
}
