
public class InsertionBST {

	
	 static class Node{ 
	    
		int data;
	    Node left;
	    Node right;
	 }
	    

static Node Insert(Node root,int value)
    {
        if(value<=root.data){
            if(root.left==null){
                Node temp = new Node();
	            temp.data=value;
	            temp.left=null;
	            temp.right=null;
                root.left = temp;
            }
            else
                root.left = Insert(root.left, value);
        }
        else{
            if(root.right==null){
                Node temp = new Node();
	            temp.data=value;
	            temp.left=null;
	            temp.right=null;
                root.right = temp;
            }
            else
                root.right = Insert(root.right, value);
        }
       return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node();
		
		Node ins = Insert(root,5);
		System.out.println(ins.data);
	}

}


/*
 * 
 * /* PLEASE DO NOT UNCOMMENT THIS BLOCK

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;
// No other imports are permitted

// The following definitions of Tree and Node are provided.
// insert and delete will be methods of class Tree.

public class Tree {
    private class Node {
        private int val;
        private Node left = null;
        private Node right = null;
        private Node mid = null;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;
*/ 

    /* 
     * Please complete this method.
     * Inserts val into the tree.
     */
/*    public void insert(int val) {
        root = insert(root, val);
    }
    public Node insert(Node root, int val){
        if(root==null)
            return new Node(val);
        Node temp= new Node(val);
        if(val==root.val){
            if(root.mid==null){
                root.mid= temp;
            }
            else
                root.mid= insert(root.mid, val);
        }
        else{
            if(val<root.val){
                if(root.left==null){
                    root.left=temp;
                }
                else
                    root.left= insert(root.left, val);
            }
            else{
                if(root.right==null){
                    root.right=temp;
                }
                else
                    root.right= insert(root.right, val);
            }
        }
        return root;
    }

    /* 
     * Please complete this method.
     * Deletes only one instance of val from the tree.
     * If val does not exist in the tree, do nothing.
     */
/*    public void delete(int val) {
        root= delete(root, val);
    }
    public Node delete(Node root, int val){
        if(root==null)
            return root;
        if(val==root.val){
            if(root.mid!=null){
                root.mid=null;
                return root;
            }
            else{
                if(root.left==null)
                    return root.right;
                else{
                    if(root.right==null)
                        return root.left;
                }
            }
            Node temp = root.right;
            int newrootval = temp.val;
            while(temp.left!=null){
                newrootval= temp.left.val;
                temp=temp.left;
            }
            root.val= newrootval;
            root.right= delete(root.right, root.val);
            return root;            
        }
        else{
            if(val < root.val){
                root.left= delete(root.left, val);
            }
            else{
                root.right= delete(root.right, val);
            }
        }
        return root;
    }
 */