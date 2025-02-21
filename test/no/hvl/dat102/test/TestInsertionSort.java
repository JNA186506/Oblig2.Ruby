package no.hvl.dat102.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.*;

import no.hvl.dat102.insertionsort.*;

class TestInsertionSort {
	
	private Integer[] tab1;
    private Integer[] tab2;
	
	@BeforeEach
	void setUp() {
		
		tab1 = new Integer[]{2,6,4,1,2,9,3};
		tab2 = new Integer[]{1,2,2,3,4,6,9};
		
	}
	
	@Test
	void testSort() {
		// 1b
		Insertionsort.insertionSort(tab1);
		
		assertArrayEquals(tab2, tab1);
		
	}
	
	@Test
	void testSortVanlig() {
		// Standard
		InsertionsortVanlig.insertionSort(tab1);
		
		assertArrayEquals(tab2, tab1);
		
	}
	
	@Test
	void testSortMin() {
		// 1a
		InsertionsortVanligMinsteForst.insertionSort(tab1);
		
		assertArrayEquals(tab2, tab1);
		
	}
	
	@Test
	void testSortMinDobbel() {
		// 1c
		InsertionsortMinsteForst.insertionSort(tab1);
		
		assertArrayEquals(tab2, tab1);
		
	}
	
	@Test
	void testTid() {
		
		int n = 100000;
		
		Integer[] taba = new Integer[n];
		Integer[] tabb = new Integer[n];
		Integer[] tabc = new Integer[n];
		Integer[] tabd = new Integer[n];
		
		Random tilfeldig = new Random((long) (n));
		
		for(int i = 0; i < n; i++) {
			
			taba[i] = tilfeldig.nextInt();
			tabb[i] = tilfeldig.nextInt();
			tabc[i] = tilfeldig.nextInt();
			tabd[i] = tilfeldig.nextInt();
			
		}
		
		long start = 0;
		
		System.out.println("Standard insertion sort:");
		start = System.currentTimeMillis();
		InsertionsortVanlig.insertionSort(taba);
		System.out.println(System.currentTimeMillis() - start + "ms\n");
		
		System.out.println("1a:");
		start = System.currentTimeMillis();
		InsertionsortVanligMinsteForst.insertionSort(tabb);
		System.out.println(System.currentTimeMillis() - start + "ms\n");
		
		System.out.println("1b:");
		start = System.currentTimeMillis();
		Insertionsort.insertionSort(tabc);
		System.out.println(System.currentTimeMillis() - start + "ms\n");
		
		System.out.println("1c:");
		start = System.currentTimeMillis();
		InsertionsortMinsteForst.insertionSort(tabd);
		System.out.println(System.currentTimeMillis() - start + "ms\n");
		
	}
	
}
