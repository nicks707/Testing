
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
		}
		inorder(root.getLeft());
		System.out.println(root.getData()+" ");
		inorder(root.getRight());
	}
	
	public void preorder(treeNode root){
		if(root == null){
			return;
		}
		System.out.println(root.getData());
		preorder(root.getLeft());
		preorder(root.getRight());
		
	}
	public void postorder(treeNode root){
		if(root == null){
			return;
		}
	}
}
