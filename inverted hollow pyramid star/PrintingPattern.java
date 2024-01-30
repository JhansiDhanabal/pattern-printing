/*
n = 4
*******
 *   *
  * *
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
		int k=2*n-1;
		for(int i=0; i<n; i++) {
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int j=0;j<k;j++) {
				if(i==0 || j==0 || j==k-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			k-=2;
			System.out.println();
		}
		o.close();
	}

}
