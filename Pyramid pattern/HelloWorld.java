/*
n=3
   *
  ***
 *****
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("n=");
        Scanner o = new Scanner(System.in);
        int n= o.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<n+i;j++){
                if(i+j<=n)
                   System.out.print(" ");
                else
                   System.out.print("*");
            }
            System.out.println();
        }

    }
}
