
//* Answer 3 *//


import java.util.Queue; 
import java.util.LinkedList; 
  

class Node { 
    int data; 
    Node left, right; 
  
    public Node(int val) { 
        data = val; 
        left = null; 
        right = null; 
    } 
} 
  

class Tree { 
  
    Node root; 
  
    public static void main(String args[])  
    { 
    	Tree bt = new Tree(); 
        bt.root = new Node(1); 
        bt.root.right = new Node(2); 
        bt.root.right.right = new Node(5); 
        bt.root.right.right.left = new Node(3);
        bt.root.right.right.left.right = new Node(4);
        bt.root.right.right.right = new Node(6); 
        
        System.out.println("The Level order traversal is - "); 
        bt.traverse(); 
    } 
    
    
    void traverse()  
    { 
        Queue<Node> queue = new LinkedList<Node>(); 
        queue.add(root); 
        while (!queue.isEmpty())  
        { 
 
            Node node = queue.poll(); 
            System.out.print(node.data + " "); 

            if (node.left != null) { 
                queue.add(node.left); 
            } 

            if (node.right != null) { 
                queue.add(node.right); 
            } 
        } 
    } 
  
    
} 