import java.util.*;

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


    public void BFS_helper(GraphNode sv, Boolean isVisited[]){
        Queue<GraphNode> queue = new LinkedList<GraphNode>();

        queue.add(sv);
        isVisited[sv.index]=true;

        while(queue.size()!=0){
            GraphNode qq = queue.remove();
            System.out.print(qq.name+" ");

            for(int i=0;i<nodeList.size();i++){
                if(adjacencyMatrix[sv.index][i]==1 && isVisited[i]==false){
                    queue.add(nodeList.get(i));
                }
            }
        }
        
    }

    public void BFS(){
        Boolean isVisited[] = new Boolean[nodeList.size()];
        Arrays.fill(isVisited, Boolean.FALSE);

        for(GraphNode node:nodeList){
            BFS_helper(node,isVisited);
        }


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