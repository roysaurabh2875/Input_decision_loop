import java.util.*;

public class Swap2Integers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int first_num, second_num, temp;

        System.out.println("Enter the first number :");
        first_num = sc.nextInt();

        System.out.println("Enter the Second number :");
        second_num = sc.nextInt();

        temp = second_num;
        second_num = first_num;
        System.out.println("AFTER Swap :");
        System.out.println("The first number is :" + temp);
        System.out.println("The second number is :" + first_num);
    }
}
