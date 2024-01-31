/*
           3
           44
           555
           6666
*/
import java.util.*;
class HelloWorld1 {
    public static void main(String[] args) {
        System.out.print("n, initialized = ");
        Scanner o = new Scanner(System.in);
        int n=o.nextInt(), num, initial;
        initial = o.nextInt();
        num = initial;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
            }
            num++;
            System.out.println();
        }
        o.close();
    }
}
