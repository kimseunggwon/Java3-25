package p13.textbook.exercise.ex03;

public class Container <K,V> {
	private K key;
	private V value;
	
	public void set(K key, V vlaue) {
		this.key =key;
		this.value =value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	
	
     
}