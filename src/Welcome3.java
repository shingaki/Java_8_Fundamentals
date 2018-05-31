//Fig. 2.4: Welcome3.java
// Printing multiple lines with a single statement

public class Welcome3 {
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      System.out.println("Welcome%nto%nJava%nProgramming!");
   } // end method main
}

/*
Diff n this case is in the string literal contains special sequence of characters which is called 'escape' sequences (\n)
backslash n is an escape sequence and means new line escape sequence

when the backslash character appears in a string literal it means that the next character is part of the escape sequence
and together they represent a special character

\n tells the cursor to move to the next line for output
So here:
After the word Welcome, cursor moves to the next line
After the word to, cursor moves to the next line
etc.
println -- moves to the next line so any subsequent statements will be executed.

escape sequence is not portable when you get into file processing and networking and some more advanced Java concepts
it is fine when you are outputing to the command line

special sequences can be used to insert hexa and octa codes as well

There are other . . .
\t - tab character
\\ - actual backlash character into a string
\' - when you want to put a quote into a string literal

 */
