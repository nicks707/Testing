
public class treeNode {
 private int data;
 private treeNode left;
 private treeNode right;
 
 public treeNode(int val){
	 setData(val);
	 this.left = null;
	 this.right = null;
	 
 }
 
 public void setData(int key){
	 this.data = key;
 }
 public int getData(){
	 return this.data;
 }
 
 
 public void setLeft(treeNode tnode){
	 this.left = tnode; 
 }
 
 public void setRight(treeNode tnode){
	 this.right = tnode;
 }
 
 public treeNode getLeft(){
	 return this.left;
 }
 public treeNode getRight(){
	 return this.right;
 }
 
 
 
 
}
