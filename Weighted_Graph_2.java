import java.util.ArrayList;

public class Weighted_Graph_2 {

    static class Edge {
        
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination,int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[]){

        // initially at every index of my array there is NULL values. There is no ArrayList is present ==> we have to create a empty arrayList at every index of the array.

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        // inserting data
        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        int vertex = 4;

        ArrayList<Edge> graph[] = new ArrayList[vertex];

        createGraph(graph);

        // Printing 2's neighbour's

        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.destination+" , "+e.weight);
        }

    }
}
