package p13.textbook.exercise.ex04;

public class Util {

	public static<K,V> Integer getValue(Pair<K, V> pair, K string) {
		K key =pair.getKey();
		
		if (key.equals(string)) {
			return pair.getValue();
		}
		
		
		return null;
	}
    
}
