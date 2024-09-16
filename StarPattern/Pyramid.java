import java.util.*;

class Pyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);



/* print this structure 
      
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *  
     
    */
    int k=6;
    for (int row=k; row>=1;row--){
     for (int col=1;col>=k;col++){
         System.out.print("*");
     }
     System.out.print("");
    }
   /* print this structure 
      
     *
     * *
     * * *
     * * * * 
     
    */
        System.out.print("Enter the hieght of pyramid: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    
    }
}   

