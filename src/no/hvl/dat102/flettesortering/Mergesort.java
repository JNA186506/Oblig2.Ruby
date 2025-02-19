package no.hvl.dat102.flettesortering;

public class Mergesort {
	public static <T extends Comparable<? super T>> void mergesort(T[] a) {
        mergesort(a, 0, a.length - 1);
    }

    private static <T extends Comparable<? super T>> void mergesort(T[] a, int min, int max) {

        if (min >= max) {

        }

        if (min < max) {
            int mid = min + (max - min) / 2;

            mergesort(a, min, mid);
            mergesort(a, mid + 1, max);

            merge(a, min, mid, max);
        }

    }

    private static <T extends Comparable<? super T>> void merge(T[] a, int min, int mid, int max) {

        int n1 = mid - min + 1;
        int n2 = max - mid;

        T[] L = (T[]) new Comparable<?>[n1];
        T[] R = (T[]) new Comparable<?>[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[min + i];
        for (int j = 0; j < n2; ++j)
            R[j] = a[mid + 1 + j];

        int i = 0, j = 0;

        int k = min;

        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

}
