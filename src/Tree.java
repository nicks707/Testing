
public class Tree {

	treeNode root;
	
	public void tree(){
		root = null;
	}
	
	public void insert(int val){
		treeNode tnode = new treeNode(val);
		if(root == null){
			root = tnode;
		}else{
			if(val>root.getData()){
				root.setRight(tnode);
			}else{
				root.setLeft(tnode);
			}
		}
	}
	
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
	
	public static void main(String[] args){
		Tree t = new Tree();
		t.insert(5);
		t.insert(3);
		t.insert(7);
		t.insert(4);
		t.insert(8);
		t.insert(2);
		t.insert(6);
		t.inorder(t.root);
		System.out.println("");
		t.preorder(t.root);
		System.out.println("");
		t.postorder(t.root);
	}
	
	
}
