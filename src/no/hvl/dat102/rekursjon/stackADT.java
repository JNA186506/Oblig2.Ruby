package no.hvl.dat102.rekursjon;

public interface stackADT<T> {
	
	public boolean isEmpty();
	
	public T peek();
	
	public T pop();
	
	public void push(T newEntry);

}
