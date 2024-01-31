/*
n, initialized = 4 3
6 6 6 6 
5 5 5 
4 4 
3 
*/

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("n, initialized = ");
        Scanner o = new Scanner(System.in);
        int n=o.nextInt(), num, initial;
        initial = o.nextInt();
        num = initial+n-1;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
            }
            num--;
            System.out.println();
        }
        o.close();
    }
}
