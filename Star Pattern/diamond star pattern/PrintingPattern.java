/*
n = 4
   *
  ***
 *****
*******
 *****
  ***
   *

*/
package jhansi;

import java.util.Scanner;

public class PrintingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("n = ");
		int n = o.nextInt();
		int k=1;
		for(int i=0; i<2*n-1; i++) {
			if(i>=n) {
				k-=2;
				for(int j=n;j<=i;j++)
					System.out.print(" ");
				for(int j=0;j<k;j++)
					System.out.print("*");
			}
			else {
				for(int j=n-1;j>i;j--)
					System.out.print(" ");
				for(int j=0;j<k;j++)
					System.out.print("*");
				k+=2;
				if(i+1 == n)
					k -= 2;
			}
			System.out.println();
		}
		o.close();
	}

}
