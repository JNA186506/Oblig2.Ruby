package no.hvl.dat102.insertionsort;

public class InsertionsortVanligMinsteForst {
	
	public static <T extends Comparable<? super T>> void insertionSort(T[] a) {
        insertionSort(a, 0, a.length - 1);
    }

    public static <T extends Comparable<? super T>> void insertionSort(T[] a, int forste, int siste) {

        T first = a[0];
        int idMin = 0;

        for (int k = 0; k < siste; k++) {
            if (a[k].compareTo(first) < 0)  {
                first = a[k];
                idMin = k;
            }
        }

        T temp = a[0];
        a[0] = first;
        a[idMin] = temp;

        for (int i = forste; i <= siste; i++) {

            int j = i - 1;
            T temp1 = a[i];

            while (j >= 0 && a[j].compareTo(temp1) > 0) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp1;

        }
    }

}
