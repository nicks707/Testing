
public class Node {
	private int data;
	private Node next;
	
	public Node(int key){
		setdata(key);
		setNext(null);
	}
	
	public int getdata(){
		return this.data;
	}
	
	public void setdata(int key){
		this.data = key;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public void setNext(Node nextNode){
		this.next = nextNode;
	}

}
