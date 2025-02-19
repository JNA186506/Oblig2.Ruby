package no.hvl.dat102.test;

public class InsertionsortTest {
	
	private Integer[] tab1;
    private Integer[] tab2;

    @BeforeEach
    void opprettTabell() {
        tab1 = new Integer[]{2,6,4,1,2,9,3};
        tab2 = new Integer[]{1,2,2,3,4,6,9};

    }

    @Test
    void testSortering() {
        InsertionSort.insertionSort(tab1);
        System.out.println();
        assertArrayEquals(tab2, tab1);
    }

    @Test
    void testVanlig() {
        InsertionSortVanlig.insertionSort(tab1);
        assertArrayEquals(tab2, tab1);
    }

    @Test
    void testMinsteForst() {
        InsertionSortVanligMinsteForst.insertionSort(tab1);
        assertArrayEquals(tab2, tab1);
    }


}
