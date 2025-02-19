package no.hvl.dat102.insertionsort;

public class Insertionsort {

	public static <T extends Comparable<? super T>> void insertionSort(T[] a) {
		insertionSort(a, 0, a.length - 1);
	}

	public static <T extends Comparable<? super T>> void insertionSort(T[] a, int forste, int siste) {

		for (int i = forste; i < siste; i++) {

			T minste = a[i];
			T storste = a[i + 1];

			if (minste.compareTo(storste) > 0) {
				T temp1 = minste;
				minste = storste;
				storste = temp1;
			}

			int j = i - 1;

			while (j >= forste && a[j].compareTo(storste) > 0) {
				a[j + 2] = a[j];
				j--;
			}

			a[j + 2] = storste;

			while (j >= forste && a[j].compareTo(minste) > 0) {
				a[j + 1] = a[j];
				j--;
			}

			a[j + 1] = minste;

			if ((siste - forste) % 2 != 0) {
				T sisteElement = a[siste - 1];
				j = siste - 2;

				while (j >= forste && a[j].compareTo(sisteElement) > 0) {
					a[j + 1] = a[j];
					j--;
				}
				a[j + 1] = sisteElement;
			}

		}
	}

}
