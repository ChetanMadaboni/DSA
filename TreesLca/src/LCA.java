
class Node{
		int key;
		Node left;
		Node right;
		public Node(){
			
		}
		public Node(int key){
			this.key=key;
		}
		 public Node(int key,Node left,Node right){
			this.key=key;
			this.left=left;
			this.right=right;
		}
	}
public class LCA {
	Node root;
	
	
	static Node lca(Node root,int p,int q) {
		if(root==null) {
			return null	;
		}
		if(root.key==p ||root.key==q) {
			return root;			//if the required root is found then returns that root
		}
		Node left=lca(root.left,p,q);
		Node right=lca(root.right,p,q);
		if(left !=null && right!=null) {	//if both the elements are found 
			return root;
			
		}
		return (left!=null)?left:right;
	} 
	static int height(Node root) {
		if(root==null) {
			return 0;
		}
		int left=height(root.left);
		int right=height(root.right);
		if(left>right) {
			return left+1;
			
		}
		else {
			return right+1;
		}
	}
	public static void main(String[] args) {
		//LCA lca=new LCA();
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		///////////////
//		Node root=new Node(3);
//		root.left=new Node(5);
//		root.right=new Node(1);
//		root.left.left=new Node(6);
//		root.left.right=new Node(2);
//		root.left.right.left=new Node(7);
//		root.left.right.right=new Node(4);
//		root.right.left=new Node(9);
//		root.right.right=new Node(8);
		Node ele=lca(root,4,7);	
		System.out.println(ele.key);
		System.out.println(height(root));
	}

}
