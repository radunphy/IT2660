package com.company;
import java.util.LinkedList;
import java.util.Stack;


// DFSearch class start
public class DFSearch
{
    public DFSearch()
    {}

    public int depthFirst(DFSNode node, LinkedList<DFSNode> list)
    {
        int index = 0;
        Stack<DFSNode> stack = new Stack<DFSNode>();
        stack.add(node);

        while (!stack.isEmpty())
        {
            index++;
            DFSNode currNode = stack.pop();
            if (!currNode.isVisited())
            {
                list.add(currNode);
                currNode.markVisited(true);
            }

            LinkedList<DFSNode> edges = currNode.getEdges();
            for (int i = 0; i < edges.size(); i++)
            {
                index++;
                DFSNode temp = edges.get(i);
                if (temp != null && !temp.isVisited())
                {
                    stack.add(temp);
                }
            }
        }

        return index;
    }
}