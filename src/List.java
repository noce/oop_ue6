class List {
	protected class Node { 
		IdAdmin elem; 
		Node next = null;

		Node (IdAdmin elem){ 
			this.elem = elem; 
		}

	}
	
	protected Node head = null; 
	protected Node tail = null; 

	protected class ListIter implements Iter{
		protected Node p = head; 
		public IdAdmin next() { 
			if (p == null) return null;
			IdAdmin elem = p.elem;
			p = p.next;
			return elem;
		}
		public boolean hasNext() { 
			return p != null;
		}
	}
	
	public void addNode (IdAdmin x) {
		if (head == null) tail = head = new Node(x);
		else tail = tail.next = new Node(x);
	}
	
	public void removeNode(IdAdmin x){
		removeNodeById(x.getId());
	}
	
	public Iter getIterator() { 
		return new ListIter();
	}
	
	public void removeNodeById(Object id){
		Node prevNode = head;
		Node thisNode = head;
		boolean check = true;

		while(prevNode.next != null && check == true){

			if(thisNode.elem.getId().equals(id)){
				prevNode.next = thisNode.next;
				check = false;
			}
			prevNode = thisNode;
			thisNode = thisNode.next;
		}
	}

	public String toString(){
		return "";
	}
}