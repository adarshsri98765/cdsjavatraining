import java.util.*;

class swapping{
public static void main(String[] args) {
    
    System.out.println("Using third variable");


    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two values:");
    int a =sc.nextInt();
    int b=sc.nextInt();
    

    int t=a;
    a=b;
    b=t;

    System.out.println("a:"+a+"b: "+b);

    System.out.println("Without using third variable:");
    System.out.println("Enter two values:");

    int x=sc.nextInt();
    
    int y=sc.nextInt();

    x=x+y;
    y=x-y;
    x=x-y;

    System.out.println("x:"+x+"y: "+y);
}
}