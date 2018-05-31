// PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest
{
   public static void main(String[] args)
   {
      // create subclass objects
      SalariedEmployee5 salariedEmployee =
         new SalariedEmployee5("John", "Smith", "111-11-1111", 800.00);
      HourlyEmployee hourlyEmployee =
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
      CommissionEmployee5 commissionEmployee5 =
         new CommissionEmployee5(
            "Sue", "Jones", "333-33-3333", 10000, .06);
      BasePlusCommissionEmployee5 basePlusCommissionEmployee5 =
         new BasePlusCommissionEmployee5(
            "Bob", "Lewis", "444-44-4444", 5000, .04, 300);

      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n",
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee5, "earned", commissionEmployee5.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         basePlusCommissionEmployee5,
         "earned", basePlusCommissionEmployee5.earnings());

      // create four-element Employee array
      Employee5[] employees = new Employee5[4];

      // initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee5;
      employees[3] = basePlusCommissionEmployee5;

      System.out.printf("Employees processed polymorphically:%n%n");

      // generically process each element in array employees
      for (Employee5 currentEmployee : employees)
      {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee5)
         {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee5 employee =
               (BasePlusCommissionEmployee5) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         }

         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
      }

      // get type name of each object in employee array
      for (int j = 0; j < employees.length; j++)
         System.out.printf("Employees %d is a %s%n", j,
            employees[j].getClass().getName());
   } // end main
} // end classPayrollSystemTest
