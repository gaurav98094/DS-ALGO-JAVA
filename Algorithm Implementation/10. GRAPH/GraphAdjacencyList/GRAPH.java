import java.util.ArrayList;

public class GRAPH{
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public GRAPH(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int v1, int v2){
        GraphNode first = nodeList.get(v1);
        GraphNode second = nodeList.get(v2);


        first.neighbors.add(second);
        second.neighbors.add(first);
    }


    // For printing Graph to the console
    public void printGRAPH() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");

            for (int j =0; j < nodeList.get(i).neighbors.size(); j++) {
                if (j == nodeList.get(i).neighbors.size()-1 ) {
                s.append((nodeList.get(i).neighbors.get(j).name) );
                } else {
                s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        System.out.println(s.toString());
  }

}