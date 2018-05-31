// BasePlusEmployeeCommission5.java
// BasePlusCommissionEmployee5 class extends CommissionEmployee5

public class BasePlusCommissionEmployee5 extends CommissionEmployee5
{
   private double baseSalary; // base salary per week

   // constructor
   public BasePlusCommissionEmployee5 (String firstName, String lastName,
                                       String socialSecurityNumber, double grossSales,
                                       double commissionRates, double baseSalary)
   {
      super(firstName, lastName, socialSecurityNumber,
         grossSales, commissionRates);

      if (baseSalary < 0.0) // validate baseSalary
         throw new IllegalArgumentException("Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
   }

   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0) // validate baseSalary
         throw new IllegalArgumentException("Base salary must be >= 0.0");

      this.baseSalary = getBaseSalary();
   }

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }

   // calculate earnings; override method earnings in CommissionEmployee5
   @Override
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   }

   // return String representation of BasePlusCommissionEmployee object
   @Override
   public String toString()
   {
      return String.format("%s %s; %s: $%,.2f",
          "base-salaried", super.toString(),
          "base salary", getBaseSalary());
   }
} // end class BasePlusCommissionEmployee
