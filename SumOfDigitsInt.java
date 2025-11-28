import java.util.*;

public class SumOfDigitsInt {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number you want to sum all the digits :");
        int num = sc.nextInt();
        int remainder ;
        int ReverseInt = 0 ;

        while (num > 0){
            remainder = num % 10;
            ReverseInt += remainder ;
            num = num / 10 ;
        }
        System.out.println("The sum of the digits is :"+ ReverseInt);
    }
}
