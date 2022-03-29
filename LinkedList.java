class Node {
	int data;
	Node next;
	
	Node (int data) {
		this.data = data;
		this.next = null;
	}
}	// end of Node class

class LinkedList {
	 Node head;
	public void addAtBeginning(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) head = newNode;
		else {
			newNode.next = head;
			head = newNode;		
		}
		
	} // end of add method
	public Node re(){
		return head;
	}
	public  void swap(Node n1, Node n2){
		Node p1= null;
		Node p2=null;
		Node temp=null;
		Node cur=head;
		while(cur.next!=null){
			if(cur.next==n1)
			p1=cur;
			if(cur.next==n2)
			p2=cur;
		cur=cur.next;}
			System.out.println(p1);
			temp=n1.next;
			p1.next=n2;
			p2.next=n1;
			n1.next=n2.next;
			n2.next=temp;

		
	}
	public  void swap(int v1, int v2){
		Node n1,n2,temp;
		Node p1=null;Node p2=null;
		n1=head;
		while(n1 != null && n1.data!=v1){
			p1=n1;
			n1=n1.next;	
			
		}
		n2=head;
		while(n2 != null && n2.data!=v2){
			p2=n2;
			n2=n2.next;	
			
		}
		if(p1!=null)
			p1.next=n2;
		else
			head=n2;
		if(p2!=null)
			p2.next=n1;
		else
			head=n1;
		temp=n1.next;
		n1.next=n2.next;
		n2.next=temp;

		
	}
	public void printAll() {	
		Node cur = head;
		while (cur.next != null){
			System.out.print(cur.data + ", ");
			cur = cur.next;
		}
		System.out.println(cur.data);
		
	}	// end of printAll method
	
	public boolean search(int value) {	
		Node cur = head;
		while (cur.next != null){
			if (cur.data == value)
				return true;
			cur = cur.next;
		}
		if (cur.data == value) return true;
		else return false;	
	}	// end of printAll method
	
	int len (){int len=0;
		Node cur=head;
		
	while (cur.next != null){
		
		cur=cur.next;
		len++;
	}
	return len+1;
	}
	boolean isEmpty() { return (head == null);}
	void deleteAt(int a){
		Node p=head;
		Node swp=null;
		if (a==0){
		head=head.next;	
		}
		for(int i =0;i<a-1;i++){
			p=p.next;
		}
		swp=p.next;
		p.next=swp.next;
	}
	public void deletel(){
		Node cur=head;
	
	for (int i=1;i<len()-1;i++){
		
		cur=cur.next;
	}
	cur.next=null;
	
	}
	
	public static void main(String args[]) {
		
		LinkedList list1 = new LinkedList();
		list1.addAtBeginning(5);
		list1.addAtBeginning(10);
		list1.addAtBeginning(15);
		list1.addAtBeginning(11);
		list1.addAtBeginning(13);
		list1.addAtBeginning(17);
		//list1.printAll();		
		//System.out.println(list1.len());
		//list1.search(10);
		//list1.deletel();
		list1.printAll();
		Node n1=list1.re();
		Node n2=n1.next;
		list1.swap(13,17);
		list1.printAll();
		
	}
	}




