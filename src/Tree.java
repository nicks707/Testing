
public class Tree {

	treeNode root;
	
	public void tree(){
		root = null;
	}
	
	//insert an element in the tree using the find 
	public void insert(int val, treeNode t){
		treeNode tnode = new treeNode(val);
		if(root == null){
			root = tnode;
		}else{
			treeNode p = find(val, t);
			if(p.getData()>val){
				p.setLeft(tnode);
			}else{
				p.setRight(tnode);
			}
		}
	    
	    
		
	}
	
	public treeNode find(int key, treeNode R){
		if(R.getData() == key){
			return R;
		
		}else if(R.getData()>key){
			if(R.getLeft()!=null){
				return find(key, R.getLeft());
			}
			return R;
		}else if(R.getData()<key){
			if(R.getRight()!=null){
				return find(key, R.getRight());
			}
			return R;
		}else{
			return null;
		}
		
		
	}
	// end of insert() and find()
	
	
	//minSum path problem of the interview
	//
	public int minSum(treeNode root){
		
		if(root == null){
			return 0;
			
		}
		int sum = root.getData();
		
		
		if(root.getLeft()!=null && root.getRight()!=null){
		    int left = minSum(root.getLeft());
		    int right = minSum(root.getRight());
		    

		    if(left <= right)
		        sum += minSum(root.getLeft());
		    else
		        sum += minSum(root.getRight());
		}else{
			if(root.getLeft()==null){
				sum += minSum(root.getRight());
				
			}else if(root.getRight()==null){
				sum+= minSum(root.getLeft());
			}
		}

		    return sum;
	}
	// minsum path problem end
	
	
	
	// find next larger element than a node Next() begin
	public treeNode Next(treeNode tnode){
		if(tnode.getRight()!=null){
			return leftDecendant(tnode.getRight());
		}else{
			return rightAncestor(tnode);
		}
	}
	
	public treeNode rightAncestor(treeNode tnode) {
		if(tnode == null){
			return null;
		}else{
			
		
		if(tnode.getData()<tnode.getParent().getData()){
			return tnode.getParent();
		}else{
			
				return rightAncestor(tnode.getParent());
			
			
		}
		}
	}

	public treeNode leftDecendant(treeNode right) {
		// TODO Auto-generated method stub
		if(right.getLeft()==null){
			return right;
		}else{
			return leftDecendant(right.getLeft());
		}
		
	}
	//Next() end
  
	LinkedList l = new LinkedList();
	//Range search 
	public LinkedList range(int x, int y, treeNode root){
		//LinkedList l = new LinkedList();
		treeNode next = find(x, root);
		while(next.getData()<=y){
			if(next.getData()>=x){
				l.append(next.getData());
				next = Next(next);
			}
		}
		return l;
	}
	//range search ends
	
	
	//DFS traversals begin
	public void inorder(treeNode root){
		if(root == null){
			return;
		}else{
		inorder(root.getLeft());
		System.out.print(root.getData()+" ");
		inorder(root.getRight());
		}
	}
	
	public void preorder(treeNode root){
		if(root == null){
			return;
		}
		System.out.print(root.getData());
		preorder(root.getLeft());
		preorder(root.getRight());
		
	}
	public void postorder(treeNode root){
		if(root == null){
			return;
		}
		
		preorder(root.getLeft());
		preorder(root.getRight());
		System.out.print(root.getData());
	}
	//DFS traversals end
	
	
	// main driver
	public static void main(String[] args){
		Tree t = new Tree();
		t.insert(5,t.root);
		t.insert(3,t.root);
		t.insert(7,t.root);
		t.insert(8,t.root);
		t.insert(2,t.root);
		t.insert(6,t.root);
		t.inorder(t.root);
		System.out.println("");
		t.preorder(t.root);
		System.out.println("");
		t.postorder(t.root);
		System.out.println("");
		System.out.println(t.minSum(t.root));
		LinkedList r;
		r = t.range(2,7,t.root);
		r.printList();
		//System.out.println("val of range printed");
	     treeNode t1 = t.Next(t.root.getRight());
	     System.out.println(t.minSum(t.root));
	      
	    
	    
		
		
		
	}
	
	
}
