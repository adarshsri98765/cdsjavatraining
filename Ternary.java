import java.util.*;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();

        String string= (age>=18)?"Eligible" : "Not Eligible";

        System.out.println(string);
    }
}
