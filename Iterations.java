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
}
