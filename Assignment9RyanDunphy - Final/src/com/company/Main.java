// Ryan Dunphy Final submission.

package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Create the graph and invoke Random class.
        final int nodeCount = 1000;
        Random randomNumber = new Random();

        // Create the linked lists for both algorithms.
        LinkedList<BFNode> bfNodes = new LinkedList<BFNode>();
        LinkedList<DFSNode> dFNodes = new LinkedList<DFSNode>();

        // Loop through graph, print and add random number to nodes.
        for (int i = 0; i < nodeCount; i++)
        {
            int n = 1 + randomNumber.nextInt(100000);
            System.out.println(n);
            bfNodes.add(new BFNode(n));
            dFNodes.add(new DFSNode(n));
        }
        // Loop through nodes, add a random number of connections to other nodes for each node.
        System.out.println();
        for (int i = 0; i < nodeCount; i++)
        {
            int connections = 1 + randomNumber.nextInt(5);

            for (int j = 0; j < connections; j++)
            {
                int k = randomNumber.nextInt(nodeCount);

                bfNodes.get(i).addEdge(bfNodes.get(k));
                dFNodes.get(i).addEdge(dFNodes.get(k));
                int distance = 1 + randomNumber.nextInt(100000);
            }
        }
        // Input an entry to test if it's in the graph.
        Scanner input = new Scanner(System.in);
        System.out.print("Pick a number between 1 and 100,000: ");
        int number = input.nextInt();
        input.close();

        BFNode bfNumNode = findBFNode(bfNodes, number);
        DFSNode dfsNumNode = findDFSNode(dFNodes, number);

        String nodeFound = "Failed";
        int bfLength = 0;
        int bfCount = 0;
        int dfsLength = 0;
        int dfsCount = 0;

        if (bfNumNode != null && dfsNumNode != null)
        {
            nodeFound = "Success, we found it!";

            LinkedList<BFNode> bfList = new LinkedList<BFNode>();
            LinkedList<DFSNode> dfsList = new LinkedList<DFSNode>();


            BFSearch bfObj = new BFSearch();
            bfCount = bfObj.breadthFirst(bfNumNode, bfList);
            bfLength = bfList.size();

            DFSearch dfsObj = new DFSearch();
            dfsCount = dfsObj.depthFirst(dfsNumNode, dfsList);
            dfsLength = dfsList.size();
        }

        System.out.println("Breadth-First - Did we find it: " + nodeFound);
        System.out.println("Length of shortest path = " + bfLength);
        System.out.println("Total number of nodes examined: " + bfCount);
        System.out.println("");
        System.out.println("Depth-First - Did we find it? " + nodeFound);
        System.out.println("Length of shortest path = " + dfsLength);
        System.out.println("Total number of nodes examined: " + dfsCount);
    }

    private static BFNode findBFNode(LinkedList<BFNode> bfsNodes, int number)
    {
        for (int i = 0; i < bfsNodes.size(); i++)
        {
            if (bfsNodes.get(i).getData() == number)
                return bfsNodes.get(i);
        }

        return null;
    }

    private static DFSNode findDFSNode(LinkedList<DFSNode> dfsNodes, int number)
    {
        for (int i = 0; i < dfsNodes.size(); i++)
        {
            if (dfsNodes.get(i).getData() == number)
                return dfsNodes.get(i);
        }

        return null;
    }
}
