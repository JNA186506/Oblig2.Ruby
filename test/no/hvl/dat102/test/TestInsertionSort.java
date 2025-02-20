package no.hvl.dat102.test;

import static org.junit.jupiter.api.Assertions.*;

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
		
		Insertionsort.insertionSort(tab1);
		
		assertArrayEquals(tab2, tab1);
		
	}
	
	@Test
	void testSortVanlig() {
		
		InsertionsortVanlig.insertionSort(tab1);
		
		assertArrayEquals(tab2, tab1);
		
	}
	
	@Test
	void testSortMin() {
		
		InsertionsortVanligMinsteForst.insertionSort(tab1);
		
		assertArrayEquals(tab2, tab1);
		
	}
	
	@Test
	void testSortMinDobbel() {
		
		InsertionsortMinsteForst.insertionSort(tab1);
		
		assertArrayEquals(tab2, tab1);
		
	}
	
}
