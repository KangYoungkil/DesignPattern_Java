public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int pos = 0;
	int numberOfItems;

	public DinerMenuIterator(MenuItem[] items, int numberOfItems)
	{
		this.numberOfItems = numberOfItems;
		this.items = items;
	}

	public Object next() {
		MenuItem item = items[pos];
		pos++;
		return item;
	}

	public boolean hasNext() {
		if (pos >= numberOfItems)
		{
			return false;
		} else {
			return true;
		}
	}
}