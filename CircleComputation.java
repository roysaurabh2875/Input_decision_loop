import java.util.*;

public class CircleComputation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double radius,diameter,circumference,area ;

        System.out.println("Enter the radius of circle :");
        radius = sc.nextDouble();

        diameter = 2.0*radius ;
        circumference = 2*Math.PI*radius;
        area = Math.PI*radius*radius;

System.out.printf("The  diameter is: %.2f%n:",diameter);
System.out.printf("The circumference of circle is: %.2f%n:",circumference);
System.out.printf("The area of circle is :%.2f%n",area);

    }
}
