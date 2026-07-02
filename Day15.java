//graphs using adjList
/*import java.util.*;
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
}*/
//adjacent matrix
/*import java.util.*;
class Graph{
    ArrayList<ArrayList<Integer>> adjmtx;
    LinkedHashMap<Integer,Integer> vertexIndex;
    public Graph(){
        adjmtx=new ArrayList<>();
        vertexIndex=new LinkedHashMap<>();
    }
    public void addVertex(int vertex){
        if(!vertexIndex.containsKey(vertex)){
            vertexIndex.put(vertex,adjmtx.size());
            for(ArrayList<Integer> row:adjmtx){
                row.add(0);
            }
            ArrayList<Integer> newRow = new ArrayList<>();
            for(int ind=0;ind<=adjmtx.size();ind++){
                newRow.add(0);
            }
            adjmtx.add(newRow);
        }
    }
    public void addEdge(int source,int dest){
        addVertex(source);
        addVertex(dest);

        int row = vertexIndex.get(source);
        int col = vertexIndex.get(dest);

        adjmtx.get(row).set(col,1);
        adjmtx.get(col).set(row,1);
    }
}
class Day15{
    public static void main(String args[]){
        Graph g = new Graph();
        g.addEdge(10,20);
        g.addEdge(20,30);
        System.out.println(g.vertexIndex);
        for(ArrayList<Integer> row:g.adjmtx){
           System.out.println(row);
       }
    }
}*/
//Implemention using edge list
/*import java.util.*;
class Edge{
    String source,dest;
    public Edge(String source,String dest){
        this.source = source;
        this.dest = dest;
    }
}
class Graph{
    ArrayList<Edge> edgeList;
    public Graph(){
        edgeList=new ArrayList<>();
    }
    public void addEdge(String source,String dest){
        edgeList.add(new Edge(source,dest));
    }
    public void display(){
        for(Edge eg:edgeList){
            System.out.print(eg.source+"->"+eg.dest);
        }
    }
}
class Day15{
    public static void main(String args[]){
        Graph g = new Graph();
        g.addEdge("suma","teja");
        g.display();
    }
}*/
/*import java.util.*;
class Pair{
    int child,parent;
    public Pair(int child,int parent){
        this.child = child;
        this.parent = parent;
    }
}
class Graph{
    LinkedHashMap<Integer,ArrayList<Integer>> adjList;
    public Graph(){
        adjList = new LinkedHashMap<>();
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
    public void Level_traversal(int start){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited.add(start);
        while(!q.isEmpty()){
            int present = q.poll();
            System.out.print(present+" ");
            for(int neighbor:adjList.get(present)){
                if(!visited.contains(neighbor)){
                    q.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
    public boolean havnigcycle(int start){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(start,-1));
        visited.add(start);
        while(!q.isEmpty()){
            Pair present = q.poll();
            for(int neighbor:adjList.get(present.child)){
                if(!visited.contains(neighbor)){
                    q.offer(new Pair(neighbor,present.child));
                    visited.add(neighbor);
                }
                else if(neighbor!=present.parent){
                    return true;
                }
            }
        }
        return false;
    }
    public void dfs(int start)
    {
        HashSet<Integer> visited=new HashSet<>();
        dfsHelper(start,visited);
    }
    public void dfsHelper(int current,HashSet<Integer> visited)
    {
        visited.add(current);
        System.out.print(current+" ");
        for(int neighbour:adjList.get(current))
        {
           if(!visited.contains(neighbour))
           {
            dfsHelper(neighbour,visited);
           }
           
        }
    }
    public boolean hasCycle(int start)
    {
        HashSet<Integer> visited=new HashSet<>();
        return hasCycleHelper(start,-1,visited);
    }
    public boolean hasCycleHelper(int current,int parent,HashSet<Integer> visited){
        visited.add(current);
        for(int neighbour:adjList.get(current))
        {
            if(!visited.contains(neighbour))
            {
                if(hasCycleHelper(neighbour,current,visited))
                {
                    return true;
                }
            }
            else if(neighbour!=parent)
            {
                return true;
            }
        }
        return false;
    }
    public int connectingComponents(){
        int count = 0;
        HashSet<Integer> visited = new HashSet<>();
        
        for(int vertex: adjList.keySet()){
            if(!visited.contains(vertex)){
                count ++;
                connectingComponentsHelper(vertex, visited);
            }
        }
        return count;
    }
    
    private void connectingComponentsHelper(int vertex, HashSet<Integer> visited){
        visited.add(vertex);
        for(int neighbour: adjList.get(vertex)){
            if(!visited.contains(neighbour)){
                connectingComponentsHelper(neighbour,visited);
            }
        }
    }
}
public class Day15{
    public static void main(String args[]){
        Graph g = new Graph();
        g.addEdge(10,19);
        g.addEdge(19,11);
        g.addEdge(17,11);
        g.addEdge(17,23);
        g.addEdge(1,2);
        g.addEdge(2,4);
        g.addEdge(2,3);
        g.addEdge(5,6);

        g.display();
        System.out.println("Level Order Traversal:");
        g.Level_traversal(10);
        System.out.println();
        System.out.println("Does the graph have a cycle? "+g.havnigcycle((10)));
        g.dfs(10);
        System.out.println("Does the graph have a cycle? "+g.hasCycle(10));
    
        System.out.println(g.connectingComponents());
    }
}*/
//topologic order or sort
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
    }
    public void display(){
        for(int vertex:adjList.keySet()){
            System.out.println(vertex+"->"+adjList.get(vertex));
        }
    }
    public void topologicalordering(){
        HashMap<Integer,Integer> in_degree = new HashMap<>();
        for(int vertex:adjList.keySet()){
            in_degree.put(vertex,0);
        }
        for(int vertex:adjList.keySet()){
            for(int neighbor:adjList.get(vertex)){
                in_degree.put(neighbor,in_degree.get(neighbor)+1);
            }
        }

        Queue<Integer> q= new LinkedList<>();
        for(int vertex:in_degree.keySet()){
            if(in_degree.get(vertex)==0) q.offer(vertex);
        }
        while(!q.isEmpty()){
            int current = q.poll();
            System.out.print(current+" ");
            for(int neighbor:adjList.get(current)){
                in_degree.put(neighbor,in_degree.get(neighbor)-1);
                if(in_degree.get(neighbor)==0) q.offer(neighbor);
            }
        }
    }
}
class Day15{
    public static void  main(String args[]){
        Graph g = new Graph();
        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(4,3);
        g.addEdge(4,2);
        g.addEdge(2,3);
        g.addEdge(5,2);
        g.addEdge(3,6);
        g.topologicalordering();


    }
}
    



























































































