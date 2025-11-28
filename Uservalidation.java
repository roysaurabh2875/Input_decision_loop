import java.util.Scanner;

public class Uservalidation {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        int numberIn;
        boolean isValid ;

        isValid = false ;
        do {
            System.out.println("Enter a number between (0-10) and (90-100):");
            numberIn = sc.nextInt();

            if((numberIn > 0 && numberIn < 10) || (numberIn > 90) && (numberIn < 100)){
                isValid = true ;
            }else {
                System.out.println("Invalid input, try again... ");
            }
        }while(!isValid );
        System.out.println("You have entered :"+numberIn);
}
}
