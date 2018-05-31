// BasePlusCommissionEmployee2.java
// private superclass members cannot be accessed in a subclass

public class BasePlusCommissionEmployee2 extends CommissionEmployee
{
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee2(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRates, double baseSalary)
   {
      // explict call to superclass CommissionEmployee constructor
      super(firstName, lastName, socialSecurityNumber,
         grossSales, commissionRates);

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0)
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
   }

   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0)
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
   }

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }

   // calculate earnings
   @Override
   public double earnings()
   {
      // not allowed: commissionRate and grossSales private in superclass
      return baseSalary + (getCommissionRate() * getGrossSales());
   }

   // return String representatin of BasePlusCommissionEmployee
   @Override
   public String toString()
   {
      return String.format(
         "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
         "base-salaried commission employee", getFirstName(), getLastName(),
         "social security number", getSocialSecurityNumber(),
         "gross sales", getGrossSales(), "commission rate", getCommissionRate(),
         "base salary", baseSalary);
   }
} // end class BasePlusCommissionEmployee
