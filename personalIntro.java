public class personalIntro
{public static void main(String[] args)
    {

    // Declare variables for personal information
    String firstName = "Mike";
    String lastName = "Capilo";
    int age = 58; // Storing age as a number
    int gradeLevel = 12; // Current grade level
    String favoriteQuote = "What I cannot create. I do not understand. 'Richard Feynman'";
    int yearsTeaching = 20; // Number of challenges completed
    String filePath = "C:\\Users\\Alex\\Documents\\Java\\PersonalIntro.java";

    // Use concatenation to create full name
    String fullName = firstName + " " + lastName;

    /*
     * Print the header section with decorative border
     * Using \n for new lines and \t for tabs
     */
    System.out.println("================================");
    System.out.println("     STUDENT INTRODUCTION");
    System.out.println("================================");
    System.out.println(); // Empty line for spacing

    /*
     * Display personal information using concatenation
     * and special characters like \t (tab) and \" (quote marks)
     */
    System.out.println("Name: \"" + fullName + "\"");
    System.out.println("Age: \t\t" + age + " years old");
    System.out.println("Grade: " + gradeLevel + "th");
    System.out.println("Favorite Quote: \t\"" + favoriteQuote + "\"");
    System.out.println(); // Empty line for spacing

    // Display fun fact with number converted to string through concatenation
    System.out.println("Fun Fact: I've completed " + yearsTeaching + " years of teaching.");
    System.out.println(); // Empty line for spacing

    /*
     * Display file path using \\ (backslash escape sequence)
     * The double backslash is needed because \ is a special character
     */
    System.out.println("File Path: \t" + filePath);
}
}
