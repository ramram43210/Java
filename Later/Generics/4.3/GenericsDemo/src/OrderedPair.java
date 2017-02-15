/**
 * Multiple Type Parameters
 */
interface Pair<K, V>
{
	public K getKey();

	public V getValue();
}

/**
 * As mentioned previously, a generic class can have multiple type parameters.
 * For example, the generic OrderedPair class, which implements the generic Pair
 * interface
 */
public class OrderedPair<K, V> implements Pair<K, V>
{

	private K key;
	private V value;

	public OrderedPair(K key, V value)
	{
		this.key = key;
		this.value = value;
	}

	public K getKey()
	{
		return key;
	}

	public V getValue()
	{
		return value;
	}
}