import java.util.*;
public class input{

    public static void main(String[] args) {
        System.out.println("Welcome to DSA");
        int a, b, c;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the Values");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        c=a+b;
        System.out.println("result is "+c);
    }
}