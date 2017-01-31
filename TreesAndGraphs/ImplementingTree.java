import java.util.ArrayList;


public class ImplementingTree {

	/**
	 * @param args
	 */
	private static class Node{
		private String id;
		Node parent;
		ArrayList<Node> children = new ArrayList<Node>();
		
		public Node(Node parent){
			this.parent=parent;
		}
		
		public void setId(String id){
			this.id=id;
		}
		
		public String getId(){
			return id;
		}
		public ArrayList<Node> getChildren(){
			return children;
		}
		public Node getParent(){
			return parent;
		}
		
		private Node deleteRootNode(Node parent) throws Exception{
			if(parent.parent!=null)
				throw new Exception();
			Node newparent = null;
			if(!parent.getChildren().isEmpty()){
				newparent = parent.getChildren().get(0);
				newparent.setParent(null);
				parent.getChildren().remove(0);
				for(Node node: parent.getChildren()){
					node.setParent(newparent);
				}
				newparent.getChildren().addAll(parent.getChildren());
			}
			return newparent;
		}
		
		private void deleteAnyNode(Node node) {
			Node parent = node.parent;
			parent.getChildren().remove(node);
			for(Node each: node.getChildren()){
				each.setParent(parent);
			}
			parent.getChildren().addAll(node.getChildren());
		}

		private void setParent(Node parent) {
			// TODO Auto-generated method stub
			this.parent=parent;
		}
	}
	private static Node addChild(Node parent, String id){
		Node child = new Node(parent);
		child.setId(id);	
		parent.getChildren().add(child);
		return child;
	}
	private static void getRoot(Node node){
		if(node.parent==null){
			System.out.println("Root of the tree is: "+node.getId());
			return;
		}
		getRoot(node.parent);
		//return node;
		
	}
	private void printTree(Node root){
		System.out.println(root.getId());
		for(Node node: root.getChildren()){
			printTree(node);
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ImplementingTree T = new ImplementingTree();
		Node root = new Node(null);
		root.setId("root");
		
		Node child1 = addChild(root,"child-1");
		Node child11 = addChild(child1,"child-11");
		Node child12 = addChild(child1,"child-12");
		
		Node child2 = addChild(root,"child-2");
		Node child21 = addChild(child2,"child-21");
		Node child22 = addChild(child2,"child-22");
		
		T.printTree(root);
		
		
		Node delnode = new Node(null);
		delnode.deleteAnyNode(child2);
		
		T.printTree(root);
		getRoot(child2);
		
		Node newparent = new Node(null);
		newparent = newparent.deleteRootNode(root);
		T.printTree(newparent);
		
		getRoot(child22);
		//System.out.println(rootOf.getId());

	}

}
