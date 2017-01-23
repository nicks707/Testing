
public class LinkedListStack {
	
	private Node head;
	private Node tail;
	
	public LinkedListStack(){
		this.head = null;
		this.tail = null;
	}
	
	public Node getHead(){
		return this.head;
	}
	public void setHead(Node val){
		this.head = val;
	}
	public void setTail(Node val){
		this.tail = val;
	}
	public Node getTail(){
		return this.tail;
	}
	
	public void insert(int key){
		Node newnode = new Node(key);
		if(head == null){
			setHead(newnode);
		}
		else{
			newnode.setNext(head);
			setHead(newnode);
			
			} 
			
		}
	public void top(){
		
		if(head == null){
			System.out.println("list is empty");
		}else{
			System.out.println("top item is "+head.getdata());
		}
	}
	
	public void pop(){
		if(head==null){
			System.out.println("list is empty");
			
		}else{
			System.out.println("popped item is "+head.getdata());
			head = head.getNext();
		}
	}
	
	public void printStack(){
		if(head==null){
			System.out.println("list is empty");
			
		}else{
			Node p = head;
			while(p.getNext()!=null){
		
	       System.out.print(p.getdata()+" -->");		
			p = p.getNext();
			}
			System.out.println(p.getdata());
			
		}
	}
	
	public static void main(String[] args){
	LinkedListStack stk = new LinkedListStack();
	stk.insert(1);
	stk.insert(2);
	stk.insert(3);
	stk.top();
	stk.insert(4);
	stk.top();
	stk.pop();
	
	stk.printStack();
	stk.top();
	stk.printStack();
	stk.pop();
	
	stk.printStack();
	}
	
	
	

}
