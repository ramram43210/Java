public class OrderPair<K, V>
{

	private K key;
	private V value;

	public OrderPair(K key, V value)
	{
		this.key = key;
		this.value = value;
	}

	public void setKey(K key)
	{
		this.key = key;
	}

	public void setValue(V value)
	{
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