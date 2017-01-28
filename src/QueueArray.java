
public class QueueArray {

	int[] queue = new int[100];
	int read = 0;
	int write = 0;
	
	public void enqueue(int val){
		queue[write] = val;
		write++;
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
}
