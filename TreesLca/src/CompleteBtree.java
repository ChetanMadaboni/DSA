import java.util.LinkedList;
import java.util.Queue;

public class CompleteBtree {
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
	
	static boolean isCbt(Node root) {
		Queue<Node> qu=new LinkedList<>();
		boolean flag=false;//
		if(root!=null) {
			qu.add(root);
		}
		while(!qu.isEmpty()) {
			Node cur=qu.remove();
			if(cur.left!=null) {
				if(flag==true) {
					return false;
				}
				qu.add(cur.left);
			}else {
				flag=true;
			}
			if(cur.right!=null) {
				if(flag==true) {
					return false;
				}
				qu.add(cur.right);
			}else {
				flag=true;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Node root =new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.right=new Node(6);
		if(isCbt(root)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
