/*
java -cp /tmp/MyJEy5dKs7 HelloWorld
n = 5
1 3 6 10 15 
2 5 9 14 19 
4 8 13 18 22 
7 12 17 21 24 
11 16 20 23 25 

*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner o = new Scanner(System.in);
        int n=o.nextInt();
        int num = 1;
        int i=0,x=0,j=0,y=0;
        int mat[][] = new int[n][n];
        while(i<n && j<n){
            
            for(int row=x,col=j;row>=i&&col<=y;row--,col++){
                
                mat[row][col]=num++;
            }
            if(x == n-1)
               i++;
            else
               x++;
            if(y == n-1)
               j++;
            else
               y++;
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        o.close();
    }
}
