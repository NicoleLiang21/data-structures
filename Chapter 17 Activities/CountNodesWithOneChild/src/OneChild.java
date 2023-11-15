import java.util.ArrayList;
import java.util.Stack;

/**
    A binary tree in which each node has two children.
*/
public class OneChild
{
    private Node root;

    /**
        Constructs an empty tree.
    */
    public OneChild() { root = null; }

    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public OneChild(Object rootData)
    {
        root = new Node();
        root.data = rootData;
        root.left = null;
        root.right = null;
    }

    /**
        Constructs a binary tree.
        @param rootData the data for the root
        @param left the left subtree
        @param right the right subtree
    */
    public OneChild(Object rootData, OneChild left, OneChild right)
    {
        root = new Node();
        root.data = rootData;

          if( left != null )
          {
                root.left = left.root;
          }

          if( right != null )
          {
                root.right = right.root;
          }
    }

    class Node
    {
        public Object data;
        public Node left;
        public Node right;
    }

    /**
        Returns the height of the subtree whose root is the given node.
        @param n a node or null
        @return the height of the subtree, or 0 if n is null
    */
    private static int height(Node n)
    {
        if (n == null) { return 0; }
        else { return 1 + Math.max(height(n.left), height(n.right)); }
    }

    /**
        Returns the height of this tree.
        @return the height
    */
    public int height() { return height(root); }

    /**
        Checks whether this tree is empty.
        @return true if this tree is empty
    */
    public boolean isEmpty() { return root == null; }

    /**
        Gets the data at the root of this tree.
        @return the root data
    */
    public Object data() { return root.data; }

    /**
        Gets the left subtree of this tree.
        @return the left child of the root
    */
    public OneChild left()
    {
        OneChild result = new OneChild();
        result.root = root.left;
        return result;
    }

    /**
        Gets the right subtree of this tree.
        @return the right child of the root
    */
    public OneChild right()
    {
        OneChild result = new OneChild();
        result.root = root.right;
        return result;
    }

    /**
     * Count the nodes with one child
     * @return the number of nodes with one child
     */
    public int countNodesWithOneChild()
    {
        Stack<Node> nodes = new Stack<Node>();
        ArrayList<Node> visited = new ArrayList<Node>();
        Node hold;
        int sum = 0;

        // start at the root
        if (root.left != null)
            nodes.push(root.left);
        if (root.right != null)
            nodes.push(root.right);
        
        while (nodes.size() != 0)
        {
            hold = nodes.pop();
            visited.add(hold);
            
            if (hold.left == null && hold.right == null)
                sum++;
            else
            {
                if (root.left != null && !visited.contains(root.left))
                    nodes.push(root.left);
                if (root.right != null && !visited.contains(root.right))
                    nodes.push(root.right);
            }
        }

        return sum;
    }

}