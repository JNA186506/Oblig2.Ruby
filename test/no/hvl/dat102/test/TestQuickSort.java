package no.hvl.dat102.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import no.hvl.dat102.quicksort.*;

class TestQuickSort {

	private Integer[] tab1;
    private Integer[] tab2;
    private Integer[] tab3;
	
	@BeforeEach
	void setUp() {
		
		tab1 = new Integer[]{2,6,4,1,2,9,3};
		tab2 = new Integer[]{1,2,2,3,4,6,9};
		tab3 = new Integer[100000];
		for(int i = 0; i < tab3.length; i++) tab3[i] = 1;
		
	}
	
	@Test
	void testSort() {
		
		Quicksort.quickSort(tab1);
		
		assertArrayEquals(tab2, tab1);
		
	}
	
	@Test
	void testSortLike() {
		
		Quicksort.quickSort(tab3);
		
	}

}
