package com.company;

import java.util.Queue;
import java.util.LinkedList;
public class BFSearch
{
    public BFSearch()
    {}

    public int breadthFirst(BFNode node, LinkedList<BFNode> list)
    {
        int index = 0;
        Queue<BFNode> queue = new LinkedList<BFNode>();

        queue.add(node);
        node.markVisited(true);

        while (!queue.isEmpty())
        {
            BFNode currNode = queue.remove();
            list.add(currNode);
            LinkedList<BFNode> edges = currNode.getEdges();
            for (int i = 0; i < edges.size(); i++)
            {
                index++;
                BFNode temp = edges.get(i);
                if (temp != null && !temp.isVisited())
                {
                    queue.add(temp);
                    temp.markVisited(true);
                }
            }
        }

        return index;
    }
} // end of BF search algorithm class.