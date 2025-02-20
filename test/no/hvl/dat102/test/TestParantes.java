package no.hvl.dat102.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.rekursjon.lenketstabel.ParantesSjekker;

class TestParantes {

	private String s1;
	private String s2;
	private String s3;
	private String s4;
	private String s5;

	@BeforeEach
	void setUp() {

		s1 = "{ [ ( ) ] }";
		s2 = "{ [ ( ) }";
		s3 = "[ ( ) ] }";
		s4 = "{ [ ( ] ) }";
		s5 = """
					class HelloWorld {
						public static void main(String[] args) {
							System.out.println("Hello World!");
						}
					}
				""";

	}

	@Test
	void test() {
		assertTrue(ParantesSjekker.sjekkParanteser(s1));
		assertFalse(ParantesSjekker.sjekkParanteser(s2));
		assertFalse(ParantesSjekker.sjekkParanteser(s3));
		assertFalse(ParantesSjekker.sjekkParanteser(s4));
		assertTrue(ParantesSjekker.sjekkParanteser(s5));
	}

}
