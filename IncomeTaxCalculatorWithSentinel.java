import java.util.*;

public class IncomeTaxCalculatorWithSentinel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double taxpayable;
        int SENTINEL = -1;

        System.out.println("Enter the taxable income (or -1 to end):");
        int taxableIncome = sc.nextInt();

        while (taxableIncome != SENTINEL) {
          if (taxableIncome <= 20000){
            taxpayable = 0 ;
        } else if ( taxableIncome <= 40000){
            taxpayable = 20000*0 + (taxableIncome - 20000) * 0.1 ;
        }else if ( taxableIncome <= 60000){
            taxpayable = 20000*0 + 20000 * 0.1 + (taxableIncome - 40000)*0.2 ;
        } else {
            taxpayable = 20000*0 + 20000 * 0.1 + 20000 * 0.2 + (taxableIncome - 60000)*0.3 ;
        }
        System.out.printf("The tax payable is :%.2f%n",taxpayable);
        System.out.println("Enter the taxable income (or -1 to end):");
            taxableIncome = sc.nextInt();
        }
        System.out.println("Bye !");

    }
}
