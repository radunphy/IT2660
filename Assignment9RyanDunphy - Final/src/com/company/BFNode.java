package com.company;
import java.util.LinkedList;

public class BFNode
{
    private int data;
    private boolean visited;
    private LinkedList<BFNode> edges;

    public BFNode(int newData)
    {
        data = newData;
        edges = new LinkedList<BFNode>();
    }
    public boolean isVisited()
    {
        return visited;
    }
    public void markVisited(boolean newVisited)
    {
        visited = newVisited;
    }
    public int getData()
    {
        return data;
    }

    public void setData(int newData)
    {
        data = newData;
    }
    public void addEdge(BFNode newEdge)
    {
        edges.add(newEdge);
    }

    public LinkedList<BFNode> getEdges()
    {
        return edges;
    }

    public void setEdges(LinkedList<BFNode> newNeighbours)
    {
        edges = newNeighbours;
    }

    public String toString()
    {
        return "" + data;
    }
} // end of BFNode class