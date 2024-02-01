/*
java -cp /tmp/MyJEy5dKs7 HelloWorld
n = 6
1 2 6 7 15 16 
3 5 8 14 17 26 
4 9 13 18 25 27 
10 12 19 24 28 33 
11 20 23 29 32 34 
21 22 30 31 35 36 

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
        int i=0,x=0,odd=0;
        int mat[][] = new int[n][n];
        while(i<n){
            if(odd%2==0){
            for(int row=x,col=i;row>=i&&col<=x;row--,col++){
                
                mat[row][col]=num++;
            }
            }
            else{
            for(int row=i,col=x;row<=x&&col>=i;row++,col--){
                
                mat[row][col]=num++;
            }
            }
            odd++;
            if(x == n-1)
               i++;
            else
               x++;
            
        }
        for(i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        o.close();
    }
}
