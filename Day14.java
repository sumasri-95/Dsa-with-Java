/*class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        this.left=this.right = null;
    }
}
class BST{
    Node root;
    public BST(){
        this.root = null;
    }
    public void insert(int data){
        this.root = insert_helper(this.root,data);

    }
       
    private Node insert_helper(Node node,int data){
        if(node==null) return new Node(data);
        if(data<node.data) node.left=insert_helper(node.left,data);
        else if(data>node.data) node.right=insert_helper(node.right,data);
        return node;
    }
    public void in_order(){
        in_order_helper(this.root);
    }
    private void in_order_helper(Node node){
        if(node == null ) return;
        in_order_helper(node.left);
        System.out.print(node.data+" ");
        in_order_helper(node.right);
    }
    public int findmin(){
        if(this.root == null) return Integer.MIN_VALUE;
        Node present = this.root;
        while(present.left!=null) present = present.left;
        return present.data;
    }
    public int findmax(){
        if(this.root == null) return Integer.MAX_VALUE;
        Node present = this.root;
        while(present.right!=null) present = present.right;
        return present.data;
    }
    

}
class Day14{
    public static void main(String args[]){
        BST t = new BST();
        t.insert(19);
        t.insert(11);
        t.insert(27);
        t.insert(7);
        System.out.println(t.findmax());
        System.out.println(t.findmin());
        t.in_order();
    }
}*/
//graphs using adjList
import java.util.*;
class Graph{
    HashMap<Integer,ArrayList<Integer>> adjList;
    public Graph(){
        adjList = new HashMap<>();
    }
    public void addEdge(int source,int dest){
        if(!adjList.containsKey(source)){
            adjList.put(source,new ArrayList<>());
        }
        if(!adjList.containsKey(dest)){
            adjList.put(dest,new ArrayList<>());
        }
        adjList.get(source).add(dest);
        adjList.get(dest).add(source);
    }
    public void display(){
        for(int vertex:adjList.keySet()){
            System.out.println(vertex+"->"+adjList.get(vertex));
        }
    }
}
class Day14{
    public static void main(String args[]){
        Graph g = new Graph();
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.display();
    }
}

























































































