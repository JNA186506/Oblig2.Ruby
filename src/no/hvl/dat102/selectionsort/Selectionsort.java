package no.hvl.dat102.selectionsort;

public class Selectionsort {

	public static <T extends Comparable<? super T>> void selectionSort(T[] a) {
        selectionSort(a, a.length);
    }

    public static <T extends Comparable<? super T>> void selectionSort(T[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int minIndeks = i;
                if (a[j].compareTo(a[minIndeks]) > 0) {
                    minIndeks = j;
                }

                T temp = a[i];
                a[i] = a[minIndeks];
                a[minIndeks] = temp;
            }
        }
    }
}
