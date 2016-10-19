import java.util.ListIterator;
import java.util.NoSuchElementException;



public class LinkedList {

	private Node first;
	
	public LinkedList() {
		first = null;
	}
	
	public Object getFirst() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	
	public void addFirst(Object element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = first;
		first = newNode;
	}
	
	public Object removeFirst() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		Object element = first.data;
		first = first.next;
		return element;
	}
	
	class Node {
		public Object data;
		public Node next;
	}
	
	class LinkedListIterator implements ListIterator {
		private Node position;
		private Node previous;
		private boolean isAfterNext;
		
		public LinkedListIterator() {
			position = null;
			previous = null;
			isAfterNext = false;
		}
		
		public Object next() {
			
			if (!hasNext()) { throw new NoSuchElementException(); }
			previous = position;
			isAfterNext = true;
			
			if (position == null) {
				position = first;
			}
			else {
				position = position.next;
			}
			
			return position.data;
		}
		
		public boolean hasNext() {
			if (position == null) {
				return first != null;
			}
			else {
				return position.next != null;
			}
		}
		
		public void remove() {
			if (!isAfterNext) { throw new IllegalArgumentException(); }
			if (position == first) {
				removeFirst();
			}
			else {
				previous.next = position.next;
			}
			position = previous;
			isAfterNext = false;
		}
		
		public void set(Object element) {
			if (!isAfterNext) { throw new IllegalArgumentException(); }
			position.data = element;
		}

		@Override
		public void add(Object arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Object previous() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int previousIndex() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}
