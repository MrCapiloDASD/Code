public class stringsExercise {

    public static void main(String[] args) {

        // -------------------------------------------------------
        // Setup – do NOT change this line
        // -------------------------------------------------------
        String sentence = "The quick brown fox jumps over the lazy dog";

        System.out.println("Original sentence:");
        System.out.println(sentence);
        System.out.println();

        // -------------------------------------------------------
        // SECTION 1 – toUpperCase()
        // Convert the entire sentence to UPPER CASE and store
        // the result in a variable called "upperSentence".
        // Print a label and then the result.
        //
        // Expected output:
        //   Upper case:
        //   THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
        // -------------------------------------------------------

        // TODO: declare String upperSentence and assign the upper-case version
        String upperSentence = null; // replace null with your code

        System.out.println("Upper case:");
        System.out.println(upperSentence);
        System.out.println();

        // -------------------------------------------------------
        // SECTION 2 – toLowerCase()
        // Convert the entire sentence to lower case and store
        // the result in a variable called "lowerSentence".
        // Print a label and then the result.
        //
        // Expected output:
        //   Lower case:
        //   the quick brown fox jumps over the lazy dog
        // -------------------------------------------------------

        // TODO: declare String lowerSentence and assign the lower-case version
        String lowerSentence = null; // replace null with your code

        System.out.println("Lower case:");
        System.out.println(lowerSentence);
        System.out.println();

        // -------------------------------------------------------
        // SECTION 3 – substring()
        //
        // Part A: Extract "quick brown fox" from the sentence.
        //         Hint: it starts at index 4 and ends before index 19.
        //         Store it in a variable called "subA".
        //
        // Part B: Extract everything from the word "jumps" to
        //         the end of the sentence (index 20 onwards).
        //         Store it in a variable called "subB".
        //
        // Print labels and both results.
        //
        // Expected output:
        //   Substring (index 4 to 19):
        //   quick brown fox
        //   Substring (index 20 to end):
        //   jumps over the lazy dog
        // -------------------------------------------------------

        // TODO: Part A
        String subA = null; // replace null with your code

        // TODO: Part B
        String subB = null; // replace null with your code

        System.out.println("Substring (index 4 to 19):");
        System.out.println(subA);
        System.out.println("Substring (index 20 to end):");
        System.out.println(subB);
        System.out.println();

        // -------------------------------------------------------
        // SECTION 4 – Indexing with charAt() and indexOf()
        //
        // Part A: Use charAt() to find the character at index 10
        //         and store it in a variable called "charAtTen".
        //
        // Part B: Use indexOf() to find the first position of the
        //         word "fox" in the sentence and store it in an
        //         int variable called "foxIndex".
        //
        // Print labels and both results.
        //
        // Expected output:
        //   Character at index 10:
        //   o
        //   Index of "fox":
        //   16
        // -------------------------------------------------------

        // TODO: Part A
        char charAtTen = ' '; // replace with your code

        // TODO: Part B
        int foxIndex = -1; // replace with your code

        System.out.println("Character at index 10:");
        System.out.println(charAtTen);
        System.out.println("Index of \"fox\":");
        System.out.println(foxIndex);
        System.out.println();

        // -------------------------------------------------------
        // SECTION 5 – replace()
        //
        // Part A: Replace every occurrence of "the" with "a"
        //         and store the result in "replacedA".
        //         (Note: Java's replace is case-sensitive, so only
        //          lower-case "the" will be replaced.)
        //
        // Part B: Replace "lazy dog" with "sleeping cat"
        //         and store the result in "replacedB".
        //
        // Print labels and both results.
        //
        // Expected output:
        //   After replacing "the" with "a":
        //   The quick brown fox jumps over a lazy dog
        //   After replacing "lazy dog" with "sleeping cat":
        //   The quick brown fox jumps over the sleeping cat
        // -------------------------------------------------------

        // TODO: Part A
        String replacedA = null; // replace null with your code

        // TODO: Part B
        String replacedB = null; // replace null with your code

        System.out.println("After replacing \"the\" with \"a\":");
        System.out.println(replacedA);
        System.out.println("After replacing \"lazy dog\" with \"sleeping cat\":");
        System.out.println(replacedB);
        System.out.println();

        // -------------------------------------------------------
        // BONUS CHALLENGE (optional)
        // -------------------------------------------------------
        // Combine what you have learned:
        // 1. Take the substring from index 4 to 19 ("quick brown fox").
        // 2. Convert it to upper case.
        // 3. Replace "BROWN" with "RED".
        // 4. Print the final result.
        //
        // Expected output:
        //   Bonus result:
        //   QUICK RED FOX

        // TODO: Write your bonus code here


    }

}
