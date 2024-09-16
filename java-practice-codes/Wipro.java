import java.util.*;

public class Try {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input value of  a = ");
        int a = sc.nextInt();
        System.out.print("input value of  b = ");
        int b = sc.nextInt();
        System.out.print("input value of  c = ");
        int c = sc.nextInt();
        System.out.print("nth = ");
        int n = sc.nextInt();

        int d1 = b - a;
        int d2 = c - b;
        System.out.println("diff between a & b = " + d1);
        System.out.println("diff between b & c = " + d2);
        int sum = a;
        System.out.println("Sum value before loop = " + sum);

        for (int i = 1; i < n; i += 2) {
            sum = sum + d1;
          //  System.out.println("sum after adding d1 = " + sum);
           // System.out.println("value of i = " + i);
        }
        for (int j = 1; j < n; j += 2) {
            sum = sum + d2;
          //  System.out.println("sum after adding d2 = " + sum);
          //  System.out.println("value of j = " + j);
        }
        System.out.println("nth Element = " +sum);
    }
}
