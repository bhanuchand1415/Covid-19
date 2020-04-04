package com.bHaNuChand.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class cursors {
	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("10");
		a.add("bhanu");
		a.add("chand");
		a.add("McLeran");
		a.add("10.12");
		a.add("10.12f");
		System.out.println(a);

		Iterator i= a.iterator();
		while (i.hasNext()) {

			try {
				String str = (String) i.next();
				System.out.println(str);
				if (str.equalsIgnoreCase("McLeran")) {
					System.out.println("WELCOME TO McLeran CLUB");
					
				}

			} catch (Exception e) {
				e.printStackTrace();
			}


		}


	}


}
