
import java.util.*;

public class ReverseInt {
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number you want to print in reverse :");
            int inNum = sc.nextInt();
            int inDigit ;

        while (inNum > 0){
            inDigit = inNum%10;
            System.out.print(inDigit);
            inNum = inNum / 10 ;
        }
    }

}
