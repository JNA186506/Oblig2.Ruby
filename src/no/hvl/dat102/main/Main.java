package no.hvl.dat102.main;

import java.util.Random;

import no.hvl.dat102.flettesortering.Mergesort;
import no.hvl.dat102.insertionsort.*;
import no.hvl.dat102.quicksort.Quicksort;
import no.hvl.dat102.selectionsort.Selectionsort;

public class Main {
	
	public static void main(String[] args) {
		
		String delelinje = "+---------+----------+-----------------+";
		System.out.println(delelinje);
		System.out.println("|    N    | Målt tid | Teoretisk tid   |");
		System.out.println(delelinje);


		Random tilfeldig = new Random((long) Math.floor(Math.random() * 1000));
		int n = 32000;
		int antal = 10;
		long start = 0;
		long slutt = 0;
		Integer[][] a = new Integer[antal][n];
		Integer[][] b = new Integer[antal][n];
		Integer[][] c = new Integer[antal][n];
		Integer[][] d = new Integer[antal][n];
		// set inn tilfeldige heiltal i alle rekker
		for (int i = 0; i < antal; i++){
			for (int j = 0; j < n; j++){
				a[i][j] = tilfeldig.nextInt();
				b[i][j] = tilfeldig.nextInt();
				c[i][j] = tilfeldig.nextInt();
				d[i][j] = tilfeldig.nextInt();
			}
		}
		
		start = System.currentTimeMillis();// start tidsmåling
		for (int i = 0; i < antal; i++){
			Insertionsort.insertionSort(a[i]); // a[i] blir ein eindimensjonal tabell
		}
		slutt = System.currentTimeMillis();// slutt tidsmåling
		
		Skrivut.skrivUt(32000, ((double) (slutt-start) / 2), 32000);
		
		start = 0;
		slutt = 0;
		
		start = System.currentTimeMillis();// start tidsmåling
		for (int i = 0; i < antal; i++){
			Mergesort.mergesort(b[i]); // b[i] blir ein eindimensjonal tabell
		}
		slutt = System.currentTimeMillis();// slutt tidsmåling
		
		System.out.println(((double) (slutt - start)) / antal);
		
		start = 0;
		slutt = 0;
		
		start = System.currentTimeMillis();// start tidsmåling
		for (int i = 0; i < antal; i++){
			Quicksort.quickSort(c[i]); // c[i] blir ein eindimensjonal tabell
		}
		slutt = System.currentTimeMillis();// slutt tidsmåling
		
		System.out.println(((double) (slutt - start)) / antal);
		
		start = 0;
		slutt = 0;
		
		start = System.currentTimeMillis();// start tidsmåling
		for (int i = 0; i < antal; i++){
			Selectionsort.selectionSort(d[i]); // d[i] blir ein eindimensjonal tabell
		}
		slutt = System.currentTimeMillis();// slutt tidsmåling
		
		System.out.println(((double) (slutt - start)) / antal);
		
	}

}
