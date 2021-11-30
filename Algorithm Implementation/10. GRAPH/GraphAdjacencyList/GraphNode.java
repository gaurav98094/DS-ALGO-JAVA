import java.util.ArrayList;

public class GraphNode{
    String name;
    int index;
    
    ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

    public GraphNode(String name, int index){
        this.name = name;
        this.index = index;
    }

}