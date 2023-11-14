import java.util.List;
import java.util.ArrayList;
import java.util.*;

/**
    A tree in which each node has an arbitrary number of children.
*/
public class Branch
{
    
    private Node root;


    static class Node
    {
        public Object data;
        public List<Node> children;

        /**
            Computes the size of the subtree whose root is this node.
            @return the number of nodes in the subtree
        */
        public int size()
        {
            int sum = 1;
            for (Node child : this.children)
                sum += child.size();

            return sum;
        }
    }


    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public Branch(Object rootData)
    {
        this.root = new Node();
        this.root.data = rootData;
        this.root.children = new ArrayList<>();
    }


    /**
        Adds a subtree as the last child of the root.
    */
    public void addSubtree(Branch subtree)
    {
        this.root.children.add(subtree.root);
    }


    /**
        Computes the size of this tree.
        @return the number of nodes in the tree
    */
    public int size() 
    {
        return this.root.size();
    }


    /**
     * Count the number of leaves in the tree
     * @return the number of leaves in the class
     */
    public int leafCount()
    {
        Stack<Node> nodes = new Stack<Node>();
        Node hold;
        int sum = 0;

        for (Node node : this.root.children)
            nodes.push(node);
        
        while (nodes.size() != 0)
        {
            hold = nodes.pop();
            
            if (hold.children.size() == 0)
                sum++;
            else
            {
                for (int i = 0; i < hold.children.size(); i++)
                    nodes.push(hold.children.get(i));
            }
        }

        return sum;
    }

}
