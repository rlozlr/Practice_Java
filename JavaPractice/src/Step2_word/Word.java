package Step2_word;

public class Word<K, V> {

	private K word;
	private V mean;
	
	public Word() {}

	public Word(K word, V mean) {
		this.word = word;
		this.mean = mean;
	}
	
	public K getWord() {
		return word;
	}

	public void setWord(K word) {
		this.word = word;
	}

	public V getMean() {
		return mean;
	}

	public void setMean(V mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return word + " : " + mean;
	}
	
}
