package com.bHaNuChand.Collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;

public class arrayListNLinkedList {
	public static void main(String[] args) {

		//list
		ArrayList a = new ArrayList();
		a.add(20);//true
		System.out.println(a.add(20));
		a.add("Mcleran");
		a.add(10.02);
		a.add(41.15f);
		a.add('A');
		a.add("Mcleran");
		a.add(20);
		System.out.println("1st arrayList   "+a);
		ArrayList a1 = new ArrayList();
		a1.addAll(a);
		a1.add(99);
		System.out.println("2nd arrayList   "+a1);
		ArrayList a2= new ArrayList();
		a2.addAll(a1);
		a2.add("Bugatti chiron");
		System.out.println("3nd arrayList   "+a2);

		
		//linkedList
		LinkedList l = new LinkedList(a2);
		System.out.println(l.getFirst());
		l.addFirst("Volvo v40");
		l.addLast("W Motors");
		l.set(1, null);
		System.out.println(l.getLast()); 
		System.out.println(a2);
		System.out.println("LinkedList   "+l+"\n");

		//set interface
		Set s = new HashSet(l);
		System.out.println( "set  "+s);

		//linkedHashset 
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(20);
		l1.add(20);
		l1.add("bhanu");
		l1.add("bhanu");
		System.out.println("LinkedHashSet    "+l1);
		
		//treeSet  1.sorting in nature 2.only homogeneous are allowed 4.null not allowed 
		TreeSet t = new TreeSet();
		t.add("justin");
		t.add("bhanu");
		t.add("chand");
		t.add("10");
		System.out.println("treeSet       "+t);
		
		
		//treeMap
		TreeMap tm = new TreeMap<>();
		tm.put(100, "Masda");
		tm.put(110, "McLeran");
		tm.put(113, "Volvo");
		tm.put(112, "Lamborghini");
		tm.put(111, null);

		System.out.println(" TreeMap    "+tm);
		
		//comparable
		
		
		









	}

}
