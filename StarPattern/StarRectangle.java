
/*  Q1. WAP to print below pattern
        ***********
        ***********
        ***********
        ***********      */ 



import java.util.*;
public class StarRectangle {    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Input number of rows:");
    int r=sc.nextInt();

    System.out.print("Input number of Cols:");
    int c=sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
