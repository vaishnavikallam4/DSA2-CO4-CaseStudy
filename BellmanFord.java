public class BellmanFord {

    static class Edge {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }

    public static void main(String args[]) {

        int V = 5;
        int E = 7;

        Edge edges[] = new Edge[E];

        edges[0] = new Edge(0,1,4);
        edges[1] = new Edge(0,2,2);
        edges[2] = new Edge(1,2,1);
        edges[3] = new Edge(1,3,5);
        edges[4] = new Edge(2,3,8);
        edges[5] = new Edge(2,4,10);
        edges[6] = new Edge(3,4,2);

        int dist[] = new int[V];

        for(int i=0;i<V;i++)
            dist[i]=99999;

        dist[0]=0;

        for(int i=1;i<V;i++){

            for(int j=0;j<E;j++){

                int u=edges[j].src;
                int v=edges[j].dest;
                int w=edges[j].weight;

                if(dist[u]!=99999 && dist[u]+w<dist[v])
                    dist[v]=dist[u]+w;
            }
        }

        System.out.println("Vertex Distance");

        for(int i=0;i<V;i++)
            System.out.println(i+" "+dist[i]);
    }
}
