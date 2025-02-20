package no.hvl.dat102.main;

public class Skrivut {
	
	public static void skrivUt(int N, int antallMaalinger ,double tid, double tTid) {
        String delelinje = String.format("+%9s+%16s+%15s+%17s+%n", "-".repeat(9),"-".repeat(17) ,"-".repeat(15), "-".repeat(17));
        System.out.printf("| %-7d | %-15d | %-13.2f | %-15.2f |%n", N, antallMaalinger,tid, tTid);
        System.out.print(delelinje);
    }

}
