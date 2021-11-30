import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {


        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A",0));
        nodeList.add(new GraphNode("B",1));
        nodeList.add(new GraphNode("C",2));
        nodeList.add(new GraphNode("D",3));
        nodeList.add(new GraphNode("E",4));


        GRAPH gg = new GRAPH(nodeList);
        gg.addUndirectedEdge(0,1);
        gg.addUndirectedEdge(0,2);
        gg.addUndirectedEdge(0,3);
        gg.addUndirectedEdge(1,4);
        gg.addUndirectedEdge(3,4);
        gg.addUndirectedEdge(2,3);
        

        System.out.println("AGJASCENCY GRAPH");
        gg.printGRAPH();
    }
}