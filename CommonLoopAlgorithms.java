import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Count Matches for Length
     * reads a series of words (ends with "quit")
     * counts the number of words of length greater than four
     * @return the number of words of length greater than four
     */
    public static int countMatchesForLength()
    {
        Scanner s = new Scanner(System.in);

        int longWords = 0;
        String word;

        do{
            System.out.print("Enter words (\"quit\" to exit): ");
            word = s.next();

            if (word.length() >= 4 && !word.equals("quit")){
                longWords += 1;
            }

        }
        while(!word.equals("quit"));

        return longWords;
    }

    /*
     * Loop Algorithm #2: Count Matches for Prefix
     * reads a series of words (ends with "quit")
     * counts the number of words that start with the substring "con"
     * @return the number of words  that start with the substring "con"
     */
    public static int countMatchesForPrefix()
    {
        Scanner s = new Scanner(System.in);
        String word;
        int counter = 0;
        do{

            System.out.println("Type in a word, type 'quit' to stop");
            word = s.next();
            String wonky = word.substring(0,3);
            if(wonky.equals("con")){
                counter += 1;

            }

        }
        while (!word.equals( "quit"));
        return counter;

    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        String word = "";
        Scanner s = new Scanner(System.in);
        int number = 0;

        do
        {
            System.out.print("Enter a word (enter quit to quit): ");
            word = s.next();

            if (word.length() >= 3)
            {
                String suffix = word.substring(word.length()-3);

                if (suffix.compareTo("est")==0)
                {
                    number++;
                }
            }
        }
        while (word.compareTo("quit")!=0);

        return number;
    }

    /*
     * Loop Algorithm #4: Reserve String
     * reads one word
     * reverses the characters in the word
     * @return a new string with the characters reversed
     */
    public static String reverseWord()
    {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        String newword = "";
        for ( int i = word.length() ; 
        i!=0 ; 
        i-=1  ){
            newword += word.substring(i-1,i);
        }
        System.out.println(newword);
        return newword;
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        Scanner in = new Scanner(System.in);
        String newInput = ""; // stores the most recent input from the console
        String oldInput = ""; // stores the second most recent input from the console
        int numberOfWords = -1; // stores the number of words entered so far; begins at -1 to account for the duplicate at the end

        do 
        {
            oldInput = newInput; 
            newInput = in.nextLine();
            numberOfWords ++;
        } 
        while (newInput.compareTo(oldInput) != 0); // continues while newInput is not the same as oldInput

        return numberOfWords;

        // how to not include non adjacent duplicates in final count? arrays?
    }

    /*
     * Loop Algorithm #6: Prompting until Criteria Is Met
     * prompts the user to enter a word that is alphabetically after "north"
     *        and has more than six characters
     * continues to prompt the user until the word meets the criteria
     * @return the word that meets the criteria
     */
    public static String promptUntilMatch()
    {
        int value = 0;
        String word = "";
        while (value <= 0)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your word");
            word = scanner.nextLine();
            word = word.toLowerCase();
            int wordLength = word.length();
            if (wordLength > 6)
            {
                value = word.compareTo("north");
            }
        }
        return word;

    }    


    /*
     * Loop Algorithm #7: Identify Individual Digits in an Integer (Extension)
     * Write an algorithm to identify the individual digits in an integer.
     * For example, if the integer 123456 is entered by a user, print each digit on its own line.
     */
    public static void identifyDigits(int intValue)
    {
        String value = Integer.toString(intValue);
        int loop = value.length();
        for (int i = 0; i < loop; i++)
        {
            System.out.println(value.substring(i, i + 1));
        }
    }

}