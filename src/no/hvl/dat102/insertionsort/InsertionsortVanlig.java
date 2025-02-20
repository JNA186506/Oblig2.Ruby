package no.hvl.dat102.insertionsort;

public class InsertionsortVanlig {
	
	public static <T extends Comparable<? super T>> void insertionSort(T[] a) {
        insertionSort(a, 0, a.length - 1);
    }

    public static <T extends Comparable<? super T>> void insertionSort(T[] a, int forste, int siste) {
    	
        for (int i = forste; i <= siste; i++) {

            int j = i - 1;
            T temp = a[i];

            while (j >= 0 && a[j].compareTo(temp) > 0) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp;

        }
    }

}
