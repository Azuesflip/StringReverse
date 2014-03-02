/*
This program is used to take an input string froma user. It will then reverse
the string and output the result to the user.
*/

package stringreverse;

import java.util.*;

public class StringReverse 
{

    public static void main(String[] args) 
    {
        String original, output = "";
        Scanner in = new Scanner(System.in);
        
        int len;
        
        // Ask user for input.
        System.out.println("Enter the string you wish to reverse.");
        original = in.nextLine();
        
        // Reverse user input.
        len = original.length();
        
        for (int i = len - 1; i >= 0; i--)
        {
            output = output + original.charAt(i);
        }
        
        // Output results for user.
        System.out.println("The output of your string is: " + output);
    }
    
}