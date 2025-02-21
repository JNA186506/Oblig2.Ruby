package no.hvl.dat102.main;

import java.util.Random;

import no.hvl.dat102.insertionsort.*;

public class MainInsertionSort {
	
	public static void main(String[] args) {
		
		String delelinje = "+---------+-----------------+---------------+-----------------+";
		System.out.println(delelinje);
		System.out.println("|    N    | Antall Målinger | Målt tid      | Teoretisk tid   |");
		System.out.println(delelinje);

		Random tilfeldig = new Random((long) Math.floor(Math.random() * 1000));
		int n = 32000;
		int antal = 10;
		long start = 0;
		long slutt = 0;
		Integer[][] a = new Integer[antal][n];
		Integer[][] b = new Integer[antal][n * 2];
		Integer[][] c = new Integer[antal][n * 4];
		// set inn tilfeldige heiltal i alle rekker
		for (int i = 0; i < antal; i++){
			int j = 0;
			while (j < n){
				a[i][j] = tilfeldig.nextInt();
				b[i][j] = tilfeldig.nextInt();
				c[i][j] = tilfeldig.nextInt();
				j++;
			}
			while (j < n * 2) {
				b[i][j] = tilfeldig.nextInt();
				c[i][j] = tilfeldig.nextInt();
				j++;
			}
			while (j < n * 4) {
				c[i][j] = tilfeldig.nextInt();
				j++;
			}
		}
		
		start = System.currentTimeMillis();// start tidsmåling
		for (int i = 0; i < antal; i++){
			Insertionsort.insertionSort(a[i]); // a[i] blir ein eindimensjonal tabell
		}
		slutt = System.currentTimeMillis();// slutt tidsmåling
		double dur = ((double) (slutt-start)) / antal;
		double con = dur / (n * n);
		Skrivut.skrivUt(n, antal, dur, dur);
		
		start = 0;
		slutt = 0;
		
		start = System.currentTimeMillis();// start tidsmåling
		for (int i = 0; i < antal; i++){
			Insertionsort.insertionSort(b[i]); // b[i] blir ein eindimensjonal tabell
		}
		slutt = System.currentTimeMillis();// slutt tidsmåling
		
		Skrivut.skrivUt(n * 2, antal,((double) (slutt-start)) / antal, (con * (n * 2) * (n * 2)));
		
		start = 0;
		slutt = 0;
		
		start = System.currentTimeMillis();// start tidsmåling
		for (int i = 0; i < antal; i++){
			Insertionsort.insertionSort(c[i]); // c[i] blir ein eindimensjonal tabell
		}
		slutt = System.currentTimeMillis();// slutt tidsmåling
		
		Skrivut.skrivUt(n * 4, antal,((double) (slutt-start)) / antal, (con * (n * 4) * (n * 4)));
		
	}

}
