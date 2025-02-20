package no.hvl.dat102.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;

class TestParentesSjekk {
	
	String s1;
	String s2;
	String s3;
	String s4;
	String s5;
	
	@Before
	void setUp() {
		
		s1 = "{ [ ( ) ] }";
		s2 = "{ [ ( ) }";
		s3 = "[ ( ) ] }";
		s4 = "{ [ ( ] ) }";
		s5 =
				"""
					class HelloWorld {
						public static void main(String[] args) {
							System.out.println("Hello World!");
						}
					}
				""";
		
	}
	
	@Test
	void testSjekkParentes() {
		
		assertTrue(ParentesSjekk.parentesSjekk(s1));
		assertFalse(ParentesSjekk.sjekkParentes(s2));
		assertFalse(ParentesSjekk.sjekkParentes(s3));
		assertFalse(ParentesSjekk.sjekkParentes(s4));
		assertTrue(ParentesSjekk.sjekkParentes(s5));
		
	}
	
}
