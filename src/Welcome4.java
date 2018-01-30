// Fig. 2.6: Welcome4.java
// Displaying multiple lines with method System.out.printf.

public class Welcome4 {
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      System.out.printf("%s%n%s%n",
            "Welcome to", "Java Programming!");
   } // end method main
}


/*

- Demonstrate another method of the System.out object that allow syou to display output on th ecommand line
- printf == print formatted
- printf - takes as its first argument a format control string - may consist of literal characters to display but also
   formats specifier such as %s and %n - and those format specifiers tells printf what to do with the other arguments
   in the comma separated list that come after the first argument.

- %s is a placeholder for a string
- %n is the portable representation of a new line chawracter, %n will only work with printf, cannot use it with the System.out.print or
      the System.out.println method


- In this case, printf is receiving in its first parameter a 'string' placeholder, the first argument after the format control will be
      placed into that string placeholder, %n just says put a new line character here, have another %s - the second string will be put into this position
      then a new line

      Results of the program:
      Welcome to
      Java Programming!
 */