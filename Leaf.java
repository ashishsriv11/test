
//* Answer 1 *//

class Node { 
    int data; 
    Node left, right; 
  
    public Node(int val) { 
        data = val; 
        left = null; 
        right = null; 
    } 
    
    boolean isLeafNode() {
    	if(left == null && right == null)
    		return true;
		return false; 
		} 
	}



public class Leaf {

	Node root; 
	  
    public static void main(String args[])  
    { 
    	Leaf bt = new Leaf(); 
    	bt.root = new Node(8);
        bt.root.left = new Node(3);
        bt.root.left.left = new Node(1);
        bt.root.left.right = new Node(6);
        bt.root.left.right.left = new Node(4);
        bt.root.left.right.right = new Node(7);
        bt.root.right = new Node(10);
        bt.root.right.right = new Node(14);
        bt.root.right.right.left = new Node(13);
        
        traverseLeaves(bt.root);
       
    } 
	
    
    public static void traverseLeaves(Node node) { 
		
		if (node == null) { 
			return; 
			} 
		if (node.isLeafNode()) { 
			System.out.printf("%s ", node.data); 
			} 
		 
		traverseLeaves(node.right);
		traverseLeaves(node.left);
		} 
	
	}
	

