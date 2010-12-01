//List fuer Fuhrparks und Fahrzeuge in Fuhrpark
class List {
	//inv: elem
	protected class Node { 
		IdAdmin elem; 
		Node next = null;
		//post: new node is established
		Node (IdAdmin elem){ 
			this.elem = elem; 
		}

	}
	
	protected Node head = null; 
	protected Node tail = null; 

	protected class ListIter implements Iter{
		protected Node p = head; 
		//post: returns the next element in the List
		public IdAdmin next() { 
			if (p == null) return null;
			IdAdmin elem = p.elem;
			p = p.next;
			return elem;
		}
		//post: returns true if the next Nod is not Null
		public boolean hasNext() { 
			return p != null;
		}
	}
	//post: adds a new Node to List
	public void addNode (IdAdmin x) {
		if (head == null) tail = head = new Node(x);
		else tail = tail.next = new Node(x);
	}
	//post: removes a Node
	public void removeNode(IdAdmin x){
		removeNodeById(x.getId());
	}
	//post: returns a new iterator from this List
	public Iter getIterator() { 
		return new ListIter();
	}
	
	//pre: id has to be int or String
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