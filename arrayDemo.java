package com.bHaNuChand.Collection;

public class arrayDemo {

	public static void main(String[] args) {
		
		Object[] o = new Object[5];
		
		o[0]=42;
		o[1]=21;
		o[2]=42.21;
		o[3]="bhanu";
		o[4]=1415;
		o[2]='j';
		for (int i = 0; i < o.length; i++) {
			System.out.println("++++++     "+o[i]);
		}	
		/*int[] a = new int[10];
		
	a[0] = 20;
		
		
		for (int i = 0; i < a.length; i++) {
			
			
			System.out.println("****"+a[i]);
		}
		*/
		
	}
}
