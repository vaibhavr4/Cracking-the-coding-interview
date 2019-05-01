import java.util.*;
public class Main
{
  private static Map<Integer,Node> map = new HashMap();
  static class Node
  {
    int data;
    int rank;
    Node parent;
  }

  public static void makeSet(int data)
  {
    Node node = new Node();
    node.data = data;
    node.rank = 0;
    node.parent = node;
    map.put(data,node);
  }


  public static void union(int data1,int data2)
  {
    Node node1 = map.get(data1);
    Node node2 = map.get(data2);
    Node parent1 = findSet(node1);
    Node parent2 = findSet(node2);
    if(parent1.data==parent2.data)
      return;
    if(parent1.rank>=parent2.rank)
    {
      parent1.rank = (parent1.rank==parent2.rank)?parent1.rank+1:parent1.rank;
      parent2.parent = parent1;
    }
    else
    {
      parent1.parent = parent2;
    }
  }

  public static int findSet(int data)
  {
    return findSet(map.get(data)).data;
  }

  public static Node findSet(Node node)
  {
    Node parent = node.parent;
    if(node.parent==node)
      return parent;
    node.parent = findSet(node.parent);
    return node.parent;
  }
}