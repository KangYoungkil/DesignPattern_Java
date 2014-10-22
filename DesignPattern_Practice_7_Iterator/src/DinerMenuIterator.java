public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int pos = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public Object next() {
		MenuItem item = items[pos];
		pos++;
		return item;
	}

	public boolean hasNext() {
		if (pos >= items.length) {
			return false;
		} else {
			return true;
		}
	}
}