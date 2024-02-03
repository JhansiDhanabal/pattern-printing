/*
n=3
   *
 *  *
*    *
 *  *
   *
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.print("n=");
        Scanner o = new Scanner(System.in);
        int n= o.nextInt(), k;
        for(int i=1;i<=2*n-1;i++){
            k=i<=n?i:2*n-i;
            for(int j=1;j<n+k;j++){
                if(k+j==n+1 || j==n+k-1)
                   System.out.print("*");
                else
                    System.out.print(" ");
                 
            }
            System.out.println();
        }

    }
}
