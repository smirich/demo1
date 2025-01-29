package com.example.demo.application;

public class LinkedListManager {

    private int size;
    private Node head;

    public int size()
    {
        return size;
    }

    public boolean addAtIndex(String element, int index)
    {
        if (index < 0 || index > size)
            return false;
        Node nodeToInsert = new Node(element);
        size++;
        if (head == null)
        {
            head = nodeToInsert;
            return true;
        }
        Node shuttle = head;
        for (int i = 0; i < index - 1; i++)
        {
            shuttle = shuttle.getNextNode();
        }
        nodeToInsert.setNextNode(shuttle.getNextNode());
        shuttle.setNextNode(nodeToInsert);
        return true;
    }

    public String getAtIndex(int index) throws Exception
    {
        if (index < 0 || index > size)
        {
            throw new Exception("Bad Index");
        }
        if (head == null)
        {
            return null;
        }
        Node shuttle = head;
        for (int i = 0; i < size; i++)
        {
            shuttle = shuttle.getNextNode();
        }
        return shuttle.getPayload();
    }

    @Override
    public String toString()
    {
        if (head == null)
        {
            return null;
        }
        Node shuttle = head;
        String result = "[";
        for (int i = 0; i < size; i++)
        {
            result += shuttle.getPayload() + ",";
            shuttle = shuttle.getNextNode();
        }
        return result + "]";
    }

    private class Node {
        protected final String payload;
        protected Node nextNode;

        public Node(String payload) {
            this.payload = payload;
        }

        public String getPayload()
        {
            return payload;
        }

        public Node getNextNode()
        {
            return nextNode;
        }

        public void setNextNode(Node nextNode)
        {
            this.nextNode = nextNode;
        }
    }

}
