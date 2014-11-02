
public class NullIterator implements Iterator
{
	public Object next()
	{
		return null;
	}
	public void remove()
	{
		throw new UnsupportedOperationException();
	}

	public boolean hasNext()
	{
		return false;
	}
}
