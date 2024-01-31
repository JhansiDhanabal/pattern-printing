import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner o = new Scanner(System.in);
        int n=o.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        o.close();
    }
}
