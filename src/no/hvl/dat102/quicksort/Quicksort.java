package no.hvl.dat102.quicksort;

public class Quicksort {

	public static <T extends Comparable<? super T>> void quickSort(T[] a) {
		quickSort(a, 0, a.length - 1);
	}

	public static <T extends Comparable<? super T>> void quickSort(T[] a, int min, int max) {
		qsIterative(a, min, max);
	}
	
	private static <T extends Comparable<? super T>> int median(T[] a, int min, int max) {
		int pi = (min + max) / 2;

		if (a[min].compareTo(a[max]) > 0) {
			swap(a, min, max);
		}
		if (a[min].compareTo(a[pi]) > 0) {
			swap(a, pi, min);
		}
		if (a[pi].compareTo(a[max]) > 0) {
			swap(a, pi, max);
		}

		swap(a, pi, max);
		
		return pi;
		
	}
	
	private static <T extends Comparable<? super T>> void qsIterative(T[] a, int min, int max) {
		
		int[] stack = new int[max - min + 1]; //Bruker stack som en iterativ qs
		
		int top = -1; //Init på top-element
		
		//Pusher de første elementene på stacken
		stack[++top] = min;
		stack[++top] = max;
		
		//Poppe elementer mens stacken ikke er tom
		while (top >= 0) {
			
			//pop min og max
			max = stack[top--];
			min = stack[top--];
			
			//Pivot på riktig plass
			int p = partition(a, min, max);
			
			//hvis det er elementer på venstre, push
			if (p - 1 > min) {
				stack[++top] = min;
				stack[++top] = p - 1;
				
			}
			
			//hvis det er elementer på høyre, push
			if (p + 1 < max) {
				stack[++top] = p + 1;
				stack[++top] = max;
				
			}
		}
		
	}

	private static <T extends Comparable<? super T>> int partition(T[] a, int min, int max) {
		
		int pivotIndex = median(a, min, max);
		T pivot = a[pivotIndex];
		
		int i = min - 1;
		for (int j = min; j < max; j++) {
			if (a[j].compareTo(pivot) < 0) {
				i++;
				swap(a, i, j);
			}
		}
		
		swap(a, i + 1, max);
		return i + 1;
		
	}

	private static <T extends Comparable<? super T>> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
