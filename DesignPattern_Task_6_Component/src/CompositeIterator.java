import java.util.ArrayList;

public class CompositeIterator implements Iterator
{
	ArrayList<MenuComponent> items;
	int pos = 0;

	public CompositeIterator(ArrayList<MenuComponent> items) {
		this.items = items;
	}

	public Object next() {
		Object object = items.get(pos);
		pos++;
		return object;
	}

	public boolean hasNext() {
		if (pos >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
	public void remove()
	{
		throw new UnsupportedOperationException();
	}
}