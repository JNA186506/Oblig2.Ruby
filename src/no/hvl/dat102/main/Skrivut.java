package no.hvl.dat102.main;

public class Skrivut {
	
	public static void skrivUt(int N, double tid, int tTid) {
        String delelinje = String.format("+%9s+%10s+%17s+%n", "-".repeat(9), "-".repeat(10), "-".repeat(17));
        System.out.printf("| %-7d | %-8.2f | %-15d |%n", N, tid, tTid);
        System.out.print(delelinje);
    }

}
