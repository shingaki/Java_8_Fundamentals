// BasePlusEmployeeCommission4.java
// BasePlusCommissionEmployee4 class inherits from CommissionEmployee
// and accesses the super class's private data via inherited
// public methods.

public class BasePlusCommissionEmployee4 extends CommissionEmployee4
{
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee4 (String firstName, String lastName,
                                       String socialSecurityNumber, double grossSales,
                                       double commissionRates, double baseSalary)
   {
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

      this.baseSalary = getBaseSalary();
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
      return getBaseSalary() + super.earnings();
   }

   // return String representatin of BasePlusCommissionEmployee
   @Override
   public String toString()
   {
      return String.format(
         "%s %s%n%s: %.2f", "base-salaried commission employee",
         super.toString(), "baseSalary", getBaseSalary());

   }
} // end class BasePlusCommissionEmployee
