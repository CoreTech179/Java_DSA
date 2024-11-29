import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_BFS {

    static class Edge {
        
        int source;
        int destination;

        public Edge(int source, int destination){
            this.source = source;
            this.destination = destination;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[]){

        // initially at every index of my array there is NULL values. There is no ArrayList is present ==> we have to create a empty arrayList at every index of the array.

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        // inserting data
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[5].add(new Edge(6,5));
    }

    public static void BFS(ArrayList<Edge> graph[],int vertex,boolean [] visited,int startingPoint){
        
        Queue<Integer> q = new LinkedList<Integer>();

        
        // initialize starting point
        q.add(startingPoint);

        while(!q.isEmpty()){

            int currentElement = q.remove(); // removing every element one by one 

            if(visited[currentElement]==false){

                System.out.println(currentElement);

                visited[currentElement] = true;

                for(int i=0;i<graph[currentElement].size();i++){

                    Edge e = graph[currentElement].get(i);

                    q.add(e.destination); // add the neighbours of that particular vertex into the queue
                }

            }
        }
    }

    public static void DFS(ArrayList<Edge> graph[],int currentElement,boolean [] visited){

        System.out.print(currentElement+" ");

        visited[currentElement] = true;

        // print neighbors of that currentElement vertex

        for(int i=0;i<graph[currentElement].size();i++){

            Edge e = graph[currentElement].get(i);

            if(visited[e.destination]==false){

                DFS(graph, e.destination, visited);

            }
        }

    }

    public static void findAllPaths(ArrayList<Edge> graph[],boolean [] visited,int currentElement,int target,String path){
        if(currentElement==target){
            System.out.println(path);
            return;
        }

        for(int i=0;i<graph[currentElement].size();i++){
            Edge e = graph[currentElement].get(i);
            if(visited[e.destination]==false){
                visited[currentElement]=true;
                findAllPaths(graph, visited, e.destination, target, path+e.destination);
                visited[currentElement]=false;
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        int vertex = 7;

        ArrayList<Edge> graph[] = new ArrayList[vertex];

        createGraph(graph);

        // This will work for also disconnected graph

        boolean [] visited = new boolean[vertex];

        // for disconnected sub graphs

        // for(int i=0;i<vertex;i++){
        //     if(visited[i]==false){

        //         BFS(graph, vertex,visited,i);

        //     }
        // }

        // Considering starting point as 0 in my graph
        // DFS(graph, 0, visited);

        // for disconnected sub-graphs
        // for(int i=0;i<vertex;i++){
        //     if(visited[i]==false){

        //         DFS(graph,i,visited);

        //     }
        // }

        findAllPaths(graph, visited,0, 5, "0");
    }
}
