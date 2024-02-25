import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial value(u):");
        int u = sc.nextInt();
        System.out.println("Enter acceleration(a):");
        int a= sc.nextInt();
        System.out.println("Enter time(t):");
        int t = sc.nextInt();
       
        int d = u*t+(a*t*t)/2;
        System.out.println("Distance is:" + d);

    }
    
}
