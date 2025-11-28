
import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String args[]) {
        int num1, num2, num3;
        int sum, pro, min, max;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number1 :");
        num1 = sc.nextInt();
        System.out.println("enter the number2 :");
        num2 = sc.nextInt();
        System.out.println("enter the number3 :");
        num3 = sc.nextInt();

        sc.close();

        sum = num1 + num2 + num3;

        pro = num1 * num2 * num3;

        min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Sum of the numbers is :" + sum );
        System.out.println("Product of three numbers is :"+ pro);
        System.out.println("minumum is :" + min);
        System.out.println("maximum is :" + max);
    }

}
