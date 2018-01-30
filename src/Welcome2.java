// Fig. 2.3: Welcome2.java
// Printing a line of text with multiple statements

public class Welcome2 {
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      System.out.print("Welcome to ");
      System.out.println("Java Programming!");
      System.out.print("Welcome to ");
      System.out.println("Java Programming!");
   } // end method main
}


/*
Instead of one statement in the main method's body, we have 2 statements
   1 using the print method of the System.out object
   1 using the println method of the System.out object

   print method only prints what you give it as its' argument and
         leaves the cursor positioned for output of the next character immediately following the last characgter that was output
         then it continues from that location in the next statement where we print "Java Programming!"
         and b/c we use println method there, it then drops the cursor to th enext line
         so the code above will print each Welcome to Java Programming! on its own single line


 */
