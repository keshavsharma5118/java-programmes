import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Multiplication Table for: ");
        int n=sc.nextInt();
        System.out.print("Print table upto : ");
        int count=sc.nextInt();
for(int i=1;i<=count;i++){
System.out.println(n+" x "+i+" = "+n*i);
}
    }
}
