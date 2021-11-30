import java.util.ArrayList;

public class GRAPH{
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int adjacencyMatrix[][];

    public GRAPH(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }


    public void addUndirectedEdge(int v1, int v2){
        adjacencyMatrix[v1][v2]=1;
        adjacencyMatrix[v2][v1]=1;
    }


    public void printGRAPH(){
        StringBuilder s = new StringBuilder();
        s.append("    ");

        for(int i=0;i<nodeList.size();i++){
            s.append(nodeList.get(i).name+" | ");
        }

        s.append("\n");

        for(int i=0;i<nodeList.size();i++){
            s.append(nodeList.get(i).name + " : ");

            for(int j:adjacencyMatrix[i]){
                s.append(j+" | ");
            }
            s.append("\n");
        }

        System.out.println(s.toString());
    }
}