import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculation {
    public static void main(String[] args) {

            double netPriceDouble = 9.99;
            double grossDouble = netPriceDouble * 1.23;
            System.out.println("-- Using double --");
            System.out.println("Net price: " + netPriceDouble);
            System.out.println("Gross price (+23% VAT): " + grossDouble);

            double totalGrossDouble = grossDouble * 10000;
            System.out.println("Total gross (x10,000 units): " + totalGrossDouble);

            double netBackDouble = totalGrossDouble / 1.23;
            System.out.println("Net back after removing VAT: " + netBackDouble);

            System.out.println("\n--- Using BigDecimal ---");
            BigDecimal netPriceBD = new BigDecimal("9.99");
            BigDecimal vat = new BigDecimal("1.23");

            BigDecimal grossBD = netPriceBD.multiply(vat);
            System.out.println("Gross price (+23% VAT): " + grossBD);

            BigDecimal totalGrossBD = grossBD.multiply(new BigDecimal("10000"));
            System.out.println("Total gross (x10,000 units): " + totalGrossBD);

            BigDecimal netBackBD = totalGrossBD.divide(vat, 10, RoundingMode.HALF_UP);
            System.out.println("Net back after removing VAT: " + netBackBD);

            System.out.println("\n--- Conclusion ---");
            System.out.println("double result:     " + netBackDouble);
            System.out.println("BigDecimal result: " + netBackBD);
            System.out.println("double has tiny floating-point errors, never use it for money!");
            System.out.println("BigDecimal is exact and safe for financial calculations.");
        }
    }

