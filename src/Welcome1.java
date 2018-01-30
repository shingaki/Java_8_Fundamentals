// Welcome1.java
// Text-printing program.

public class Welcome1
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      System.out.println("Welcome to Java Programming!");
   } // end method main
} // end class Welcome1

/*

Notes:

Lines 1 and 2
- all source code files through video we will typically have in the first line indication of what the file name
      is for the source code and a figure number as well - 2nd line will indicate the purpose of the program

// is the end line comment symbol - everything from that point to the end of the line
               is a comment and should be ignored by the compiler

start a comment is forward slash asterisk and end with asterisk slash
everything in between ignored by compiler

3rd form of comment
documentation comment - starting delimiter is forward slash asterisk asterisk and the end is asterisk slash
multi line comment
java doc comment
with tool will build documentation for your source code


- every single program created consists of at least one class definition
- lines 1 through 11 is a class definition for Welcome1
- will start with 'public class' - key words - and as we get into later chapters we will talk about non public classes
- folow key word 'class' with a class name - by convention class name start with capoital letter
      (can have letters, numbers, and underscores, and dollar signs But dollar signs are used by
      compiler so record not to use dollar signs)

- Java is case sensitive (must be all lowercase letters
- class name must be referended with a capital letter

- every class will start will start with an open curly brace and end with an ending curly base
- everything between is the scope of the class
- within the class Welcome1 - have single nested item called 'method'
- main method is the starting point fo every Java projgram . there are times when you don't need a main method
- usually have a comment b/4 method to state what the method is
- very first line of main method - method performs a task and the main method task is to get the program up and running
-           here the method is getting the program up and running but also display the words Welcome to Java Programming
- must be public, must be static, must return nothing as indicated with key word 'void'
- right of main is the parameter list - command line arguments -
- example: command line running the java program with parameters : java Welcome1 a b c
- every method like every class has a body with curly  braces
- in this method has a single statement - but method can consist of many statements performing many tasks
- semi colon is the terminator - indicating the end of the task that's being performed
- System.out is a pre-defined object; actually 'out' is the object that is defined in the class 'System'
- System and string are pre-defined classes that are part of Java and they are part of the Java library
      that is included for use in every single Java program you created
- Normally, when you use pre existing classes, you have to say so, by using an 'import declaration'
- but for any classes that is part of the Java.lang package, all those classes automatically available to every
      Java program because they are considered to be fundamental to Java
- System class contains the pre-defined method called 'out' -- the way to access a member inside of a class, use the
         the class name, then a period, and then the method name
- this is a special type of object known as a static object
- System.out is the standard output object and it's job is to display text at the command line by default
- 'out' object has a member that we would like to access called 'println' - which is a method that is defined by some
         class that is the data type (the type of the out object) called print stream  - its job is to take the argument you give it
           and display it and follow it with a new line that causes the cursor to move to the beginning of next line on the screen

- println is going to take the argument we give it in this case -- which is 'Welcome to Java Programming' - this is called a string lioteral -
            it will ignore the double quotes when it does the printing and simply display Welcome to Jvaa Programming!
- once task is done, it will move to next statement, there is not one, there is the end of the main body - main method terminate and in this case
         the program will terminate as well

- in the IDE (Intellij) - you can play by clicking the run button - run it directly in the IDEA - this is how you 'comnpile' and 'run' the program
    in the IDE

- Class name must match the file name exactly followed by the java extension (Welcome1.java)

- Compile and run program from command prompt window

   - javac Welcome1.java (no errors just give command prompt back)
   - now there is a .class file that has the byte codes that the Java machine knows how to execute
   - Java virtual machine is basically a piece of software that sits on top of the operating system and
               takes the java byte codes and translates them into stuff that the system understand (interpreter)
               combination of interpreter that understands the bytes code and just in time compiler that takes
                     the byte codes and converts them to native code
   - After compiling : type : java Welcome1 (java and the name of the class)


 */
