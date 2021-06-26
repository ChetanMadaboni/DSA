
public class isBst {
	static class Node{
		int key;
		Node left;
		Node right;
		Node(){
			
		}
		Node(int key){
			this.key=key;
		}
		Node(int key,Node left,Node right){
			this.key=key;
			this.left=left;
			this.right=right;
		}
		
	}
	static boolean isBst(Node root) {
		if(root==null) {
			return true;
		}
		if(root.left!=null && root.left.key>root.key) {
			return false;
		}
		if(root.right!=null && root.right.key<root.key) {
			return false;
		}
		if(isBst(root.left)||isBst(root.right)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Node root =new Node(9);
		root.left=new Node(3);
		root.right=new Node(11);
		root.left.left=new Node(1);
		root.left.right=new Node(4);
		root.right.left=new Node(10);
		root.right.right=new Node(12);
		System.out.println(isBst(root));
	}

}
