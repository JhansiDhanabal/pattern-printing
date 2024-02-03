/*
n = 3
1    1
12  21
123321

*/
package jhansi;

import java.util.Scanner;

public class PrintingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("n = ");
		int n = o.nextInt(), k;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n;j++) {
				k = j<=n?j:2*n-j+1;
				if(k<=i)
					System.out.print(k);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		o.close();
	}

}
