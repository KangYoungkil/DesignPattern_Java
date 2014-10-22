import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	ArrayList<MenuItem> items;
	int pos = 0;

	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
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
}