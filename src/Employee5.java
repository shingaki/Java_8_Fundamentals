// Employee5.java
// Employee abstract superclass

public abstract class Employee5
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;

   // constructor
   public Employee5(String firstName, String lastName,
                    String socialSecurityNumber)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
   }

   // return first name
   public String getFirstName()
   {
      return firstName;
   }

   // return last name
   public String getLastName()
   {
      return lastName;
   }

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   }

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format("%s %s%nsocial security number: %s",
         getFirstName(), getLastName(), getSocialSecurityNumber());
   }

   // abstract method must be overridden by concrete subclass
   public abstract double earnings(); // no implementation here
} // end abstract class Employee5
