package com.company;

// DFSNode class implementation
import java.util.LinkedList;
public class DFSNode
{
    private int data;
    private boolean visited;
    private LinkedList<DFSNode> edges;

    DFSNode(int newData)
    {
        data = newData;
        edges = new LinkedList<DFSNode>();
    }

    public int getData()
    {
        return data;
    }

    public void setData(int newData)
    {
        data = newData;
    }

    public boolean isVisited()
    {
        return visited;
    }

    public void markVisited(boolean newVisited)
    {
        visited = newVisited;
    }

    public void addEdge(DFSNode newEdge)
    {
        edges.add(newEdge);
    }

    public LinkedList<DFSNode> getEdges()
    {
        return edges;
    }

    public void setEdges(LinkedList<DFSNode> newEdges)
    {
        edges = newEdges;
    }

    public String toString()
    {
        return "" + data;
    }
} // end of DFSNode class