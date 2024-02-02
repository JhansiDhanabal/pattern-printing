/*
java -cp /tmp/JfsNQ3HHV6 HelloWorld
n=4
1 3 6 10 
2 5 9 13 
4 8 12 15 
7 11 14 16 

*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld1 {
    public static void main(String[] args) {
        System.out.print("n=");
        Scanner o = new Scanner(System.in);
        int n=o.nextInt(),k,start=1;
        for(int i=0;i<n;i++){
            k=start+i;
            start = k;
            System.out.print(start+" ");
            
            for(int j=2;j<=n;j++){
               k=(i+j>n)?k+2*n-(i+j)+1:k+i+j;
               System.out.print(k+" ");
            }
            System.out.println();
        }
        o.close();
    }
}
