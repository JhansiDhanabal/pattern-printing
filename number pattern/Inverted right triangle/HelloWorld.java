/*
n = 4
10 9 8 7 
4 5 6 
3 2 
1 
*/

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner o = new Scanner(System.in);
        int n=o.nextInt(), num;
        for(int i=n;i>0;i--){
            if(i%2 == 0){
            num = (i*(i+1))/2;
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num--;
            }
            }
            else{
            num = (i*(i-1))/2+1;
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            }
            System.out.println();
        }
        o.close();
    }
}
