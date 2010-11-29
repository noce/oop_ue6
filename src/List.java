class List {
	protected class Node { 
		Fahrzeug elem; 
		Node next = null;

		Node (Fahrzeug elem){ 
			this.elem = elem; 
		}
	}
	
	protected Node head = null; 
	protected Node tail = null; 

	protected class ListIter implements Iter<Fahrzeug>{
		protected Node p = head; 
		public Fahrzeug next() { 
			if (p == null) return null;
			Fahrzeug elem = p.elem;
			p = p.next;
			return elem;
		}
		public boolean hasNext() { 
			return p != null;
		}
	}
	
	public void addNode (Fahrzeug x) {
		if (head == null) tail = head = new Node(x);
		else tail = tail.next = new Node(x);
	}
	
	public Iter getIterator() { 
		return new ListIter();
	}
}