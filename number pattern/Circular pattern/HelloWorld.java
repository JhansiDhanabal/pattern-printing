/*
java -cp /tmp/JfsNQ3HHV6 HelloWorld
n=5
5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5 

*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      System.out.print("n=");
      Scanner o=new Scanner(System.in);
      int n= o.nextInt(),p,m;
      for(int i=0;i<2*n-1;i++){
        for(int j=0;j<2*n-1;j++){
          p=i>n-1?(i-n)+2:n-i;
          m=j>n-1?(j-n)+2+n-j;
          if(p>m)
            System.out.print(p+" ");
          else
            System.out.print(m+" ");
        }
        System.out.println();
    }
    
}
}
