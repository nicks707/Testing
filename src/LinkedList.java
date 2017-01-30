
public class LinkedList {
	private Node head;
	private Node tail;
	
	public LinkedList(){
		head = null;
		tail = null;
	}
	
	public void append(int key){
		Node newNode = new Node(key);
		if(head == null){
			//list is empty
			head = newNode;
		}else{
			Node p = head;
			while(p.getNext()!=null){
				p = p.getNext();
			}
			p.setNext(newNode);
		}
	}
	
	public void remove(){
		if(head==null){
			System.out.println("List is empty");
		}else{
			Node p = head;
			while(p.getNext().getNext()!=null){
				p= p.getNext();
			}
			p.setNext(null);
			
		}
	}
	
	public void reverse(){
		if(head == null){
			System.out.println("List is empty");
		}else{
			Node previous = null;
			Node current = head;
			Node next = null;
			
			while(current!=null){
			     next = current.getNext();
			     current.setNext(previous);
			     previous = current;
			     current = next;
			     
			     
			}
			this.head = previous;
		}
	}
	
	public void printList(){
		if(head == null){
		   System.out.println("List is empty");
		}else{
			Node p = head;
			while(p.getNext()!=null){
				System.out.print(p.getdata()+"-->");
				p = p.getNext();
			}
			System.out.println(p.getdata());
		}
	}

	public void reverseHalf(){
		
		if(head == null){
			System.out.println("List is empty");
		}else{
			Node first = head;
			Node second = head;
			Node pre = null;
			while(second.getNext()!=null && second!=null){
				
				if(second.getNext().getNext()!=null){
					pre = first;
					first =first.getNext();
				second=second.getNext().getNext();
				}else{
					break;
				}
			}
			System.out.println(pre.getdata()+"--"+first.getdata());
			
			Node next = null;
			Node previous = null;
			Node curr = first.getNext();
			
			while(curr != null){
				next = curr.getNext();
				curr.setNext(previous);
				previous = curr;
				curr = next;
			}
			first.setNext(previous);
			
			
		}
	}
	
	public boolean checkPalindrome(){
		boolean res = true;
		
		reverseHalf();
		
		Node fast = head;
		Node slow = head;
		
		
		return res;
	}
	
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		l.append(1);
		l.append(2);
		l.append(3);
		l.append(4);
		l.append(5);
		l.append(6);
		l.printList();

		l.remove();
		//l.remove();
		l.reverse();
		l.printList();
		l.reverseHalf();
		l.printList();
	}

}
