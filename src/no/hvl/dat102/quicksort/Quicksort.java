package no.hvl.dat102.quicksort;

public class Quicksort {

    public static <T extends Comparable<? super T>> void quickSort(T[] a) {
        quickSort(a, 0, a.length - 1);
    }

    public static <T extends Comparable<? super T>> void quickSort(T[] a, int min, int max) {
    	
    	
    	
        if (min < max) {
            int pi = partition(a, min, max);
			quickSort(a, min, pi - 1);
            quickSort(a, pi + 1, max);
        }

    }

    private static <T extends Comparable<? super T>> int partition(T[] a, int min, int max) {
        int pi = max;

        int i = min - 1;

        for (int j = min; j <= max; j++) {
            if (a[j].compareTo(a[pi]) < 0) {
               i++;
               swap(a, i, j);
            }
        }

        swap(a, i + 1, pi);
        return i + 1;
    }
        private static <T extends Comparable<? super T>> void swap(T[] a, int i, int j){
            T temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
	
}
