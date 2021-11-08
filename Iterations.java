import java.util.Scanner;


/**
 * Examples and notes on iterations (Chapter 6)
 *
 * @author mcallaghan
 * @version 04nov2021
 */
public class Iterations
{
    public static void whileExample()
    {
        /*
         * while loop:
         *  evaluates a boolean expression
         *          if true, executes the body of the loop and then re-evaluates the condition
         *          if false, skips the body and continues
         *      
         */
        int count = 1;          // initialization
        
        while (count <= 5)     // condition
        {
            System.out.println(count);  // body
            
            count++;                // update the looping variable   
        
        }
        
        System.out.println("Done.");
        
        // careful for infinite loops; often a result of not properly updating the loop variable or 
        //      writing an impossible loop condition.
    
    }
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         *      Three parts of the for loop statement
         *          1. initialization - executed once
         *          2. condition - boolean expression evaluated at the start of each iteration
         *          3. update the loop variable - executed at the *end* of each iteration *before*
         *                                          evaluating the condition again
         */
        for (int count = 1;              // initialization
             count <= 5;                 // condition
             count++)                    // update the loop variable
        {
            System.out.println(count);   // body
        }
        System.out.println("done");
        
        /*
         * variables declared within the for statement are scoped to the for statement and its body
         */
        //System.out.println("final value of count: " + count);

    }
    
    public static void forExample2()
    {
        int count = 1;
        for(    ;                           // initialization
                count <= 5;                 // condition
                )                    // update the loop variable
        {
            System.out.println(count);      // body
            count++;
        }
        
        System.out.println("done");
        
        System.out.println("final value of count: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error is common with for loops
         *      executing one too many or one too few times.
         *      
         * Carefully ask:  should the initial value start at 0 or 1?
         *                  should the condition < or <= ?
         *                  
         * "Think! Don't compile and try at random!"
         * 
         * By convention, for simple for loops we start at 0 and we use < .
         */
        
        // we want to print five "*"
        for (int i = 0;
             i <= 5;  // should be a <
             i++)
        {
            System.out.println("*");

        }
        
    
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop):
         *  1. executes the body of the loop
         *  2. evaluates the condition:
         *      if true, executes the body of the loop again
         *      if false, continues execution after the loop
         */
        
        int count = 1;    // initialization
        
        do
        {
            System.out.println(count);  // body
            
            count++;                    // update the loop variable
        
        }
        while (count <= 5);             // loop condition
    
        System.out.println("done.");
    }
    
    public static int sum()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value;
        
        do
        {
            System.out.print("Enter an integer that is positive (-1 to quit): ");
            
            /*
             * Sentinel value
             *      Value (e.g., -1) used to terminate a loop. It is often entered by a user.
             */
            value = s.nextInt();
            
            // this is a bug! sum is 1 less than it should be
            sum += value;
            
        }
        while (value != -1);
    
        return sum;
    }
    
    public static int sum2()
    {
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value = 0;
        
        do
        {
            System.out.print("enter a positive integer (-1 to quit): ");
            /*
             * The hasNextInt method of the Scanner class returns true if the next token to be read
             *      is an integer; otherwise, it return false. It does not consume the next token.
             *      If there are no tokens in the stream, it waits until there are.
             */
            if (s.hasNextInt() == false)
            {
                System.out.println("\"" + s.next() + "\" is not an integer; try again.");
                /*
                 * continue
                 *      1. immediately skips to the end of the inner-most loop
                 *      2. re-evalutes the loop condition at that point and continues if the condition
                 *          is true
                 */
                continue;
            }
            value = s.nextInt();
            if(value == -1)
            {
                /*
                 * break
                 *      Immediately exits the inner-most loop.
                 */
                break;
            } 
            sum += value;
                
        }
        while(value != -1);
        
        return sum;
    }
    
    
    
    
    
}
