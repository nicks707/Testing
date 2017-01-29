
public class QueueArray {

	private int[] queue; 
	private int read; 
	private int write; 
	
	public QueueArray(){
		queue = new int[6];
		read = 0;
		write = 0;
	}
	
	public void enqueue(int val){
		
		
		if(write < queue.length-1){
			queue[write] = val;
			write++;
		}
		else{
			if(write == read - 1){
				System.out.println("queue is full");
			}
			if(write >= queue.length -1 ){
				if(read == 0){
					System.out.println("queue is full");
				}else{
					write = 0;
					queue[write]=val;
				}
			}
			write = 0;
		}
		
	}
	public int dequeue(){
		if(read == write){
			System.out.println("queue is empty");
			return 0;
		}else{
			
			int val = queue[read];
			read++;
			return val;
			
		}
	}
	
	public static void main(String[] args){
		QueueArray q = new QueueArray();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		q.dequeue();
		q.enqueue(6);
	}
}
