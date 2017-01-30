
public class treeNode {
 private int data;
 private treeNode left;
 private treeNode right;
 private treeNode parent;
 
 public treeNode(int val){
	 setData(val);
	 this.left = null;
	 this.right = null;
	 this.parent = null;
	 
 }
 
 public void setData(int key){
	 this.data = key;
 }
 public int getData(){
	 return this.data;
 }
 
 
 public void setParent(treeNode tnode){
	 this.parent = tnode;
 }
 public void setLeft(treeNode tnode){
	 this.left = tnode; 
	 tnode.parent = this;
 }
 
 public void setRight(treeNode tnode){
	 this.right = tnode;
	 tnode.parent = this;
 }
 
 public treeNode getLeft(){
	 return this.left;
 }
 public treeNode getRight(){
	 return this.right;
 }
 
 public treeNode getParent(){
	 return this.parent;
 }
 
 
 
 
}
