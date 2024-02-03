/*
n=3
  *
 * *
*   *
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.print("n=");
        Scanner o = new Scanner(System.in);
        int n= o.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<n+i;j++){
                if(i+j==n+1 || j==n+i-1)
                   System.out.print("*");
                else
                    System.out.print(" ");
                 
            }
            System.out.println();
        }

    }
}
