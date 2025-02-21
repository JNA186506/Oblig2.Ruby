package no.hvl.dat102.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.*;

import no.hvl.dat102.quicksort.*;

class TestQuickSort {

	private Integer[] tab1;
    private Integer[] tab2;
    private Integer[] tab3;
    private Integer[] tab4;
	
	@BeforeEach
	void setUp() {
		
		tab1 = new Integer[]{2,6,4,1,2,9,3};
		tab2 = new Integer[]{1,2,2,3,4,6,9};
		tab3 = new Integer[100000];
		tab4 = new Integer[100000];
		Random tilfeldig = new Random((long) Math.floor(Math.random() * 1000));
		for(int i = 0; i < tab3.length; i++) {
			tab3[i] = 1;
			tab4[i] = tilfeldig.nextInt();
		}
		
	}
	
	@Test
	void testSort() {
		
		Quicksort.quickSort(tab1);
		for (Integer b : tab1) {
			System.out.print(b + " ");
		}
		assertArrayEquals(tab2, tab1);
		
	}
	
	@Test
	void testSortLike() {
		
		long start;
		
		System.out.println("Tabell med like");
		start = System.currentTimeMillis();
		Quicksort.quickSort(tab3);
		System.out.println(System.currentTimeMillis() - start + "\n");
		
		System.out.println("Tabell med forskjellige");
		start = System.currentTimeMillis();
		Quicksort.quickSort(tab4);
		System.out.println(System.currentTimeMillis() - start + "\n");
		
	}

}
