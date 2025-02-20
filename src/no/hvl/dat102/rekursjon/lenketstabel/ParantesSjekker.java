package no.hvl.dat102.rekursjon.lenketstabel;

import no.hvl.dat102.rekursjon.stackADT;


public class ParantesSjekker extends TabellStabel<Character> {
	
	public static boolean sjekkParanteser(String s) {
		
		stackADT<Character> st = new TabellStabel<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch == '{' || ch == '[' || ch == '(') {
				st.push(s.charAt(i));
			}
			
			if (ch == '}' || ch == ']' || ch == ')') {
				if (st.isEmpty()) {
					return false;
				}
			}
			
			char c;
			
			switch (ch) {
			
			case '}':
				c = st.pop();
				if (c == '(' || c == '[') {
					return false;
				}
				break;
			
			case ']':
				c = st.pop();
				if (c == '(' || c == '{') {
					return false;
				}
				break;
				
			case ')':
				c = st.pop();
				if (c == '{' || c == '[') {
					return false;
				}
				break;
			}
			
			
		}
		return st.isEmpty();
	}

}
