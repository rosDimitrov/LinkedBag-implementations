package exercise3_Ring;

public class ArrayRIng<T> implements RingADT<T> {

	private T[] array;
	private static int DEFAULT_CAPACITY = 100;
	private int size;
	private int currentItemReference;

	public ArrayRIng() {
		@SuppressWarnings("unchecked")
		T[] temp = (T[]) new Object[DEFAULT_CAPACITY];
		array = temp;
		this.size = 0;
		this.currentItemReference = 0;
	}

	@Override
	public void advance() {
		if (currentItemReference < size) {
			currentItemReference++;
		} else if (currentItemReference == size) {
			currentItemReference = 0;
		}
	}

	@Override
	public boolean isAtLastPosition() {
		if (currentItemReference == array.length - 1)
			return true;
		return false;
	}

	@Override
	public void backToFirs() {
		currentItemReference = 0;
	}

	@Override
	public T getCurrentItem() {
		return array[currentItemReference];
	}

	@Override
	public boolean addItem(T item) {
		if (size == array.length) {
			array[size] = item;
			size++;
			return true;
		}

		return false;
	}

	@Override
	public void removeItem(T item) {

		// another way is:
		// When you find the item, make it be with the same value as the last
		// element
		// and then make the last element null;
		for (int i = 0; i < size; i++) {
			if (array[i].equals(item)) {
				for (int j = i; j < size - 1; j++) {
					array[j] = array[j + 1];
				}
				size--;
				break;
			}
		}
	}
}
