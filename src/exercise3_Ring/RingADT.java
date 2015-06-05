package exercise3_Ring;

public interface RingADT<T> {

	// advance - to move to the next item
	public void advance();

	// isAtLastItem - to check whether to start over from the beginning
	public boolean isAtLastPosition();

	// back to the first item - to start over again if the last item was reached
	public void backToFirs();

	// get current item - to check the current position
	public T getCurrentItem();

	// add item - to add an item to the ring
	public boolean addItem(T item);

	// remove an item - to remove an item from the list
	public void removeItem(T item);

}
