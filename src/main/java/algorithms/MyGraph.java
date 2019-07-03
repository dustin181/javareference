package algorithms;

import java.util.Iterator;
import java.util.LinkedList;

public class MyGraph {

        int V;
        LinkedList<Integer> adj[];

        // constructor
        MyGraph(int V)
        {
            this.V = V;

            // define the size of array as
            // number of vertices
            adj = new LinkedList[V];

            // Create a new list for each vertex
            // such that adjacent nodes can be stored
            for(int i = 0; i < V ; i++){
                adj[i] = new LinkedList<>();
            }
        }


    // Adds an edge to an undirected graph
    static void addEdge(MyGraph graph, int src, int dest)
    {
        // Add an edge from src to dest.
        graph.adj[src].add(dest);

        // Since graph is undirected, add an edge from dest
        // to src also
        //graph.adj[dest].add(src);
    }

    // A utility function to print the adjacency list
    // representation of graph
    static void printGraph(MyGraph graph)
    {
        for(int v = 0; v < graph.V; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Integer pCrawl: graph.adj[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
    }

    // prints BFS traversal from a given source s
    void BFS(int s)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // Driver program to test above functions
    public static void main(String args[])
    {
        // create the graph given in above figure

        MyGraph graph = new MyGraph(10);

        addEdge(graph,0, 1);
        addEdge(graph,0, 6);
        addEdge(graph,0, 8);
        addEdge(graph,1, 0);
        addEdge(graph,1, 4);
        addEdge(graph,1, 6);
        addEdge(graph,1, 9);
        addEdge(graph,2, 4);
        addEdge(graph,2, 6);
        addEdge(graph,3, 4);
        addEdge(graph,3, 5);
        addEdge(graph,3, 8);
        addEdge(graph,4, 1);
        addEdge(graph,4, 2);
        addEdge(graph,4, 3);
        addEdge(graph,4, 5);
        addEdge(graph,4, 9);
        addEdge(graph,5, 3);
        addEdge(graph,5, 4);
        addEdge(graph,6, 0);
        addEdge(graph,6, 1);
        addEdge(graph,6, 2);
        addEdge(graph,7, 8);
        addEdge(graph,7, 9);
        addEdge(graph,8, 0);
        addEdge(graph,8, 3);
        addEdge(graph,8, 7);
        addEdge(graph,9, 1);
        addEdge(graph,9, 4);
        addEdge(graph,9, 7);

        graph.BFS(4);


        // print the adjacency list representation of
        // the above graph
        //printGraph(graph);
    }
}

