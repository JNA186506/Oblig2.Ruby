package no.hvl.dat102.main;

public class Skrivut {
	
	public static void skrivUt(int N, int antallMaalinger ,double tid, int tTid) {
        String delelinje = String.format("+%9s+%16s+%10s+%17s+%n", "-".repeat(9),"-".repeat(17) ,"-".repeat(10), "-".repeat(17));
        System.out.printf("| %-7d | %-15d | %-8.2f | %-15d |%n", N, antallMaalinger,tid, tTid);
        System.out.print(delelinje);
    }

}
